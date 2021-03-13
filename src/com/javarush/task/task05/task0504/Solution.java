package com.javarush.task.task05.task0504;

public class Solution {



    public static void main(String[] args) {
        //напишите тут ваш код

        Cat cat = new Cat("Vasa", 20, 14, 40);
        Cat cat1 = new Cat("Stepa", 22, 17, 43);
        Cat cat2 = new Cat("Ravshan", 29, 20, 48);
        Cat cat3 = new Cat();
        Cat cat4 = new Cat("Richi");
        Cat cat5 = new Cat("shit", 34);
        Cat cat6 = new Cat("byzi", 34, 21);
        Cat cat7 = new Cat(26, "reg");

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;



        public Cat(){

        }

        public Cat (String name){
            this.name = name;

        }

        public  Cat (String name, int age){
            this.name =name;
            this.age = age;
        }

        public  Cat (String name, int age, int weight){
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public Cat (int weight, String name){
            this.name = name;
            this.weight = weight;
        }

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}

//    Пару задач назад студенты секретного центра JavaRush создавали класс Cat. Теперь пришла пора реализовать котов во плоти, разумеется по образу и подобию класса Cat, а точнее - основываясь на нём, как на шаблоне. Их - котов - должно быть трое. Наполните этих троих жизнью, то есть, конкретными данными.
//
//        Требования:
//        •	Программа не должна считывать данные с клавиатуры.
//        •	Нужно создать три объекта типа Cat.
//        •	Класс Cat нельзя изменять.
//        •	Программа не должна выводить данные на экран.

