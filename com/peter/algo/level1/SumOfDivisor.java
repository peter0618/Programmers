package com.peter.algo.level1;

public class SumOfDivisor {
    public static void main(String[] args) {
        System.out.println(solution2(12));
        System.out.println(solution2(5));
    }
    
    public static int solution(int n) {
        int sum = 0;
        for(int i = 1 ; i <= n ; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    
    public static int solution2(int n) {
        int sum = 0;
        for(int i = 1 ; i <= (n/2) ; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        return sum + n;
    }

}
