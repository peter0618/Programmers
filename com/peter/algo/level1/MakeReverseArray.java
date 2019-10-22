package com.peter.algo.level1;

import java.util.Arrays;

public class MakeReverseArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
    }
    
    public static int[] solution(long n) {
        String revN = new StringBuilder(String.valueOf(n)).reverse().toString();
        int[] answer = new int[revN.length()];
        for(int i = 0 ; i < answer.length ; i++) {
            answer[i] = Integer.parseInt(String.valueOf(revN.charAt(i)));
        }
        return answer;
    }
}
