package com.gao.final_;

public class AA {
    /*
    1. 定义时：如 public final double TAX_RATE=0.08;
    2. 在构造器中;用构造器传入的参数赋值  或者 在构造器中直接赋值
    3. 在代码块中
     */
    public final double TAX_RATE = 0.08;//1.定义时赋值
    public final double TAX_RATE2;
    public final double TAX_RATE3;

    public AA(double tax2) {//可以用构造器传入的参数赋值
        this.TAX_RATE2 = tax2;
        System.out.println(TAX_RATE2);
    }


    {//在代码块赋值
        TAX_RATE3 = 8.8;
    }

    public void calculateTime() {
    }
}
