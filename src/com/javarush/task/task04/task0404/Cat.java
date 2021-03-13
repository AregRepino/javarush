package com.javarush.task.task04.task0404;

public class Cat {
    // private приватный статичный  int целое  = - пресвоение
    private static int catsCount = 0;
// addNewCat метод (int catsCount) - входные параментры
    public static void addNewCat(int catsCount) {
        //напишите тут ваш код
        // мы увеличиваем переменую класса (Cat.catsCont) на переданое значение (catsCount)
        Cat.catsCount = Cat.catsCount + catsCount;

    }

//  метод addNewCat () - не имеет входных параментров
    public static void addNewCat() {
        //напишите тут ваш код
        // мы увеличиваем переменную  класса (Cat.catsCount) на + 1
        Cat.catsCount = Cat.catsCount + 1;

    }

    public static void main(String[] args) {
        // вызов метода с передачей 1
        Cat.addNewCat(1);
        // вызов метода без передачи входних параметров
        Cat.addNewCat();
        // вызов метода с передачей -6
        Cat.addNewCat(-6);
        // вызов метода без передачи входних параметров
        Cat.addNewCat();
        // вызов метода без передачи входних параметров
        Cat.addNewCat();
// вывод текста на экран
        System.out.println("арег и тут = " + Cat.catsCount );


    }

}
//    Напиши код в методе addNewCat, чтобы при его вызове количество котов увеличивалось на 1.
//        За количество котов отвечает переменная catsCount.
//        Требования:
//        •	Класс Cat должен содержать только одну переменную catsCount.
//        •	Переменная catsCount должна быть статической, иметь модификатор доступа private, тип int и проинициализирована нулем.
//        •	Класс Cat должен содержать два метода addNewCat и main.
//        •	Метод addNewCat класса Cat должен увеличивать количество котов на 1.
