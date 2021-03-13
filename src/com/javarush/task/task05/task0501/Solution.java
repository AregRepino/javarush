package com.javarush.task.task05.task0501;

public class Solution {
    public static void main(String[] args) {

        Cat cat = new Cat();
        String s = "Areg";
       // cat.name = s;
        cat.setName(s);
        System.out.println(cat.getName());

        int age = 10;
        cat.setAge(age);

        System.out.println(cat.getAge());

        int weigh = 4;
        cat.setWeight(weigh);

        System.out.println(cat.getWeight());

        int strength = 8;
        cat.setStrength(strength);

        System.out.println(cat.getStrength());
    }
}
