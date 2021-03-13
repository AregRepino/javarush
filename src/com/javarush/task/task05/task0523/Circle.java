package com.javarush.task.task05.task0523;

public class Circle {
    public Color color;
// объявленеие метод
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }
// объявленеие класса
    public  Circle() {
        color = new Color();
    }
// объявленеие класса
    public class Color {
        String description;
// конструктор
        public Color() {

        }
// объявленеие метод
        public String getDescription() {
            return description;
        }
// объявленеие метод
        public void setDescription(String description) {
            this.description = description;
        }
    }

}


//Разберись, что делает программа.
//        Найди и исправь одну ошибку в классе Circle. Метод main изменять нельзя.
//
//        Подсказка:
//        изучи конструктор по умолчанию.
//
//        Требования:
//        •	Программа не должна считывать данные с клавиатуры.
//        •	Метод main изменять нельзя.
//        •	Программа должна вывести слово "Red" на экран.
//        •	Метод getDescription класса Color должен возвращать значение переменной description.
//        •	Метод setDescription класса Color должен устанавливать значение переменной description.
//
