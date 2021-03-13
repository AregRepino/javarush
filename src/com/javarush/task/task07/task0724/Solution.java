package com.javarush.task.task07.task0724;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandFatherA = new Human("Peta", true, 77);
        Human grandFatherB = new Human("Areg", true, 79);

        Human grandMotherA = new Human("Alina", false, 68);
        Human grandMotherB = new Human("Alisa", false, 69);


        Human mother = new Human("Shasha", false, 33, grandFatherA, grandMotherA);
        Human father = new Human("Alesha", true, 36, grandFatherB, grandMotherB);

        Human childA = new Human("lesha", true, 14, father, mother);
        Human childB = new Human("Pasha", true, 16, father, mother);
        Human childC = new Human("Misha", true, 12, father, mother);

        System.out.println(grandFatherA);
        System.out.println(grandFatherB);
        System.out.println(grandMotherA);
        System.out.println(grandMotherB);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(childA);
        System.out.println(childB);
        System.out.println(childC);



    }

    public static class Human {

        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;


        public Human(String name, boolean sex, int age) {

            this.name = name;
            this.sex = sex;
            this.age = age;

        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {

            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;

        }


        // напишите тут ваш код

        public String toString() {
            String text = "";
            text = text + "Имя: " + this.name;
            text = text + ", пол: " + ( this.sex ? "мужской" : "женский" );
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}


//    Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
//
//        Примечание:
//        Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
//
//        Пример вывода:
//        Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
//        Имя: Катя, пол: женский, возраст: 55
//        Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
//        ...
//
//        Требования:
//        •	Программа не должна считывать данные с клавиатуры.
//        •	Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
//        •	Добавить в класс конструктор public Human(String name, boolean sex, int age).
//        •	Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
//        •	Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
//        •	Выведи созданные объекты на экран.