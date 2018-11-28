package com.ocr.test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.MemoryImageSource;
import java.io.File;
import java.io.FileInputStream;


public class ImageIOer {
    /**
     * Read a bmp image
     * @param filePath - the image file to read
     * @return an Image object of the image
     */
    public Image myRead(String filePath) {
        try {
            // the length of BMP file header
            int bfLen = 14;

            // the length of BMP information header
            int biLen = 40;
            FileInputStream fs = new FileInputStream(filePath);
            byte[] bf = new byte[bfLen];
            byte[] bi = new byte[biLen];

            // read BMP file header
            fs.read(bf, 0, bfLen);
            // read BMP information header
            fs.read(bi, 0, biLen);

            // pixels value of width
            int biWidth = ((((int) bi[7] & 0xff) << 24) |
                    (((int) bi[6] & 0xff) << 16) | (((int) bi[5] & 0xff) << 8) |
                    ((int) bi[4] & 0xff));

            // pixels value of height
            int biHeight = (((int) bi[11] & 0xff) << 24) |
                    (((int) bi[10] & 0xff) << 16) | (((int) bi[9] & 0xff) << 8) |
                    ((int) bi[8] & 0xff);

            // the number of bits of each pixel
            int biBitCount = ((((int) bi[15] & 0xff) << 8) |
                    ((int) bi[14] & 0xff));

            // the size of bytes of the image
            int biSizeImage = ((((int) bi[23] & 0xff) << 24) |
                    (((int) bi[22] & 0xff) << 16) | (((int) bi[21] & 0xff) << 8) |
                    ((int) bi[20] & 0xff));

            // only processes 24bits bmp image
            if (biBitCount != 24) {
                fs.close();

                return null;
            }

            // the number of bytes to be padded after each row
            int nPad = (biSizeImage / biHeight) - (biWidth * 3);

            // read pixels data from image into a byte array
            byte[] bRGB = new byte[biSizeImage];
            fs.read(bRGB, 0, biSizeImage);
            fs.close();

            int index = 0;
            int[] data = new int[biWidth * biHeight];

            // store pixels in an array of int type
            for (int i = biHeight - 1; i >= 0; i--) {
                for (int j = 0; j < biWidth; j++) {
                    data[(i * biWidth) + j] = (((int) 255 << 24) |
                            (((int) bRGB[index + 2] & 0xff) << 16) |
                            (((int) bRGB[index + 1] & 0xff) << 8) |
                            ((int) bRGB[index] & 0xff));
                    index += 3;
                }

                index += nPad;
            }

            // create an Image object
            Toolkit kit = Toolkit.getDefaultToolkit();
            Image image = kit.createImage(new MemoryImageSource(biWidth,
                    biHeight, data, 0, biWidth));

            return image;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Caught exception in loadbitmap!");
        }

        return null;
    }

    /**
     * Store an Image as a bmp image file
     * @param image - Image object to be saved as a bmp image file
     * @param filePath - the name of the bmp image file
     * @return the Image object
     */
    public Image myWrite(Image image, String filePath) {
        try {
            File imgFile = new File(filePath + ".bmp");
            BufferedImage bi = new BufferedImage(image.getWidth(null),
                    image.getHeight(null), BufferedImage.TYPE_INT_RGB);
            Graphics2D biContext = bi.createGraphics();

            // get a BufferedImage object from an Image object
            biContext.drawImage(image, 0, 0, null);
            biContext.dispose();
            ImageIO.write(bi, "bmp", imgFile);

            return image;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        return null;
    }
}