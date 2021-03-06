package com.javarush.task.task13.task1324;
import java.awt.*;
public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}


//1. Унаследовать Fox от интерфейса Animal.
//        2. Поменяй код так, чтобы в классе Fox был только один метод - getName.
//        3. Методы удалять нельзя!
//
//        Требования:
//        •	Интерфейс Animal должен быть реализован в классе Fox.
//        •	В классе Fox должен быть реализован только один метод(getName).
//        •	В интерфейсе Animal должен быть объявлен метод getColor.
//        •	Дополнительные классы или интерфейсы создавать нельзя.