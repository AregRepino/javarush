package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    int N = 1;
    String Sssss = Country.RUSSIA;

    @Override
    public int getCountOfEggsPerMonth() {
        return N;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Sssss + ". Я несу " + N + " яиц в месяц.";
    }
}
