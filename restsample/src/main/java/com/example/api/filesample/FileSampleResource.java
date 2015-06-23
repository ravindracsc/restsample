package com.example.api.filesample;

/**
 * Created by ikeya on 15/06/24.
 */
public class FileSampleResource {
    private String id;
    private int number;
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
