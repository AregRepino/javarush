package com.javarush.task.task05.task0505;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat = new Cat("conor", 33, 77,40);
        Cat cat1 = new Cat("habib",  30,77,37);
        Cat cat2 = new Cat("toni",  31,77,38);

        boolean r = cat1.fight(cat);
        boolean w = cat.fight(cat2);


        System.out.println(cat.fight(cat1));
        System.out.println(r);
        System.out.println(w);
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
