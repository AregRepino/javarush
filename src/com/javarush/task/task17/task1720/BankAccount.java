package com.javarush.task.task17.task1720;

import java.math.BigDecimal;

public class BankAccount {
    // Decimal Десятичный
    private BigDecimal balance;
    //    owner - владелец
    private String owner;

    public BankAccount(String owner) {
        //super();
        this(BigDecimal.ZERO, owner);
    }

    public BankAccount(BigDecimal balance, String owner) {
        super();
        this.balance = balance;
        this.owner = owner;
    }

    // deposit - пополнить
    public synchronized void deposit(BigDecimal money) {
        BigDecimal newBalance = balance.add(money);
        System.out.println("Добавляем " + money + ", на счету " + newBalance);
        balance = newBalance;
    }

    //                      withdraw - забирать (снять)
    public synchronized void withdraw(BigDecimal money) throws NotEnoughMoneyException {
        //                       subtract - вычетание
        BigDecimal newBalance = balance.subtract(money);


//                  compare To - сравнивать
        //
        int diff = newBalance.compareTo(BigDecimal.ZERO);
        if (diff < 0) {
            //    NotEnoughMoneyException - не достаточно денег
            throw new NotEnoughMoneyException();
        }


        balance = newBalance;
        System.out.println("Тратим " + money + ", на счету " + balance);
    }

    public void deposit(String money) {
        BigDecimal bigDecimal = new BigDecimal(money);
        deposit(bigDecimal);
    }

    public void withdraw(String money) throws NotEnoughMoneyException {
        BigDecimal bigDecimal = new BigDecimal(money);
        withdraw(bigDecimal);
    }

    public void deposit (double money) {
        BigDecimal bigDecimal = new BigDecimal(money);
        deposit(bigDecimal);
    }
}
