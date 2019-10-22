package com.peter.algo.level1;

public class DetermineSquare {
    public static void main(String[] args) {
        System.out.println(solution(121));
        System.out.println(solution(3));
    }

    public static long solution(long n) {
        if (n == ((long) Math.sqrt(n)) * ((long) Math.sqrt(n))) {
            return ((long) Math.sqrt(n) + 1) * ((long) Math.sqrt(n) + 1);
        } else {
            return -1;
        }
    }
}
