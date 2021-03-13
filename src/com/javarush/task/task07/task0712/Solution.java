package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {

            String s = reader.readLine();
            list.add(s);
        }

        int max = 0;
        int min = Integer.MAX_VALUE;

        // areg

        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);

            int length = element.length();

            if (length > max) {
                max = length;
            }

            if (length < min) {

                min = length;

            }

        }



        for (int i = 0; i < list.size(); i++) {

            String  element = list.get(i);

            int length = element.length();

            if (length == max || length == min){
                System.out.println(element);

                break;
            }



        }




    }
}
