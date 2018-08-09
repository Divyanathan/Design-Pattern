package com.patterns.creationalpattern.singletonpattern;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton mThreadSafeSingleton;
    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getThreadSafeSingleton(){
        if (mThreadSafeSingleton == null){
            mThreadSafeSingleton = new ThreadSafeSingleton();
        }
        return mThreadSafeSingleton;
    }

}
