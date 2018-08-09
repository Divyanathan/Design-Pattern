package com.patterns.creationalpattern.AbstractFactorypattern;

public class Server extends Computer {

    String Hdd;
    String Ram;
    String Cpu;

    public Server(String pHdd, String pRam, String pCpu){
        Hdd = pHdd;
        Ram = pRam;
        Cpu = pCpu;
    }

    @Override
    public String getHDD() {
        return Hdd;
    }

    @Override
    public String getRAM() {
        return Ram;
    }

    @Override
    public String getCPU() {
        return Cpu;
    }

}