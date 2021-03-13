package com.javarush.task.task06.task0621;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String dedName = reader.readLine();
        Cat catDed = new Cat(dedName);

        String babaName = reader.readLine();
        Cat catBaba = new Cat(babaName);

        String papaName = reader.readLine();
        Cat catPapa = new Cat(papaName, null, catDed);

        String mamaName = reader.readLine();
        Cat catMama = new Cat(mamaName, catBaba, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMama, catPapa);

        String dochName = reader.readLine();
        Cat catDoch = new Cat(dochName, catMama, catPapa);




        System.out.println(catDed);
        System.out.println(catBaba);
        System.out.println(catPapa);
        System.out.println(catMama);
        System.out.println(catSon);
        System.out.println(catDoch);


    }

    public static class Cat {
        private String name;
        private Cat catMama;
        private Cat catPapa;


        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat catMama, Cat catPapa) {
            this.name = name;
            this.catMama = catMama;
            this.catPapa = catPapa;

        }

//        public String toString(){
//            return this.name;
//        }

        @Override
        public String toString() {
            if (catMama == null && catPapa == null) {
                return "The cat's name is " + name + ", no mother, no father";
            } else if (catMama == null && catPapa != null){
                return "The cat's name is " + name + ", no mother, father is " + catPapa.name;
            } else if (catMama != null && catPapa == null){
                return "The cat's name is " + name + ", mother is " + catMama.name + ", no father";

            } else {
                return "The cat's name is " + name + ", mother is " + catMama.name + ", father is " + catPapa.name;
            }
        }
    }
}


//Задача: У каждой кошки есть имя и кошка-мама.
//        Создать класс, который бы описывал данную ситуацию.
//        Создать два объекта: кошку-дочь и кошку-маму.
//        Вывести их на экран.
//
//        Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
//        Изменить класс Cat так, чтобы он мог описать данную ситуацию.
//        Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
//        Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.
//
//        Пример ввода:
//        дедушка Вася
//        бабушка Мурка
//        папа Котофей
//        мама Василиса
//        сын Мурчик
//        дочь Пушинка
//
//        Пример вывода:
//        The cat's name is дедушка Вася, no mother, no father
//        The cat's name is бабушка Мурка, no mother, no father
//        The cat's name is папа Котофей, no mother, father is дедушка Вася
//        The cat's name is мама Василиса, mother is бабушка Мурка, no father
//        The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
//        The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
//
//        Требования:
//        •	Программа должна считывать имена 6 котов в указанном порядке.
//        •	Метод main должен создавать 6 объектов типа Cat.
//        •	Программа должна выводить 6 строк с информацией о котах.
//        •	Строка про дедушку (первая) должна соответствовать условию.
//        •	Строка про бабушку (вторая) должна соответствовать условию.
//        •	Строка про папу (третья) должна соответствовать условию.
//        •	Строка про маму (четвертая) должна соответствовать условию.
//        •	Строка про сына (пятая) должна соответствовать условию.
//        •	Строка про дочь (шестая) должна соответствовать условию.

