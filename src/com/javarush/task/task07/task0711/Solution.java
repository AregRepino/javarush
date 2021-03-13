package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {

            String s = reader.readLine();
            list.add(s);
        }
//      areg papa mama alisa alina
//      alina areg papa mama alisa
        for (int i = 0; i < 13; i++) {

           // String s = list.get(list.size() - 1);

            String s = list.remove(list.size() - 1);
            list.add(0, s);

        }


        for (int i = 0; i < list.size(); i++) {

            String element = list.get(i);

            System.out.println(element);

        }


    }
}
