package com.patterns.lld.examples.vendingMachine.interfaces.payments;

public interface Payments {

    void collectMoney();

    boolean makePayment(int price);

}
