package com.javarush.task.task13.task1322;

public class StringObject implements Solution.SimpleObject {
    @Override
    public Solution.SimpleObject getInstance() {
        return new StringObject();
    }
}
