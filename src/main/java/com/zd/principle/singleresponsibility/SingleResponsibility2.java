package com.zd.principle.singleresponsibility;

/**
 * @Author: zhangdi
 * @Description 单一职责演变2
 * @Date: Created in 21:32 2022/11/17
 */
public class SingleResponsibility2 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
    }
}

//方案2
//遵守了单一原则，即将类分解但是改动量比较大，同时要修改原有逻辑
class RoadVehicle{

    public void run(String vehicle){
        System.out.println(vehicle + "在路上行驶");
    }
}
class AirVehicle{

    public void run(String vehicle){
        System.out.println(vehicle + "在空中行驶");
    }
}

class WaterVehicle{

    public void run(String vehicle){
        System.out.println(vehicle + "在水上行驶");
    }
}
