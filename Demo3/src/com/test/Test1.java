package com.test;

public class Test1 {

    private static   <T> void  test(T arg){
            System.out.println(arg);
    }

    public static void main(String[] args){
        test("111");
        test(1000);
    }
}
