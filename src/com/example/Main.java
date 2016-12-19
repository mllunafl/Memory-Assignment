package com.example;

public class Main {

    private static int loop(int num) {
        if (num == 0) {
            return 0;
        }
        int total = 1;
        for (int i = num; i > 1; i--) {
            System.out.println(total);
            total = i * total;
        }
        return total;
    }

    private static int recursive(int num, int total) {
        if (num == 1) {
            return total;
        }
        total = num * total;
        System.out.println("num recur" + num);
        System.out.println("total recur" +total);
        return recursive((num - 1), total);
    }

    private static int factorial(int num) {
        if (num < 1)
            return 0;
        if (num == 1)
            return 1;
        System.out.println("fact num" + num);
        return recursive(num, 1);
    }

    public static void main(String[] args) {
        int num = 3;
        System.out.println(loop(num));

        System.out.println(factorial(num));
    }
}

