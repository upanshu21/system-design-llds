package com.patterns.lld.examples.vendingMachine;

import com.patterns.lld.examples.vendingMachine.interfaces.payments.Payments;

public class PaymentsImpl implements Payments {

    private Integer treasury;

    public PaymentsImpl() {
        treasury = 0;
    }

    @Override
    public int collectMoney() {
        int total = treasury;
        treasury = 0;
        return total;
    }

    @Override
    public boolean makePayment(int price) {
        treasury+=price;
        return true;
    }
    
}
