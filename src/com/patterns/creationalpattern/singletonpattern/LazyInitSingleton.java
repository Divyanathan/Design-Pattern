package com.patterns.creationalpattern.singletonpattern;

public class LazyInitSingleton {

    private static LazyInitSingleton mLazyInitSingleton;

    private LazyInitSingleton(){}

    public static LazyInitSingleton getLazyInitiSingletonInstance(){

        if (mLazyInitSingleton == null){
            mLazyInitSingleton = new LazyInitSingleton();
        }
        return mLazyInitSingleton;
    }
}
