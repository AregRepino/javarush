package com.javarush.task.task03.task0313;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        // обевил переменую типо String и просвоил значение
        String mama = "Мама";
        String milo = "Мыла";
        String ramu = "Раму";
        //использовал конкантинация для обядинение строк. Вывил на экран резельтат
        System.out.println(mama + milo + ramu);
        System.out.println(mama + ramu + milo);
        System.out.println(milo + ramu + mama);
        System.out.println(milo + mama + ramu);
        System.out.println(ramu + mama + milo);
        System.out.println(ramu + milo + mama);




    }
}
//    Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
//        Подсказка: их 6 штук.
//        Каждую комбинацию вывести с новой строки. Слова не разделять.
//
//        Пример:
//        МылаРамуМама
//        РамуМамаМыла
//        ...
//        Требования:
//        •	Программа должна выводить текст.
//        •	Выведенный текст должен содержать 6 строк.
//        •	Текст в каждой строке должен быть уникален.
//        •	Должны быть выведены все возможные комбинации.
