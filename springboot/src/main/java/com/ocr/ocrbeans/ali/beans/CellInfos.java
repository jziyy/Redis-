package com.ocr.ocrbeans.ali.beans;

import java.util.List;

public class CellInfos {
    private int tableCellId;
    private String word;
    private int xsc;
    private int xec;
    private int ysc;
    private int yec;
    List<Pos>  pos;

    @Override
    public String toString() {
        return "CellInfos{" +
                "tableCellId=" + tableCellId +
                ", word='" + word + '\'' +
                ", xsc=" + xsc +
                ", xec=" + xec +
                ", ysc=" + ysc +
                ", yec=" + yec +
                ", pos=" + pos +
                '}';
    }

    public int getTableCellId() {
        return tableCellId;
    }

    public void setTableCellId(int tableCellId) {
        this.tableCellId = tableCellId;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getXsc() {
        return xsc;
    }

    public void setXsc(int xsc) {
        this.xsc = xsc;
    }

    public int getXec() {
        return xec;
    }

    public void setXec(int xec) {
        this.xec = xec;
    }

    public int getYsc() {
        return ysc;
    }

    public void setYsc(int ysc) {
        this.ysc = ysc;
    }

    public int getYec() {
        return yec;
    }

    public void setYec(int yec) {
        this.yec = yec;
    }

    public List<Pos> getPos() {
        return pos;
    }

    public void setPos(List<Pos> pos) {
        this.pos = pos;
    }
}
