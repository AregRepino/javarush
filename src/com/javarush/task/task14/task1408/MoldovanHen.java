package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {
    int N = 3;
    String Sssss = Country.MOLDOVA;

    @Override
    public int getCountOfEggsPerMonth() {
        return N;
    }



    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Sssss + ". Я несу " + N + " яиц в месяц.";
    }
}
