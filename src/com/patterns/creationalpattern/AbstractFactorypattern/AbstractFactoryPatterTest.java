package com.patterns.creationalpattern.AbstractFactorypattern;

public class AbstractFactoryPatterTest {
    public static void main(String[] args){
        Computer lComputer = ComputerFactory.geComputer(new PCFactory("320","2GB","2.4 GHz"));
        System.out.println(lComputer.toString());
        lComputer = ComputerFactory.geComputer(new ServerFactory("500","5GB","2.9 GHz"));
        System.out.println(lComputer.toString());
    }
}
