package com.ocr.ocrbeans.hh.beans.beans;

import java.util.List;

public class HHBean {
    private String error_msg;
    private int lineNum;
    private int error_code;
    private List<String> linesText;

    @Override
    public String toString() {
        return "HHBean{" +
                "error_msg='" + error_msg + '\'' +
                ", lineNum=" + lineNum +
                ", error_code=" + error_code +
                ", linesText=" + linesText +
                '}';
    }

    public String getError_msg() {
        return error_msg;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
    }

    public int getLineNum() {
        return lineNum;
    }

    public void setLineNum(int lineNum) {
        this.lineNum = lineNum;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<String> getLinesText() {
        return linesText;
    }

    public void setLinesText(List<String> linesText) {
        this.linesText = linesText;
    }
}
