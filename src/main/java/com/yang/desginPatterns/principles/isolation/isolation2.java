package com.yang.desginPatterns.principles.isolation;

public class isolation2 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());//A类通过接口依赖B
        a.depend2(new B());//A类通过接口依赖B
        a.depend3(new B());//A类通过接口依赖B
    }
}
//接口1
interface IMInterface1{
    void  operation1();
}
//接口2
interface IMInterface2{
    void  operation2();
    void  operation3();
}
//接口3
interface IMInterface3{
    void  operation4();
    void  operation5();
}

class IMB implements IMInterface1,IMInterface2{

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

}

class IMD implements IMInterface1,IMInterface3{

    @Override
    public void operation1() {
        System.out.println("D中实现了 operation1");
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

class IMA { //A类通过IMInterface1依赖（使用）B类，但只用到了1，2,3方法
    public void depend1(IMInterface1 i){
        i.operation1();
    }
    public void depend2(IMInterface2 i){
        i.operation2();
    }
    public void depend3(IMInterface2 i){
        i.operation3();
    }
}

class IMC { //C类通过Interface1依赖（使用）D类，但只用到了1，4,5方法
    public void depend1(IMInterface1 i){
        i.operation1();
    }
    public void depend4(IMInterface3 i){
        i.operation4();
    }
    public void depend5(IMInterface3 i){
        i.operation5();
    }
}
//解决方案：
   /*
   * 将接口1拆分成几个独立的接口，类A和类C分别与需要的接口建立关系
   *
   * */