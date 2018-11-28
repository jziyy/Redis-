package com.ocr.ocrbeans.hy.beans;

import java.util.List;

public class Ret {
    private CharSet charset;
    private String word;
    private  List<List<Integer>> poly_locations;

    public List<List<Integer>> getPoly_locations() {
        return poly_locations;
    }

    public void setPoly_locations(List<List<Integer>> poly_locations) {
        this.poly_locations = poly_locations;
    }
    //  private Map<String,Integer [] []> poly_locations;

//    public Map<String, Integer[][]> getPoly_locations() {
//        return poly_locations;
//    }

//    public void setPoly_locations(Map<String, Integer[][]> poly_locations) {
//        this.poly_locations = poly_locations;
//    }

    private Double line_score;
    private Rect rect;

    public CharSet getCharset() {
        return charset;
    }

    public void setCharset(CharSet charset) {
        this.charset = charset;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }



    public Double getLine_score() {
        return line_score;
    }

    public void setLine_score(Double line_score) {
        this.line_score = line_score;
    }

    public Rect getRect() {
        return rect;
    }

    public void setRect(Rect rect) {
        this.rect = rect;
    }

    @Override
    public String toString() {
        return "Ret{" +
                "charset=" + charset +
                ", word='" + word + '\'' +
                ", poly_locations=" + poly_locations +
                ", line_score=" + line_score +
                ", rect=" + rect +
                '}';
    }
}
