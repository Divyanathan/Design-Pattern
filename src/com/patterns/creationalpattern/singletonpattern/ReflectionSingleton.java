package com.patterns.creationalpattern.singletonpattern;

import java.lang.reflect.Constructor;

public class ReflectionSingleton
{

    public static void main(String[] args){
        EagerInitSingleton lEagerInitSingletonInstance    = EagerInitSingleton.getEagerinitializationInstance();
        EagerInitSingleton lEagerInitSingletonInstanceTwo = null;

        try{
            Constructor[] lConstructors = EagerInitSingleton.class.getDeclaredConstructors();

            for (Constructor lConstructor : lConstructors){
                lConstructor.setAccessible(true);
                lEagerInitSingletonInstanceTwo = (EagerInitSingleton) lConstructor.newInstance();
            }
            System.out.println("Instance one Hashcode --> "+ lEagerInitSingletonInstance.hashCode());
            System.out.println("Instance two Hashcode --> "+ lEagerInitSingletonInstanceTwo.hashCode());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
