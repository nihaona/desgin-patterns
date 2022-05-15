package com.yang.desginPatterns.principles.singleResponsibility;
//单一职责原则
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");//违反单一职责原则
    }
}

//交通工具类
//方式1
//1.在方式1 的run方法中，违反了单一职责原则
//2.解决方案，根据交通工具的运行方式不同，将类划分为不同的类即可
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上跑。。。");
    }
}

