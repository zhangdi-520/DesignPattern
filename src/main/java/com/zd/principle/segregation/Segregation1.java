package com.zd.principle.segregation;


/**
 * @author zhangdi
 * 接口隔离原则
 */
public class Segregation1 {

    public static void main(String[] args) {
        C c = new C();
        c.opration1(new A());
        D d = new D();
        d.opration1(new B());
    }

}


interface InterfaceUse {


    /**
     * 方法一
     */
    void operation1();

    /**
     * 方法二
     */
    void operation2();

    /**
     * 方法三
     */
    void operation3();

    /**
     * 方法四
     */
    void operation4();

    /**
     * 方法五
     */
    void operation5();

}


class A implements InterfaceUse{

    @Override
    public void operation1() {
        System.out.println(getClass().getName() + " 方法1");
    }

    @Override
    public void operation2() {
        System.out.println(getClass().getName() + " 方法2");
    }

    @Override
    public void operation3() {
        System.out.println(getClass().getName() + " 方法3");
    }

    @Override
    public void operation4() {
        System.out.println(getClass().getName() + " 方法4");
    }

    @Override
    public void operation5() {
        System.out.println(getClass().getName() + " 方法5");
    }
}

class B implements InterfaceUse{
    @Override
    public void operation1() {
        System.out.println(getClass().getName() + " 方法1");
    }

    @Override
    public void operation2() {
        System.out.println(getClass().getName() + " 方法2");
    }

    @Override
    public void operation3() {
        System.out.println(getClass().getName() + " 方法3");
    }

    @Override
    public void operation4() {
        System.out.println(getClass().getName() + " 方法4");
    }

    @Override
    public void operation5() {
        System.out.println(getClass().getName() + " 方法5");
    }
}

/**
 * C类依赖于A类，但是只需要1，2，3方法，所以A类没必要继承接口的4，5方法
 */
class C{

    public void opration1(InterfaceUse interfaceUse){
        interfaceUse.operation1();
    }

    public void opration2(InterfaceUse interfaceUse){
        interfaceUse.operation1();
    }

    public void opration3(InterfaceUse interfaceUse){
        interfaceUse.operation3();
    }
}

/**
 * D类依赖于BA类，但是只需要1，4，5方法，所以A类没必要继承接口的2，3方法
 */
class D{
    public void opration1(InterfaceUse interfaceUse){
        interfaceUse.operation1();
    }

    public void opration4(InterfaceUse interfaceUse){
        interfaceUse.operation4();
    }

    public void opration5(InterfaceUse interfaceUse){
        interfaceUse.operation5();
    }
}
