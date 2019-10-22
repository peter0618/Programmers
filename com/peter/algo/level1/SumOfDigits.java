package com.peter.algo.level1;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(solution(123));
        System.out.println(solution(987));
    }
    
    public static int solution(int n) {
        int answer = 0;
        while(n != 0) {
            answer += n % 10;
            n = n / 10;
        }
        return answer;
    }
}
