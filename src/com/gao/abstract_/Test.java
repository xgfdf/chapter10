package com.gao.abstract_;

public class Test {
    public static void main(String[] args) {
        SuperClass superClass = new SubClass();//向上转型

        superClass.a();
        superClass.b();
        /*
        * 可以清晰的看出static修饰的方法根本就没有重写。
        * static方法引用的时候应该用类名来引用，而不是对象。
        * 同时static方法不参与继承，所以在继承体系里面也不存在重写的说法
        * */


    }
}
/*
结果：
SuperClass a
SubClass b
*/

class SuperClass{
    //静态方法
    public static void a(){
        System.out.println("SuperClass a");
    }
    //非静态方法
    public void b(){
        System.out.println("SuperClass b");
    }

}

class SubClass extends SuperClass{
    //静态方法
    public static void a(){
        System.out.println("SubClass a");
    }

    //非静态方法
    public void b(){
        System.out.println("SubClass b");
    }
}

