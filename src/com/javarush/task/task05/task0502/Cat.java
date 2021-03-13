package com.javarush.task.task05.task0502;

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    // если
    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
//        anotherCat.age;
//        this.age;
        int winCount = 0;
        int loseCount = 0;

        if (this.age > anotherCat.age) {
            winCount = +1;

        } else if (this.age < anotherCat.age) {
            loseCount = +1;
        }

        if (this.strength > anotherCat.strength) {
            winCount = +1;

        } else if (this.strength < anotherCat.strength) {
            loseCount = +1;
        }

        if (this.weight > anotherCat.weight) {
            winCount = +1;

        } else if (this.weight < anotherCat.weight) {
            loseCount = +1;
        }

        if (winCount > loseCount) {
            return true;
        } else {
            return false;
        }


    }

    public static void main(String[] args) {

        Cat magregor = new Cat();
        Cat habbib = new Cat();

        magregor.age = 33;
        habbib.age = 31;

        magregor.strength = 40;
        habbib.strength = 20;

        magregor.weight = 77;
        habbib.weight = 77;


        boolean b = magregor.fight(habbib);

        System.out.println(b);

        boolean e = habbib.fight(magregor);

        System.out.println(e);


    }
}


//    Реализовать метод boolean fight(Cat anotherCat):
//        реализовать механизм драки котов в зависимости от их веса, возраста и силы.
//        Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
//        Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
//        Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
//        если cat1.fight(cat2) возвращает true,
//        то cat2.fight(cat1) должен возвращать false.
//
//        Требования:
//        •	Класс Cat должен содержать конструктор без параметров.
//        •	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
//        •	В классе Cat должен быть метод fight.
//        •	В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
//        •	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
//        •	Если некий кот1