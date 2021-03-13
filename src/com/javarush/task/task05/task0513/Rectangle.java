package com.javarush.task.task05.task0513;

public class Rectangle {

    private int top;
    private int left;
    private int width;
    private int height;

    public static void main(String[] args) {

    }

    public void initialize (int top){
        this.top = top;
    }

    public void initialize (int top, int left){
        this.top = top;
        this.left =left;
    }

    public void initialize (int top, int left, int width) {
        this.top = top;
        this.left =left;
        this.width = width;
        this.height = width;
    }

    public void initialize (int top, int left, int width, int height){
        this.top = top;
        this.left =left;
        this.width = width;
        this.height = height;
    }
}
