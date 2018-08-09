package com.patterns.creationalpattern.AbstractFactorypattern;

public class PCFactory implements ComputerAbstractFactory {

    String Hdd;
    String Ram;
    String Cpu;

    public PCFactory(String pHdd, String pRam, String pCpu){
        Hdd = pHdd;
        Ram = pRam;
        Cpu = pCpu;
    }


    @Override
    public Computer getComputer() {
        return new PC(Hdd, Ram, Cpu);
    }
}
