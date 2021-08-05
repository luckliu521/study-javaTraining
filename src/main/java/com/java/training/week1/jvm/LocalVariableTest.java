package com.java.training.week1.jvm;

/**
 * @version 1.0
 * @author: liujinchang
 * @create: 2021/8/3 0:28
 * @className: com.thread.concurrent.LocalVariableTest
 * @description: TODO
 */
public class LocalVariableTest {
    public static void main(String[] args) {
        MovingAverge ma = new MovingAverge();
        int num1 = 1;
        int num2 = 2;
        ma.submit(num1);
        ma.submit(num2);
        double avg = ma.getAvg();
    }
}
