package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        while (true) {
            key = reader.readLine();
            if (key.equals("user")) {
                person = new Person.User();
            } else if (key.equals("loser")) {
                person = new Person.Loser();
            } else if (key.equals("coder")) {
                person = new Person.Coder();
            } else if (key.equals("proger")) {
                person = new Person.Proger();
            } else {
                break;
            }


            //создаем объект, пункт 2

            doWork(person); //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User) {
            Person.User user = (Person.User)person;
            user.live();
            //( (Person.User) person ).live();
        } else if (person instanceof Person.Loser) {
            Person.Loser loser = (Person.Loser)person;
            loser.doNothing();
        }
        else if (person instanceof Person.Coder) {
            Person.Coder coder = (Person.Coder)person;
            coder.writeCode();
        }
        else if (person instanceof Person.Proger) {
            Person.Proger proger = (Person.Proger)person;
            proger.enjoy();
        }
    }
}


//1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
//        Строки(ключи) могут быть такими: "user", "loser", "coder", "proger".
//        Ввод окончен, когда строка не совпадает ни с одной из выше указанных.
//
//        2. Для каждой введенной строки нужно:
//        2.1. Создать соответствующий объект [см. Person.java], например, для строки "user" нужно создать объект класса User.
//        2.2. Передать этот объект в метод doWork.
//
//        3. Написать реализацию метода doWork, который:
//        3.1. Вызывает метод live() у переданного объекта, если этот объект (person) имеет тип User.
//        3.2. Вызывает метод doNothing(), если person имеет тип Loser.
//        3.3. Вызывает метод writeCode(), если person имеет тип Coder.
//        3.4. Вызывает метод enjoy(), если person имеет тип Proger.
//
//        Требования:
//        •	Метод main должен считывать строки с клавиатуры.
//        •	Метод main должен прекращать считывать строки с клавиатуры, как только введенная строка не совпадает с одной из ожидаемых(user, loser, coder, proger).
//        •	Для каждой корректной(user, loser, coder, proger) введенной строки должен быть вызван метод doWork с соответствующим объектом класса Person в качестве параметра.
//        •	В классе Solution должен быть реализован метод doWork с одним параметром типа Person.
//        •	Метод doWork должен вызывать метод live() у переданного объекта, если этот объект имеет тип User.
//        •	Метод doWork должен вызывать метод doNothing() у переданного объекта, если этот объект имеет тип Loser.
//        •	Метод doWork должен вызывать метод writeCode() у переданного объекта, если этот объект имеет тип Coder.
//        •	Метод doWork должен вызывать метод enjoy() у переданного объекта, если этот объект имеет тип Proger.