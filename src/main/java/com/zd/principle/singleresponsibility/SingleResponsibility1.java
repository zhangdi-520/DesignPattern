package com.zd.principle.singleresponsibility;

/**
 * @Author: zhangdi
 * @Description 单一职责原则
 * @Date: Created in 14:51 2022/11/17
 */
public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        //飞机能在公路上形式吗？
        vehicle.run("飞机");
    }


}

/**
 * 单一职责原则
 * 1.降低了类的复杂度，一个类只负责一项职责
 * 2.提高类的可读性，可维护性
 * 3.降低变更引起的风险
 * 4.通常情况下我们应该遵守单一职责原则，只有逻辑足够简单才可以违反单一职责原则；
 *      只有类中方法数量足够少，可以在方法级别保持单一职责原则
 */

//交通工具类
//run方法违反了单一职责
//解决方案，根据交通工具运行的方式，分解成不同的类
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "   在公路上行驶.......");
    }
}
