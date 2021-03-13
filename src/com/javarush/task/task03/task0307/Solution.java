package com.javarush.task.task03.task0307;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg z1 = new Zerg();
        z1.name = "ara";
        Zerg z2 = new Zerg();
        z2.name = "eer";
        Zerg z3 = new Zerg();
        z3.name = "tar";
        Zerg z4 = new Zerg();
        z4.name = "yes";
        Zerg z5= new Zerg();
        z5.name = "no";

        Protoss p1 = new Protoss();
        p1.name = "dev";
        Protoss p2 = new Protoss();
        p2.name = "dei";
        Protoss p3 = new Protoss();
        p3.name = "det";

        Terran t1 = new Terran();
        t1.name = "tgt";
        Terran t2 = new Terran();
        t2.name = "tgz";
        Terran t3 = new Terran();
        t3.name = "tgb";
        Terran t4 = new Terran();
        t4.name = "tgd";



    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
