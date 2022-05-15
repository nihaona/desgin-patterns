package com.yang.desginPatterns.principles.singleResponsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle vehicle = new RoadVehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.air("飞机");
    }
}

//方案二：遵守了单一职责原则，但是改动很大
//改进：直接修改Vehicle类
class RoadVehicle{
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行");
    }
}

class AirVehicle{
    public void air(String vehicle){
        System.out.println(vehicle + "在天上飞");

    }
}
