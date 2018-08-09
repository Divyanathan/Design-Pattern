package com.patterns.creationalpattern.singletonpattern;

public class BillPughSingleton {

    private BillPughSingleton(){}

    public static class SingletonHelper{
        private static BillPughSingleton mBillPughSingleton = new BillPughSingleton();
    }

    public static BillPughSingleton getBillPughSingleton(){
        return SingletonHelper.mBillPughSingleton;
    }
}
