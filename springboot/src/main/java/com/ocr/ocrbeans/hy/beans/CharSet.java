package com.ocr.ocrbeans.hy.beans;


import java.util.List;

public class CharSet {
    private int prob;
    private List<Integer> rect;
    private char char1;

    public int getProb() {
        return prob;
    }

    public void setProb(int prob) {
        this.prob = prob;
    }

    public List<Integer> getRect() {
        return rect;
    }

    public void setRect(List<Integer> rect) {
        this.rect = rect;
    }

    public char getChar1() {
        return char1;
    }

    public void setChar1(char char1) {
        this.char1 = char1;
    }

    @Override
    public String toString() {
        return "CharSet{" +
                "prob=" + prob +
                ", rect=" + rect +
                ", char1=" + char1 +
                '}';
    }
}
