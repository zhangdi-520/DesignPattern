package com.zd.principle.inoversion;

/**
 * @author zhangdi
 * @version 1.0
 * @description: 依赖倒转原则
 * @date 2022/11/22 下午10:12
 */
public class DependencyInoversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }

}

/**
 * 1.简单，比较容易实现
 * 2.如果我们获取对象使微信，短信等等，则需要新增类，同事Person类也要新增接收方法
 * 3。解决思路：引入一个抽象接口IReceiver,表示接受者，这样Person只需要与这个接口发生依赖
 * 微信和短信都属于接收范围，只要实现这个接口挤压可以，这样就符合依赖倒转原则
 */
class Email{
    public String getInfo(){
        return "电子邮件信息： hello world";
    }
}


class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
