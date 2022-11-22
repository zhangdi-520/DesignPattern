package com.zd.principle.inoversion;

/**
 * @author zhangdi
 * @version 1.0
 * @description: 依赖倒转2
 * @date 2022/11/22 下午10:23
 */
public class DependencyInoversion2 {

    public static void main(String[] args) {
        PersonOne personOne = new PersonOne();
        personOne.receive(new Wx());
    }
}


/**
 * 1，底层模块尽量都要有抽象类或接口，程序稳定性更好
 * 2。变量的声明类型尽量使抽象类或者接口，相当于存在一个缓冲曾，利于程序优化
 * 3。继承时要遵循里氏替换原则
 */
interface IReceive{

    void receiev();
}

class Wx implements IReceive{

    @Override
    public void receiev() {
        System.out.println("微信接收到了消息");
    }
}


/**
 * 依赖于接口，可复用性变高，实现了依赖倒转原则
 */
class PersonOne{

    public void receive(IReceive iReceive){
        iReceive.receiev();
    }
}
