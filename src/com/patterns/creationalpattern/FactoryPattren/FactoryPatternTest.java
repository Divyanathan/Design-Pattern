package com.patterns.creationalpattern.FactoryPattren;

public class FactoryPatternTest {
    public static void main(String[] args){
        CoputerFactoryClass lComputerFactoryPatter = new CoputerFactoryClass();
        Computer lComputer;
        lComputer = lComputerFactoryPatter.getComputer("PC","320","2GB","2.4 GHz");
        System.out.println(lComputer.toString());
        lComputer = lComputerFactoryPatter.getComputer("Server","500","5GB","2.9 GHz");
        System.out.println(lComputer.toString());
    }
}
