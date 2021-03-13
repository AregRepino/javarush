package com.javarush.task.task14.task1405;

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;


        foodMethods(food);
        selectableMethods(selectable);
    }

    public static void foodMethods(Food food) {
        //тут добавьте вызов методов для переменной food
        food.onEat();
        food.onSelect();

    }

    public static void selectableMethods(Selectable selectable) {
        //тут добавьте вызов методов для переменной selectable
        selectable.onSelect();

    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable {
        public void onEat() {
            System.out.println("The food was eaten");
        }

        public void onSelect() {
            System.out.println("The food was selected");
        }
    }
}



//1. Реализовать интерфейс Selectable в классе Food.
//        2. Метод onSelect() должен выводить на экран фразу "The food was selected".
//        3. Подумай, какие методы можно вызвать для переменной food и какие для selectable.
//        4. В методе foodMethods вызови методы onSelect, onEat, если это возможно.
//        5. В методе selectableMethods вызови методы onSelect, onEat, если это возможно.
//        6. Явное приведение типов не использовать.
//
//        Требования:
//        •	Интерфейс Selectable должен быть реализован в классе Food.
//        •	Метод onSelect() в классе Food должен выводить на экран фразу "The food was selected".
//        •	В методе foodMethods должны вызываться методы объекта типа Food.
//        •	В методе selectableMethods должны вызываться методы доступные у любого объекта реализующего интерфейс Selectable.