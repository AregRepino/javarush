package com.javarush.task.task20.task2021;
import java.io.*;
public class Solution implements  Serializable {
    public static class SubSolution extends Solution {
        private void writeObject(ObjectOutputStream out) throws IOException {
            throw new NotSerializableException();
        }

        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            throw new NotSerializableException();
        }
    }

    public static void main(String[] args) {

    }
}


//    Запрети сериализацию класса SubSolution используя NotSerializableException.
//        Сигнатуры классов менять нельзя.
//
//        Требования:
//        •	Класс Solution должен поддерживать интерфейс Serializable.
//        •	Класс SubSolution должен быть создан внутри класса Solution.
//        •	Класс SubSolution должен быть потомком класса Solution.
//        •	При попытке сериализовать объект типа SubSolution должно возникать исключение NotSerializableException.
//        •	При попытке десериализовать объект типа SubSolution должно возникать исключение NotSerializableException.