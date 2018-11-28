package com.ocr.ocrbeans.hy.beans;

public class Rect {
    private Integer height;
    private Integer left;
    private Integer top;
    private Integer width;

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getLeft() {
        return left;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rect{" +
                "height=" + height +
                ", left=" + left +
                ", top=" + top +
                ", width=" + width +
                '}';
    }
}
