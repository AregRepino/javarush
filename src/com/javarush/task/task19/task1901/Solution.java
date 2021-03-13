package com.javarush.task.task19.task1901;

public class Solution {
    public static void main(String[] args) {
        //это пример вывода
        ATable aTable = new ATableAdapter();

        BTable table = new TableAdapter(aTable);
        System.out.println(table.getHeaderText());
    }

    public static class TableAdapter implements BTable {

        private ATable aTable;

        public TableAdapter(ATable aTable) {
            this.aTable = aTable;
        }

        @Override
        public String getHeaderText() {
            return "[" +aTable.getCurrentUserName() + "] : " + aTable.getTableName();
        }


    }


    public static class ATableAdapter implements ATable {

        @Override
        public String getCurrentUserName() {
            return "Amigo";
        }

        @Override
        public String getTableName() {
            return "DashboardTable";
        }
    }

    public static interface ATable {
        String getCurrentUserName();

        String getTableName();
    }

    public static interface BTable {
        String getHeaderText();
    }
}



//    Измени класс TableAdapter так, чтобы он адаптировал ATable к BTable.
//        Метод getHeaderText должен возвращать такую строку "[username] : tablename".
//
//        Пример, "[Amigo] : DashboardTable".
//
//        Требования:
//        •	Класс Solution должен содержать public static интерфейс ATable.
//        •	Класс Solution должен содержать public static интерфейс BTable.
//        •	Класс Solution должен содержать public static класс TableAdapter.
//        •	Класс TableAdapter должен реализовывать интерфейс BTable.
//        •	Класс TableAdapter должен содержать приватное поле aTable типа ATable.
//        •	Класс TableAdapter должен содержать конструктор с параметром ATable.
//        •	Класс TableAdapter должен переопределять метод getHeaderText согласно заданию.
//
