package org.example;

public class Area {

    private int len;
    private int width;

    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getLen() {
        return len;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public void getRectabgularArea(){

        System.out.println(len*width);

    }

    public void getSquareArea(){
        System.out.println(len*len);
    }
}
