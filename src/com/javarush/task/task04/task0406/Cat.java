package com.javarush.task.task04.task0406;

public class Cat {
    // обычная переменая класс fullName
    private String fullName;
// публичны , ничего не возрашает , метод setName ()- входные пареметры - String firstName, String lastName
    public void setName(String firstName, String lastName) {
        // обедеение строк      firstName и  lastName и присвоение ее к fullName
        String fullName = firstName + " " + lastName;

        //напишите тут ваш код
        // присвоение переменого класс this.fullName значение локольно переменой fullName
        this.fullName = fullName;
    }

    public static void main(String[] args) {
        // создание объекта  Cat и присвоение его переменой  сat
        Cat cat = new Cat();
        // ("Areg",  "Amirkhanyan") - входные параметры
         cat.setName("Areg",  "Amirkhanyan");
         // вывод текста на экран
         System.out.println(cat.fullName);
         cat.equals(cat);


    }
}

//    Допишите код метода setName, чтобы с его помощью установить значение private String fullName равное значению локальной переменной String fullName.
//        Требования:
//        •	Класс Cat должен содержать только одну переменную fullName.
//        •	Переменная fullName должна иметь модификатор доступа private и тип String.
//        •	Класс Cat должен содержать только два метода setName и main.
//        •	Метод setName должен иметь локальную переменную fullName.
//        •	Метод setName класса Cat должен устанавливать значение глобальной переменной private String fullName равным локальной переменной fullName.
