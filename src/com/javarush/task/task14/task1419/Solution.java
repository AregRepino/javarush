package com.javarush.task.task14.task1419;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Exception> exceptions = new ArrayList<>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }


        try {
            FileInputStream fileInputStream = new FileInputStream("are.txt");
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }


        try {
            exceptions.get(3);

        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }


        int[] array = new int[3];

        try {
            int i = array[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            Integer.parseInt("areg");
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        String s = null;

        try {
            s.trim();
        } catch (NullPointerException e) {
            exceptions.add(e);
        }


        exceptions.add(new IOException());

        exceptions.add(new StringIndexOutOfBoundsException());

        exceptions.add(new SecurityException());

        exceptions.add(new SocketException());

        //напишите тут ваш код

    }




}
