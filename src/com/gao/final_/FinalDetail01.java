package com.gao.final_;

public class FinalDetail01 {
    public static void main(String[] args) {
        CC cc = new CC();//final类不能继承，但是可以实例化对象

        new EE().cal();

        new AA(15);




    }
}

class AA {
    /*
    1. 定义时：如 public final double TAX_RATE=0.08;
    2. 在构造器中;用构造器传入的参数赋值  或者 在构造器中直接赋值
    3. 在代码块中
     */
    public final double TAX_RATE = 0.08;//1.定义时赋值
    public final double TAX_RATE2 ;
    public final double TAX_RATE3 ;

    public AA(double tax2) {//可以用构造器传入的参数赋值
        this.TAX_RATE2 = tax2;
        System.out.println(TAX_RATE2);
    }



    {//在代码块赋值
        TAX_RATE3 = 8.8;
    }
}

class BB {
    /*
    如果final修饰的属性是静态的，则初始化的位置只能是
    1 定义时
    2 在静态代码块

      不能在构造器中赋值。
     */
    public static final double TAX_RATE = 99.9;
  //  public static final double TAX_RATE2 ;
    public static final double TAX_RATE3 ;

    //构造器在创建对象的时候才会被调用，
    // 而静态变量的初始化是在类加载的时候就得赋值
    //类加载了，但是没给值是不行的
    public BB() {
       // TAX_RATE2 = 0.2;
    }

    static {
        TAX_RATE3 = 3.3;
    }


}

//final类不能继承，但是可以实例化对象
final class CC {

}


//如果类不是final类，但是含有final方法，则该方法虽然不能重写，但是可以被继承
//即，仍然遵守继承的机制.
class DD {
    public final void cal() {
        System.out.println("cal()方法");
    }
}
class EE extends DD { }


//在构造器中直接赋值
class FF{
    public final double TAX_RATE4;

    public FF() {
        TAX_RATE4 = 15.0;
    }
}
