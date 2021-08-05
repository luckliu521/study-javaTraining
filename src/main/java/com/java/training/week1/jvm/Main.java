package com.java.training.week1.jvm;

/**
 * @version 1.0
 * @author: liujinchang
 * @create: 2021/8/5 0:48
 * @className: com.java.training.week1.jvm.StaticByteCode
 * @description: TODO
 */
public class Main {
    static int a = 10;
    static int b = 9;

    public static void main(String[] args) throws Exception{
        try {
            int x = a + b;
            int y = a * b;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        } catch (Exception e) {

        }
    }

}
