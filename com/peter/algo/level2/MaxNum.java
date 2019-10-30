package com.peter.algo.level2;

import java.util.Arrays;
import java.util.Comparator;

public class MaxNum {
    public static void main(String[] args) {
        System.out.println(solution(new int[] { 6, 10, 2 }));
        System.out.println(solution(new int[] { 3, 30, 34, 5, 9 }));
        System.out.println(solution(new int[] { 998, 9, 999}));
        System.out.println(solution(new int[] { 0, 0, 70}));
        System.out.println(solution(new int[] { 0, 0, 0, 0}));
        System.out.println(solution(new int[] { 20, 200, 20}));
    }

    public static String solution(int[] numbers) {
        int sum = 0;
        String[] strArr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strArr[i] = String.valueOf(numbers[i]);
            sum += numbers[i];
        }
        if(sum == 0) {
            return "0";
        }
        
        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {

                if(s1.charAt(0) == s2.charAt(0)) {
                    return (s2+s1).compareTo(s1+s2);
                }
                return s2.compareTo(s1);
            }
        };

        Arrays.sort(strArr, com);

        System.out.println(Arrays.toString(strArr));
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }

        return sb.toString();
    }
}
