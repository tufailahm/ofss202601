package com.training.alstrom.service;
public class Portfolio implements MutualFund {

    @Override
    public void addPortfolio(String shareName, int shares, int value) {

        int total = shares * value;

        System.out.println(
                shareName + " shares of "
                + shares + " value of "
                + value + " = "
                + total);
    }
}