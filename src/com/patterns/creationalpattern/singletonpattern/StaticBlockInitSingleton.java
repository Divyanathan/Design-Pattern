package com.patterns.creationalpattern.singletonpattern;

public class StaticBlockInitSingleton {

    private StaticBlockInitSingleton(){}

    private static StaticBlockInitSingleton mStaticBlockInitSingleton;

    static {
        mStaticBlockInitSingleton = new StaticBlockInitSingleton();
    }

    public static StaticBlockInitSingleton getStaticInitSingletonInstance(){
        return mStaticBlockInitSingleton;
    }

}
