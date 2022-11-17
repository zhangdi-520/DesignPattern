package com.zd.principle.singleresponsibility;

/**
 * @Author: zhangdi
 * @Description 单一职责3
 * @Date: Created in 21:41 2022/11/17
 */
public class SingleResponsibility3 {

    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");

    }
}

//方案三
//在原有的类中修改，只增加了方法
//这里虽然没有在类级别上遵循单一职责，但是在方法的级别上遵循了单一职责
class Vehicle2{
    public void run(String vehicle){
        System.out.println(vehicle + "   在公路上行驶.......");
    }

    public void runAir(String vehicle){
        System.out.println(vehicle + " 在空气中行驶");
    }

    public void runWater(String vehicle){
        System.out.println(vehicle + " 在水中行驶");
    }
}

