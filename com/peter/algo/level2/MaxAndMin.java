package com.peter.algo.level2;

import java.util.Arrays;

public class MaxAndMin {
    public static void main(String[] args) {
        System.out.println(solution("1 2 3 4"));
        System.out.println(solution("-1 -2 -3 -4"));
        System.out.println(solution("-1 -1"));
    }
    
    public static String solution(String s) {
        String[] numStrArray = s.split(" ");
        int[] numArray = new int[numStrArray.length];
        for(int i = 0 ; i < numArray.length ; i++) {
            numArray[i] = Integer.parseInt(numStrArray[i]);
        }
        Arrays.sort(numArray);
        return String.valueOf(numArray[0]) + " " + String.valueOf(numArray[numArray.length-1]);
    }
}
