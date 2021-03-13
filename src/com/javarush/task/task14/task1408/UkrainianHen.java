package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    int N = 2;
    String Sssss = Country.UKRAINE;

    @Override
    public int getCountOfEggsPerMonth() {
        return N;
    }



    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Sssss + ". Я несу " + N + " яиц в месяц.";
    }
}
