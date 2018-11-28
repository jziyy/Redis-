package com.ocr.ocrbeans.bd.beans;

public class Ocr_access_token {
    private String id;
    private String client_id;
    private String client_secret;
    private String access_token;


    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    @Override
    public String toString() {
        return "Ocr_access_token{" +
                "id='" + id + '\'' +
                ", client_id='" + client_id + '\'' +
                ", client_secret='" + client_secret + '\'' +
                ", access_token='" + access_token + '\'' +
                '}';
    }
}
