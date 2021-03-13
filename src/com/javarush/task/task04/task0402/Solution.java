package com.javarush.task.task04.task0402;

public class Solution {
    public static void main(String[] args) {
        // создание объекта apple
        Apple apple = new Apple();
        // вызов метод apple.addPrice  и с () -входными параментрами 50
        apple.addPrice(50);
        // вызов метод apple.addPrice  и с () -входными параментрами 100
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        // вывод текста на экран
        System.out.println("Стоимость яблок " + Apple.applesPrice);
    }
        // публичный , пренедлежит обшиму классу перемена , класс Apple
    public static class Apple {
        // static пренадлежит объшиму классу
        public static int applesPrice = 0;
// метод addPrice публичный , пренадлежит обшему класс , ничего не возрошает  () - имеет взодные параментры (int applesPrice)
        public static void addPrice(int applesPrice) {
            // когда есть два  одинаковых имяни, то разлечат их по полному имяни ,
            // например статическая переменая applesPrice , доступно по имяни класса Apple.applePrice
//  увеличивать стоимость яблок Apple.apples~Price на переданное значение. (apple.Price)
          Apple.applesPrice = Apple.applesPrice + applesPrice;


            //напишите тут ваш код



        }
    }
}


//    Подсчитать суммарную стоимость яблок.
//        За суммарную стоимость яблок отвечает переменная public static int applesPrice.
//        Требования:
//        •	Программа должна выводить текст на экран.
//        •	Метод addPrice класса Apple не должен выводить текст на экран.
//        •	Переменная applesPrice класса Apple должна быть статической, иметь тип int и проинициализирована нулем.
//        •	Метод main должен вызывать метод addPrice только два раза.
//        •	Метод addPrice класса Apple должен увеличивать стоимость яблок на переданное значение.