package com.javarush.task.task18.task1815;

import java.util.List;


public class Solution {
    public class TableInterfaceWrapper implements TableInterface{
        private TableInterface tableInterface;

        public TableInterfaceWrapper (TableInterface tableInterface) {
            this.tableInterface = tableInterface;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            tableInterface.setModel(rows);

        }

        @Override
        public String getHeaderText() {
            return tableInterface.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            tableInterface.setHeaderText(newHeaderText);

        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}


//    Измени класс TableInterfaceWrapper так, чтобы он стал Wrapper-ом для TableInterface.
//        Метод setModel должен вывести в консоль количество элементов в новом листе перед обновлением модели.
//        Метод getHeaderText должен возвращать текст в верхнем регистре - используйте метод toUpperCase().
//
//        Требования:
//        •	Класс TableInterfaceWrapper должен реализовывать интерфейс TableInterface.
//        •	Класс TableInterfaceWrapper должен инициализировать в конструкторе поле типа TableInterface.
//        •	Метод setModel() должен вывести в консоль количество элементов в новом листе перед обновлением модели.
//        •	Метод getHeaderText() должен возвращать текст в верхнем регистре.
//        •	Метод setHeaderText() должен устанавливать текст для заголовка без изменений.
