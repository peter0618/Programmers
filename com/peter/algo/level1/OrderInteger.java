package com.peter.algo.level1;

import java.util.Arrays;
import java.util.Collections;

public class OrderInteger {
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
    
    public static long solution(long n) {
        String[] str = Long.toString(n).split("");
        Arrays.sort(str, Collections.reverseOrder());
        return Long.parseLong(String.join("", str));
    }

}
