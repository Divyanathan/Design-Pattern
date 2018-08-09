package com.patterns.creationalpattern.FactoryPattren;

public class CoputerFactoryClass {

    public Computer getComputer(String pType, String pHDD, String pRam, String pCpu){
        if (pType.equals("PC")){
            return  new PC(pHDD,pRam,pCpu);
        }else {
            return  new Server(pHDD,pRam,pCpu);
        }
    }
}
