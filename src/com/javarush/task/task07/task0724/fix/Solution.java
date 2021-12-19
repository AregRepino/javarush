package com.javarush.task.task07.task0724.fix;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandFather = new Human("Pasha" , true, 54);
        Human grandMother = new Human("Masha" , false, 45);

        Human grandFather2 = new Human("Richerd" , true, 56);
        Human grandMother2 = new Human("Aleksa" , false, 65);

        Human father = new Human("Vasa", true, 23, grandFather, grandMother);
        Human mother = new Human("Alisa", false, 23, grandFather2, grandMother2);

        Human child1 = new Human("Igor", true, 2, father, mother);
        Human child2 = new Human("Anatoliy", true, 5, father, mother);
        Human child3 = new Human("Fil", true, 6, father, mother);

        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(grandFather2);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);





    }

    public static class Human {
        // напишите тут ваш код
        public String name;
        public boolean sex;
        public int age;
        public Human father;
        public Human mother;

        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
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
