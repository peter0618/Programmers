package com.peter.algo.level1;

import java.util.Arrays;

public class NumList {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2,5)));
        System.out.println(Arrays.toString(solution(4,3)));
        System.out.println(Arrays.toString(solution(-4,2)));
    }
    
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(long i = 0 ; i < n ; i++) {
            answer[(int)i] = x * (i+1);
        }
        return answer;
    }
}
