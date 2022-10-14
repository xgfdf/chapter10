package com.gao.final_;

public class Test {
    public static void main(String[] args) {
        new TTT("SD");

        TTT ttt = new TTT();
        ttt.name= "sdf ";

    }
}

class TTT{
    String name;


    public TTT() {
    }

    public TTT(String name) {
        this.name = name;
    }
}
