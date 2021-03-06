package com.patterns.creationalpattern.FactoryPattren;

public abstract class Computer {

    public abstract String getHDD();
    public abstract String getRAM();
    public abstract String getCPU();

    @Override
    public String toString() {
        return "HardDisk "+ getHDD() +" RAM "+getRAM()+" CPU "+getCPU();
    }
}
