package com.javarush.task.task18.task1812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionFileOutputStream implements AmigoOutputStream {

    private AmigoOutputStream amigoOutputStream;

    public QuestionFileOutputStream (AmigoOutputStream amigoOutputStream) {
        this.amigoOutputStream = amigoOutputStream;
    }


    @Override
    public void flush() throws IOException {
        amigoOutputStream.flush();

    }

    @Override
    public void write(int b) throws IOException {
        amigoOutputStream.write(b);

    }

    @Override
    public void write(byte[] b) throws IOException {
        amigoOutputStream.write(b);

    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        amigoOutputStream.write(b,off,len);

    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        if (s.equals("Д")) {
            amigoOutputStream.close();

        }

    }
}

//
//    Используя шаблон проектирования Wrapper (Decorator) расширь функциональность AmigoOutputStream.
//        В классе QuestionFileOutputStream при вызове метода close() должна быть реализована следующая функциональность:
//        1. Вывести в консоль фразу "Вы действительно хотите закрыть поток? Д/Н".
//        2. Считайте строку.
//        3. Если считанная строка равна "Д", то закрыть поток.
//        4. Если считанная строка не равна "Д", то не закрывать поток.
//
//        Требования:
//        Интерфейс AmigoOutputStream изменять нельзя.
//        Класс QuestionFileOutputStream должен реализовывать интерфейс AmigoOutputStream.
//        Класс QuestionFileOutputStream должен инициализировать в конструкторе поле типа AmigoOutputStream.
//        Все методы QuestionFileOutputStream должны делегировать свое выполнение объекту AmigoOutputStream.
//        Метод close() должен спрашивать у пользователя "Вы действительно хотите закрыть поток? Д/Н".
//        Метод close() должен закрывать поток только в случае, если считает с консоли ответ "Д".
