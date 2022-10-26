package com.gao.static_;
/*
* 类变量和类方法
●类变量-提出问题
让大家思考解决之道，从而引出知识点
说:有一群小孩在玩堆雪人，不时有新的小孩加入，请问如何知道现在共有多
少人在玩?，编写程序解决。

* */
public class ChildGame {
    public static void main(String[] args) {
        //定义一个变量，统计有几个小孩
        int count = 0;

        Child01 child01 = new Child01("白骨精");
        child01.jon();
        count++;

        Child01 child02 = new Child01("蜘蛛精");
        child01.jon();
        count++;

        Child01 child03 = new Child01("狐狸精");
        child03.jon();
        count++;

        System.out.println("一共有"+ count+"个小孩加入了游戏");
        /*
        * V问题分析:
            1. count是一个独立于对象，很尴尬
            2.以后我们访问count很麻烦，没有使用到OOP
            3.因此，我们引出类变量/静态变量*/

    }


}

//先定义一个类
class Child01{
    private String name;

    //写一个构造器

    public Child01(String name) {
        this.name = name;
    }

    //写一个方法
    public void jon(){
        System.out.println(name+"进入游戏......");
    }
}
