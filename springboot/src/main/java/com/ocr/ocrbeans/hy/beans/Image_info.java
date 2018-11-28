package com.ocr.ocrbeans.hy.beans;

public class Image_info {
    private int image_dir;
    private int height;
    private int width;

    @Override
    public String toString() {
        return "Image_info{" +
                "image_dir=" + image_dir +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    public int getImage_dir() {
        return image_dir;
    }

    public void setImage_dir(int image_dir) {
        this.image_dir = image_dir;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
