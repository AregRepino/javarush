package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;


    static {
        readKeyFromConsoleAndInitPlanet();
    }

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String key = null;

        try {
            key = reader.readLine();
            if (key.equals(Planet.SUN)) {
                thePlanet = Sun.getInstance();
                //thePlanet = Sun.getInstance();
                //Sun sun1 = Sun.getInstance();
            } else if (key.equals(Planet.EARTH)) {
                thePlanet = Earth.getInstance();
            } else if (key.equals(Planet.MOON)) {
                thePlanet = Moon.getInstance();
            } else {
                thePlanet = null;
            }

        } catch (Exception e) {
            e.getStackTrace();
        }


    }
}

//
//1. Найти пример реализации паттерна Singleton с ленивой реализацией(lazy initialization). Используй свой любимый поисковик(например google).
//        2. По образу и подобию в отдельных файлах создай три класса синглтона Sun, Moon, Earth.
//        3. Реализуй интерфейс Planet в классах Sun, Moon, Earth.
//        4. В статическом блоке класса Solution вызови метод readKeyFromConsoleAndInitPlanet.
//        5. Реализуй функционал метода readKeyFromConsoleAndInitPlanet:
//        5.1. С консоли считай один параметр типа String.
//        5.2. Если параметр равен одной из констант интерфейса Planet, создай соответствующий объект и присвой его Planet thePlanet, иначе обнулить Planet thePlanet.
//
//        Требования:
//        •	Класс Sun не должен позволять создавать объекты своего типа за пределами класса.
//        •	Класс Sun должен содержать приватное статическое поле instance типа Sun.
//        •	В классе Sun должен быть реализован публичный статический метод getInstance(), возвращающий значение поля instance.
//        •	Метод getInstance() в классе Sun должен всегда возвращать один и тот же объект.
//        •	Поле instance должно быть инициализировано только после первого обращения к методу getInstance().
//        •	Класс Moon не должен позволять создавать объекты своего типа за пределами класса.
//        •	Класс Moon должен содержать приватное статическое поле instance типа Moon.
//        •	В классе Moon должен быть реализован публичный статический метод getInstance(), возвращающий значение поля instance.
//        •	Метод getInstance() в классе Moon должен всегда возвращать один и тот же объект.
//        •	Поле instance должно быть инициализировано только после первого обращения к методу getInstance().
//        •	Класс Earth не должен позволять создавать объекты своего типа за пределами класса.
//        •	Класс Earth должен содержать приватное статическое поле instance типа Earth.
//        •	В классе Earth должен быть реализован публичный статический метод getInstance(), возвращающий значение поля instance.
//        •	Метод getInstance в классе Earth должен всегда возвращать один и тот же объект.
//        •	Поле instance должно быть инициализировано только после первого обращения к методу getInstance().
//        •	Метод readKeyFromConsoleAndInitPlanet() должен быть вызван в статическом блоке класса Solution.
//        •	Метод readKeyFromConsoleAndInitPlanet() должен считывать одну строку с клавиатуры.
//        •	Метод readKeyFromConsoleAndInitPlanet() должен корректно обновлять значение переменной thePlanet в соответствии с условием задачи.
//        •	Классы Sun, Moon и Earth должны быть созданы в отдельных файлах.