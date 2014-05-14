package com.ruan65.fibo;

import com.ruan65.util.Generator;
import java.util.Arrays;

public class FiboGenRunnable implements Generator<Integer>, Runnable {

    private int num;
    private final int len;

    public FiboGenRunnable(int len) {
        this.len = len;
    }

    private int fibo(int n) {
        return n < 2 ? 1 : fibo(n - 2) + fibo(n - 1);
    }

    public Integer next() {
        return fibo(num++);
    }

    public void run() {
        int[] row = new int[len];
        for (int i = 0; i < len; i++) {
            row[i] = next();
        }
        System.out.println(Arrays.toString(row));
    }
}

class App {
    public static void main(String[] args) {

        for (int i = 0; i < 15; i++) {
            new Thread(new FiboGenRunnable(i)).start();
        }
    }
}