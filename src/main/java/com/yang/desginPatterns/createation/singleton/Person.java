package com.yang.desginPatterns.createation.singleton;

/**
 *  只能有一个
 */
public class Person {

    private String name;
    private Integer age;

    //懒汉、饿汉
    private final static Person instance = new Person();//饿汉

    //构造器私有，外部不能实例化
    private Person(){
        System.out.println("创建了person");
    }

    //提供给外部的方法
    //1. public static synchronized Person boss() 锁太大
    //2. 双重检查锁+内存可见性（内存模式）
    public static synchronized Person boss() {


            //如果没有实例再去创建
            if(instance == null) {
                synchronized(Person.class){
                    if (instance == null) {
                        Person person = new Person();
                        person = person;
                    }
            }
        }
        return instance;
    }

}
