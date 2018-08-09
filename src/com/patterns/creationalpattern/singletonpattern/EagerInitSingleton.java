package com.patterns.creationalpattern.singletonpattern;

public class EagerInitSingleton {

    private EagerInitSingleton(){
//        if (mEagerInitSingleton!=null){
//            throw new RuntimeException("Use getEagerinitializationInstance() method to get the single instance of this class.");
//        }
    }

    private static EagerInitSingleton mEagerInitSingleton = new EagerInitSingleton();

    public static EagerInitSingleton getEagerinitializationInstance(){
        return mEagerInitSingleton;
    }

}
