package com.java.training.week1.jvm;

/**
 * @version 1.0
 * @author: liujinchang
 * @create: 2021/8/3 0:28
 * @className: com.thread.concurrent.MovingAverge
 * @description: TODO
 */
public class MovingAverge {
    private int count = 0;
    private double sum = 0.0D;

    public void submit(double value) {
        this.count++;
        this.sum += value;
    }

    public double getAvg() {
        if (0 == this.count) {
            return sum;
        }
        return this.sum / this.count;
    }
}
