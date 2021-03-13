package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human granddad = new Human();
        granddad.name = "дед1";
        granddad.age = 77;
        granddad.sex = true;

        Human granddad1 = new Human();
        granddad1.name = "дед2";
        granddad1.age = 89;
        granddad1.sex = true;

        Human grandmother = new Human();
        grandmother.name = "баб1";
        grandmother.age = 66;
        grandmother.sex = false;

        Human grandmother1 = new Human();
        grandmother1.name = "баб2";
        grandmother1.age = 50;
        grandmother1.sex = false;

        Human father = new Human();
        father.name = "отец";
        father.age = 33;
        father.sex = true;

        Human mother = new Human();
        mother.name = "мать";
        mother.age = 26;
        mother.sex = false;

        Human child = new Human();
        child.name = "дети1";
        child.age = 10;
        child.sex = true;

        Human child1 = new Human();
        child1.name = "дети2";
        child1.age = 8;
        child1.sex = false;

        Human child2 = new Human();
        child2.name = "дети3";
        child2.age = 7;
        child2.sex = false;


        granddad.children.add(father);
        granddad1.children.add(mother);

        grandmother.children.add(father);
        grandmother1.children.add(mother);

        father.children.add(child);
        father.children.add(child1);
        father.children.add(child2);

        mother.children.add(child);
        mother.children.add(child1);
        mother.children.add(child2);


        System.out.println(granddad);
        System.out.println(granddad1);
        System.out.println(grandmother);
        System.out.println(grandmother1);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child);
        System.out.println(child1);
        System.out.println(child2);

    }

    public static class Human {
        //напишите тут ваш код

        public String name;
        public boolean sex;
        public int age;
        public List<Human> children = new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
