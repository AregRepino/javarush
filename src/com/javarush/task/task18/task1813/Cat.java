package com.javarush.task.task18.task1813;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Cat {

    public  static void main(String[] args) throws FileNotFoundException {
        Cat cat = new Cat();

        String s = "repino";

        File file = new File(s);


        FileInputStream fileInputStream = new FileInputStream(file);
        FileInputStream fileInputStream1 = new FileInputStream(new File(new String("a")));
    }
}
