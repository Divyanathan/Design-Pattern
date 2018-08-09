package com.patterns.creationalpattern.singletonpattern;

public class ThreadSafeDoubleCheckLock {

    private static ThreadSafeDoubleCheckLock mThreadSafeDoubleCheck;
    private ThreadSafeDoubleCheckLock(){}

    public static ThreadSafeDoubleCheckLock getThreadSafeDoubleCheck(){

        if (mThreadSafeDoubleCheck == null){
            synchronized (ThreadSafeDoubleCheckLock.class){
                mThreadSafeDoubleCheck = new ThreadSafeDoubleCheckLock();
            }
        }
        return mThreadSafeDoubleCheck;
    }
}
