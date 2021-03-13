package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    int N = 4;
    String Sssss = Country.BELARUS;

    @Override
    public int getCountOfEggsPerMonth() {
        return N;
    }


    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Sssss + ". Я несу " + N + " яиц в месяц.";
    }
}
