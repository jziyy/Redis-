package com.ocr.ocrbeans.bd.beans;

public class Ocr_Chars_Location {
    private int width;
    private int top;
    private int left;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Ocr_Chars_Location{" +
                "width=" + width +
                ", top=" + top +
                ", left=" + left +
                ", height=" + height +
                '}';
    }
}
