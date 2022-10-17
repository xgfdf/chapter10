package com.gao._dailywork;

public class _10_14 {
    public static void main(String[] args) {
        Area area = new Area(5);
        System.out.println("面积是："+area.calArea());

        f2(34);


    }
    //输入一个浮点数f, 表示华氏温度, 输出对应的摄氏温度c , c=5/9*(f-32)
    public static double f2(double n2){
        double c = 5/9*(n2-32);
        return c;


    }







}

class Area{

    private double radius;
    public final double P = 3.14;

    public Area(double radius) {
        this.radius = radius;

    }
    public double calArea(){
        return P*radius*radius;
    }
}
