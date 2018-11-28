package com.ocr.ocrbeans.bd.beans;

public class Ocr_Chars_Info {
    private String char1;

    private Ocr_Chars_Location location;

    public String getChar1() {
        return char1;
    }

    public void setChar1(String char1) {
        this.char1 = char1;
    }


    public Ocr_Chars_Location getLocation() {
        return location;
    }

    public void setLocation(Ocr_Chars_Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Ocr_Chars_Info{" +
                "char1='" + char1 + '\'' +
                ", location=" + location +
                '}';
    }
}
