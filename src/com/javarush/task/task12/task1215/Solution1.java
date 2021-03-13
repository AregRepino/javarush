package com.javarush.task.task12.task1215;

public class Solution1 {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Solution.Pet getChild();
    }



    public static class Cat extends Solution.Pet {
        public String getName() {
            return null;
        }

        public Solution.Cat getChild() {
            return new Solution.Cat();
        }

    }



    public static class Dog extends Solution.Pet {
        public String getName() {
            return null;
        }

        public Solution.Dog getChild() {
            return new Solution.Dog();
        }

    }
}
