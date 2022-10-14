package com.gao._dailywork;

public class _10_14 {
    public static void main(String[] args) {
        Area area = new Area(5);
        System.out.println("面积是："+area.calArea());


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
