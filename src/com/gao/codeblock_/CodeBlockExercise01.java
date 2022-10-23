package com.gao.codeblock_;

public class CodeBlockExercise01 {
}
class Person {
    public static int total;//静态变量
    static {
         total = 100;
         System.out.println("in static block!");//(1)
    }
}

class Test01 {
    public static void main(String[] args) {
        //你不可能加载类加载一半之后输出total，要等变量和代码块加载完才行
        System.out.println("total = "+ Person.total); //100
        System.out.println("total = "+ Person.total); //100
        //输出结果：
        //in static block!
        //total = 100
        //total = 100
    }
}
