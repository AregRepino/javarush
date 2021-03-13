package com.javarush.task.task20.task2007;

import com.javarush.task.task14.task1411.Person;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Solution implements Serializable {

    public static class JavaRush implements Serializable {

        public List<User> users = new ArrayList<>();

    }

    public static void main(String[] args) {

    }
}


//    Сделай так, чтобы сериализация класса JavaRush была возможной.
//
//        Требования:
//        •	Класс JavaRush должен существовать внутри класса Solution.
//        •	Класс JavaRush должен быть статическим.
//        •	Класс JavaRush должен быть публичным.
//        •	Должна быть возможна сериализация класса JavaRush.