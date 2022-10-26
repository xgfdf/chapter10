package com.gao.static_;

public class StaticExercise02 {
}
class Person {
    private int id;
    private static int total = 0;
    public static int getTotalPerson() {
        //id++;//错误, 注销

        return total;
    }
    public Person() {//构造器,属于非静态方法，可以访问量所有成员
        total++;  //total = 1
        id = total;//id = 1
    }
}
 class TestPerson {
    public static void main(String[] args) {
        System.out.println("Number of total is " +Person.getTotalPerson()); //0

        Person p1 = new Person();//new了一个Person对象，就会走 构造器方法


        System.out.println( "Number of total is "+ Person.getTotalPerson()); //1
    }
}
