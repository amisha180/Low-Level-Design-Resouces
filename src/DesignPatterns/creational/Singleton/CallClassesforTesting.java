package DesignPatterns.creational.Singleton;

import DesignPatterns.creational.Singleton.AdvanceSingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CallClassesforTesting {
    public static void main(String[] args) throws IOException, CloneNotSupportedException,
            ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //Singleton class object
        /*
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        */

        //AdvanceSingleton class object and cloning
        /*
        AdvanceSingleton obj3 = AdvanceSingleton.getInstance();
        AdvanceSingleton obj4 =(AdvanceSingleton) obj3.clone();
        System.out.println(obj3.hashCode());
        System.out.println(obj4.hashCode());
        */

        //Deserialization
        /*
        AdvanceSingleton instance1 = AdvanceSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(
                new FileOutputStream("file.text"));
        out.writeObject(instance1);
        out.close();

        // deserialize from file to object
        ObjectInput in = new ObjectInputStream(
                new FileInputStream("file.text"));

        AdvanceSingleton instance2
                = (AdvanceSingleton)in.readObject();
        in.close();

        System.out.println("instance1 hashCode:- "
                + instance1.hashCode());
        System.out.println("instance2 hashCode:- "
                + instance2.hashCode());
         */

        //Reflection API
        AdvanceSingleton instance1 = AdvanceSingleton.getInstance();
        Constructor constructor = AdvanceSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        AdvanceSingleton instance2 = (AdvanceSingleton)  constructor.newInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
