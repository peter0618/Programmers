package com.peter.algo.level2;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(solution(3)); // 2
        System.out.println(solution(5)); // 5
    }
    
    public static int solution(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // n >= 2
        int n1 = 0;
        int n2 = 1;
        int temp = 0;
        
        for (int i = 0; i < n - 1; i++) {
            temp = n2;
            n2 = (n1 + n2) % 1234567;
            n1 = temp;
        }
        return n2;
    }
}
