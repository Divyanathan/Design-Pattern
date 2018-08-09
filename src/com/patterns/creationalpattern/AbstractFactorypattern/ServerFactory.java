package com.patterns.creationalpattern.AbstractFactorypattern;

public class ServerFactory implements ComputerAbstractFactory {

    String Hdd;
    String Ram;
    String Cpu;

    public ServerFactory(String pHdd, String pRam, String pCpu){
        Hdd = pHdd;
        Ram = pRam;
        Cpu = pCpu;
    }


    @Override
    public Computer getComputer() {
        return new Server(Hdd,Ram,Cpu);
    }
}