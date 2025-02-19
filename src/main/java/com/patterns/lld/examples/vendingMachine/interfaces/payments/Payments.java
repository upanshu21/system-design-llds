package com.patterns.lld.examples.vendingMachine.interfaces.payments;

public interface Payments {

    int collectMoney();

    boolean makePayment(int price);

}
