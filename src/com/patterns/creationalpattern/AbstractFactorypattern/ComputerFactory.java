package com.patterns.creationalpattern.AbstractFactorypattern;

public class ComputerFactory {

    public static Computer geComputer(ComputerAbstractFactory pFactory){
        return  pFactory.getComputer();
    }
}
