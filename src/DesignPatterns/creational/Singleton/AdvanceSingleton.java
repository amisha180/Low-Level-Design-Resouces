package DesignPatterns.creational.Singleton;

import java.io.Serializable;

public class AdvanceSingleton implements Cloneable, Serializable {
    private static  AdvanceSingleton instance=null;

    private AdvanceSingleton(){
        if(instance!=null){
            throw new RuntimeException("Cant create another obj for singleton class");
        }
    }
    public static AdvanceSingleton getInstance(){
        if(instance==null){
            synchronized (AdvanceSingleton.class){
                if(instance==null){
                    instance = new AdvanceSingleton();
                }
            }
        }

        return instance;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
       // return super.clone();
       //throw new CloneNotSupportedException();
        return instance;
    }
    protected Object readResolve(){
        return instance;
    }
}
