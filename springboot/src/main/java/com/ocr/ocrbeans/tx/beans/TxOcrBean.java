package com.ocr.ocrbeans.tx.beans;

public class TxOcrBean {
    private int code;
    private String message;
    private TXData data;

    @Override
    public String toString() {
        return "TxOcrBean{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public TXData getData() {
        return data;
    }

    public void setData(TXData data) {
        this.data = data;
    }
}
