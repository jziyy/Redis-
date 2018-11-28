package com.ocr.ocrbeans.tx.beans;

public class Word {
    private String character;
    private int confidence;

    @Override
    public String toString() {
        return "Word{" +
                "character='" + character + '\'' +
                ", confidence=" + confidence +
                '}';
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public int getConfidence() {
        return confidence;
    }

    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }
}
