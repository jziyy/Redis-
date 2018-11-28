package com.ocr.ocrbeans.ali.beans;

import java.util.List;

public class AlOcrBean {
    private String sid;
    private String prism_version;
    private int prism_wnum;
    private int angle;
    private List<Prism_WordsInfo> prism_wordsInfo;
    private Prism_TablesInfo prism_tablesInfo;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getPrism_version() {
        return prism_version;
    }

    public void setPrism_version(String prism_version) {
        this.prism_version = prism_version;
    }

    public int getPrism_wnum() {
        return prism_wnum;
    }

    public void setPrism_wnum(int prism_wnum) {
        this.prism_wnum = prism_wnum;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public List<Prism_WordsInfo> getPrism_wordsInfo() {
        return prism_wordsInfo;
    }

    public void setPrism_wordsInfo(List<Prism_WordsInfo> prism_wordsInfo) {
        this.prism_wordsInfo = prism_wordsInfo;
    }

    public Prism_TablesInfo getPrism_tablesInfo() {
        return prism_tablesInfo;
    }

    public void setPrism_tablesInfo(Prism_TablesInfo prism_tablesInfo) {
        this.prism_tablesInfo = prism_tablesInfo;
    }

    @Override
    public String toString() {
        return "AlOcrBean{" +
                "sid='" + sid + '\'' +
                ", prism_version='" + prism_version + '\'' +
                ", prism_wnum=" + prism_wnum +
                ", angle=" + angle +
                ", prism_wordsInfo=" + prism_wordsInfo +
                ", prism_tablesInfo=" + prism_tablesInfo +
                '}';
    }
}
