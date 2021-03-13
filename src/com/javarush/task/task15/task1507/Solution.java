package com.javarush.task.task15.task1507;

public class Solution {
    public static void main(String[] args) {
        printMatrix((int) 2, 3, "8");
        printMatrix((byte)2, 1, "areg");
        printMatrix((double) 0.2, (byte)1, "no" );
        printMatrix((long)2000, 2, "mnogo" );
        printMatrix((short)4, 6, "nado");
        printMatrix(Integer.valueOf(2), 7, "yes" );
        printMatrix(2, (byte) 1, "eee");
        printMatrix((short)3, (long)100, "123");
        printMatrix((long)234, (byte) 12, "55");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(byte m, int n, String value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
        }

    }


    public static void printMatrix (short m, int n, String value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
        }
    }


    public static void printMatrix (long m, int n, String value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
        }
    }



    public static void printMatrix (Integer m, int n, String value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
        }
    }


    public static void printMatrix (double m, byte n, String value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
        }
    }


    public static void printMatrix (int m, byte n, String value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
        }
    }


    public static void printMatrix (short m, long n, String value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
        }
    }


    public static void printMatrix (long m, byte n, String value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
        }
    }




}


//    Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.
//
//        Требования:
//        •	В классе Solution должны быть реализованы 10 методов printMatrix с различными аргументами.
//        •	Класс Solution должен быть public.
//        •	Все методы класса Solution должны быть статическими.
//        •	Все методы класса Solution должны быть публичными.