package com.gao.codeblock_;

public class Son{
    String name;
    static {
        System. out . println( "静态代码块");
    }
    public Son() {//构造器
        System. out. println("构造方法");
    }



    {
        System. out . println( "代码块");
    }
    public static void main(String[] args) {
        new Son();
    }
}