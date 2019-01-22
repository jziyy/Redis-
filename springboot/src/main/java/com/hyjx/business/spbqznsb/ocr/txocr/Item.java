package com.hyjx.business.spbqznsb.ocr.txocr;

import java.util.List;

public class Item {
    private ItemCoord itemCoord;
    private List<Word> words;
    private String itemstring;

    @Override
    public String toString() {
        return "Item{" +
                "itemCoord=" + itemCoord +
                ", words=" + words +
                ", itemstring='" + itemstring + '\'' +
                '}';
    }

    public ItemCoord getItemCoord() {
        return itemCoord;
    }

    public void setItemCoord(ItemCoord itemCoord) {
        this.itemCoord = itemCoord;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public String getItemstring() {
        return itemstring;
    }

    public void setItemstring(String itemstring) {
        this.itemstring = itemstring;
    }
}
