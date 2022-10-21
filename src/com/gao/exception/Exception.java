package com.gao.exception;

public class Exception  {
    public static void main(String[] args) {
        System.out.println(showEcpt());

    }

    public static int showEcpt() {
        try {//可能出现异常的代码，用try包括

            int[] a = new int[5];

            System.out.println(a[5]);

            return 1;



        }catch (java.lang.Exception e){
            System.out.println("出现异常");
            //打印异常信息
            e.printStackTrace();
            return 2;

        }
        finally {
        //无论是否出现异常，finally中的代码都会在最后执行
        //如果try中有return返回值，则先执行完finally中的代码，再返回数据
        // try/catch > finally > return
            System.out.println("finally");
        }


    }
}
