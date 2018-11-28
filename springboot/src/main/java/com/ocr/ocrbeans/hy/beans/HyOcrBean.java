package com.ocr.ocrbeans.hy.beans;

import java.util.List;

public class HyOcrBean {
    private Image_info image_info;
    private List<Ret> ret;

    public Image_info getImage_info() {
        return image_info;
    }

    public void setImage_info(Image_info image_info) {
        this.image_info = image_info;
    }

    public List<Ret> getRet() {
        return ret;
    }

    public void setRet(List<Ret> ret) {
        this.ret = ret;
    }

    @Override
    public String toString() {
        return "HyOcrBean{" +
                "image_info=" + image_info +
                ", ret=" + ret +
                '}';
    }
}
