package com.yang.desginPatterns.principles.isolation;

public class isolation1 {
}

interface Interface1{
    void  operation1();
    void  operation2();
    void  operation3();
    void  operation4();
    void  operation5();
}
class D implements Interface1{

    @Override
    public void operation1() {
        System.out.println("B中实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B中实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B中实现了 operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B中实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B中实现了 operation5");
    }
}
class B implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("D中实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D中实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D中实现了 operation3");
    }

    @Override
    public void operation4() {
        System.out.println("D中实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D中实现了 operation5");
    }
}

class A { //A类通过Interface1依赖（使用）B类，但只用到了1，2,3方法
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface1 i){
        i.operation2();
    }
    public void depend3(Interface1 i){
        i.operation3();
    }
}
class C { //C类通过Interface1依赖（使用）D类，但只用到了1，4,5方法
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend4(Interface1 i){
        i.operation2();
    }
    public void depend5(Interface1 i){
        i.operation3();
    }
}
//解决方案：
   /*
   * 将接口1拆分成几个独立的接口，类A和类C分别与需要的接口建立关系
   *
   * */