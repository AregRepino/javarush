package com.javarush.task.task17.task1706;

public class OurPresident {
    private static OurPresident president;

    static {
        synchronized (OurPresident.class) {
            president = new OurPresident();
////            president.areg();
           // OurPresident.getOurPresident();

        }

    }

    private OurPresident() {

    }

//    public void areg() {
//        this.toString();
//    }

    public static OurPresident getOurPresident() {
        return president;
    }
}
