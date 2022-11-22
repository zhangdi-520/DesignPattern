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
