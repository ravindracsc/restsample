package com.example.api.filesample;

/**
 * Updated  by ravindra on 21 */
public class FileSampleResource {
    private String id;
    private int number;
    private String text;
// sample code has been added
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
