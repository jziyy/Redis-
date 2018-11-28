package com.ocr.ocrbeans.tx.beans;

import java.util.List;

public class TXData {
    private List<Item> items;
    private List<String> recognize_warn_msg;
    private List<String> recognize_warn_code;
    private String session_id;
    private double angle;
    private List<String> class1;

    @Override
    public String toString() {
        return "TXData{" +
                "items=" + items +
                ", recognize_warn_msg=" + recognize_warn_msg +
                ", recognize_warn_code=" + recognize_warn_code +
                ", session_id='" + session_id + '\'' +
                ", angle=" + angle +
                ", class1=" + class1 +
                '}';
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<String> getRecognize_warn_msg() {
        return recognize_warn_msg;
    }

    public void setRecognize_warn_msg(List<String> recognize_warn_msg) {
        this.recognize_warn_msg = recognize_warn_msg;
    }

    public List<String> getRecognize_warn_code() {
        return recognize_warn_code;
    }

    public void setRecognize_warn_code(List<String> recognize_warn_code) {
        this.recognize_warn_code = recognize_warn_code;
    }

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public List<String> getClass1() {
        return class1;
    }

    public void setClass1(List<String> class1) {
        this.class1 = class1;
    }
}
