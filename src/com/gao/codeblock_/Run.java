package com.gao.codeblock_;

public class Run {
    static int a = 1;

    static {
        a += 1;
    }

    public static void main(String[] args) {
        System.out.println(a);
    }

    static {

        a /= 3;
    }

}
