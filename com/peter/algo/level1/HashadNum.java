package com.peter.algo.level1;

public class HashadNum {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));
    }
    
    public static boolean solution(int x) {
        int sum = 0;
        int temp = x;

        while(temp != 0) {
            sum += temp % 10;
            temp /= 10;    
        }
        
        return x % sum == 0;
    }
}
