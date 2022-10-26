package com.gao;

public class Test02{
    public static Test t1 = new Test();

    {
        System.out.println("blockA");
    }
    static{
        System.out.println("blockB");
    }
    public static void main(String[] args){
        Test02 t2 = new Test02();
    }
}
