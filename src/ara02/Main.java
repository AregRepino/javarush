package ara02;

public class Main {
    public int count = 0;     //объявили переменную класса
    public String s = "areg";
    public static int age = 26;

    public void run()
    {
        count = 15;           //обращение к переменной класса
        int count = 10;       //объявили локальную переменную метода
        count++;             //обращение к переменной метода
        this.count = 7;
        this.s = "arg";
        System.out.println(this.s);
        Main.age = 30;
    }
}

//    Статическая переменная класса
//        ClassName.variableName
//
//        Примеры:
//        Cat.catsCount

//    Обычная переменная класса
//        this.variableName
//
//        Примеры:
//        this.catsCount