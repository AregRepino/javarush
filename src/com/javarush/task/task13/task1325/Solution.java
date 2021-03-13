package com.javarush.task.task13.task1325;
import java.awt.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public  static class BigFox extends Fox {

//        public String getName() {
//            return "BigFox";
//        }

        @Override
        public Color getColor() {
            return Color.pink;
        }
    }

}


//1. Исправь классы Fox и BigFox так, чтобы программа компилировалась.
//        Задача не предполагает создания экземпляров базового класса.
//        2. Метод main менять нельзя.
//
//        Требования:
//        •	Интерфейс Animal должен быть реализован в классе Fox.
//        •	В классе Fox должен быть реализован только один метод(getName).
//        •	В интерфейсе Animal должен быть объявлен метод getColor.
//        •	Класс BigFox должен быть потомком класса Fox.
//        •	Класс Fox должен быть абстрактным.