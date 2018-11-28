package com.ocr.ocrbeans.ali.beans;

import java.util.List;

public class Prism_WordsInfo {
    private String word;
    private int prob;
    private List<Pos> pos;
    private List<CharInfo> charInfo;
    private int tableId;
    private int tableCellId;



    @Override
    public String toString() {
        return "Prism_WordsInfo{" +
                "word='" + word + '\'' +
                ", prob=" + prob +
                ", pos=" + pos +
                ", charInfo=" + charInfo +
                ", tableId=" + tableId +
                ", tableCellId=" + tableCellId +
                '}';
    }

    public void setProb(int prob) {
        this.prob = prob;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }


    public List<Pos> getPos() {
        return pos;
    }

    public void setPos(List<Pos> pos) {
        this.pos = pos;
    }

    public List<CharInfo> getCharInfo() {
        return charInfo;
    }

    public void setCharInfo(List<CharInfo> charInfo) {
        this.charInfo = charInfo;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getTableCellId() {
        return tableCellId;
    }

    public void setTableCellId(int tableCellId) {
        this.tableCellId = tableCellId;
    }
}
