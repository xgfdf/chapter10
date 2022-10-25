package com.gao;

public class Test {
    public static void main(String[] args) {

        byte bb = 1;
        int aa = bb + 1;

        float aaa = 1.5f;
        int aaaa = (int) aaa;
        System.out.println(aaaa);



        char c  = 98;
        //System.out.println(c);

        char d = 97;
        int e = d;
        System.out.println(e);

        System.out.println(d);
        d+=e;
        System.out.println(d);


        int A = 21;
        char AA = (char) A;

        int ddd = 1;
        char bbb = 'a' ;  //bbb 显示转换
        System.out.println(bbb);
        char ccc = 23;


        short s = 2;
        //s = s + 1;
        //编译错误,数字1是int类型，
        // 表示的范围大于short，不能自动类型转换

        short s1 = 1;
        s1 += 1;
        //+= 相当于相当于s1 = (short)(s1 + 1)会把s1 + 1强制转换为short类型


        //s = s + 1，s ＋ 1会隐式转换为int型，把int型号赋给short，会造成类型缺失。
        // 而s1 += 1相当于s1 = (short)(s1 + 1)会把s1 + 1强制转换为short类型，就不会报错


        long l = 158;
        float ll = l+23;

        float g = 1587;
        //long gg = g+45;

    }
}
