package com.ocr.ocrbeans.bd.beans;

public class Ocr_Coordinate {
    private  int y;

    private  int x;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Ocr_Coordinate{" +
                "y=" + y +
                ", x=" + x +
                '}';
    }
}
