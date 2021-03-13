package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        int min = Integer.MAX_VALUE;


        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);

            int l = s.length();

            if (l < min) {

                min = l;

            }
        }
// areg nikita pasha   min = 4;
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);

            int length = element.length();


            if (length == min) {

                System.out.println(element);
            }

        }





    }
}
