package com.javarush.task.task08.task0803;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static Map<String, Cat> addCatsToMap(String[] cats) {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<>();


        for (String name : cats){
            Cat cat = new Cat(name);
            map.put(name, cat);
        }
        return map;



    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}

//
//    Есть класс Cat с полем имя (name, String).
//        Создать коллекцию Map<String, Cat> (реализация HashMap).
//        Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
//        Вывести результат на экран, каждый элемент с новой строки.
//
//        Требования:
//        •	Программа не должна считывать значения с клавиатуры.
//        •	В методе addCatsToMap() объяви переменную коллекции Map с типом элементов String, Cat и сразу проинициализируй ee.
//        •	Метод addCatsToMap() должен добавлять в коллекцию всех котов из массива String[] cats, согласно условию.
//        •	Программа должна выводить содержимое коллекции на экран, каждую пару через дефис и с новой строки.