package com.javarush.task.task18.task1813;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "/Users/areg/IdeaProjects/JavaRush/red.txt";

    private FileOutputStream fileOutputStream;

    public AmigoOutputStream (FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(fileName);

        this.fileOutputStream = fileOutputStream;
    }

    public static void main(String[] args) throws IOException {
        new AmigoOutputStream(new FileOutputStream(fileName));


//        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
//        AmigoOutputStream amigoOutputStream = new AmigoOutputStream(fileOutputStream);
//        amigoOutputStream.close();

    }

    int b;
    public void write () throws IOException {
        fileOutputStream.write(b);
    }

    public void flush() throws IOException {
        fileOutputStream.flush();
    }





    public void close () throws IOException {
        this.fileOutputStream.flush();
        String s = "JavaRush © All rights reserved.";
        this.fileOutputStream.write(s.getBytes());
        this.fileOutputStream.close();
    }

}



//1 Измени класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream. Используй наследование.
//        2 При вызове метода close() должны выполняться следующая последовательность действий:
//        2.1 Вызвать метод flush().
//        2.2 Дописать следующий текст "JavaRush © All rights reserved.", используй метод getBytes().
//        2.3 Закрыть поток методом close().
//
//        Требования:
//        •	Метод main изменять нельзя.
//        •	Класс AmigoOutputStream должен наследоваться от класса FileOutputStream.
//        •	Класс AmigoOutputStream должен принимать в конструкторе объект типа FileOutputStream.
//        •	Все методы write(), flush(), close() в классе AmigoOutputStream должны делегировать свое выполнение объекту FileOutputStream.
//        •	Метод close() должен сначала вызвать метод flush(), затем дописать текст, затем закрыть поток.