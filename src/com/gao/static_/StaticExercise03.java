package com.gao.static_;

public class StaticExercise03 {
}

class Person03 {
    private int id;
    private static int total = 0;
    public static void setTotalPerson(int total){
        // this.total = total;//错误，因为在static方法中，不可以使用this 关键字
        //改成下面这样就可以了！
        Person03.total = total;
    }
    public Person03() {//构造器
        total++;
        id = total;
    }
    //编写一个方法，输出total的值
    public static void m() {
        System.out.println("total的值=" + total);
    }
}
class TestPerson03 {
    public static void main(String[] args) {

        Person03.setTotalPerson(3);
        new Person(); //构造器里初始化对象;最后 total的值就是4
        Person03.m();//看看输出的是不是4
    }
}