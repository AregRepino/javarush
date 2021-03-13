package com.javarush.task.task05.task0516;

public class Friend {

    private String name;
    private int age;
    private char sex;

    public Friend (String name){
        this.name = name;
    }

    public Friend (String name, int age){
        this.name = name;
        this.age = age;
    }

    public Friend (String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

        Friend friend = new Friend("areg");

        Friend friend1 = new Friend("areg", 26);

        Friend friend2 = new Friend("areg", 33, 'm');



    }


}
