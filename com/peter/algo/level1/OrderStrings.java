package com.peter.algo.level1;

import java.util.Arrays;
import java.util.Comparator;

public class OrderStrings {

    public static void main(String[] args) {
        OrderStrings orderStrings = new OrderStrings();
//        String[] strings = { "sun", "bed", "car" };
//        int n = 1;

        String[] strings = { "abce", "abcd", "cdx" };
        int n = 2;

        orderStrings.solution(strings, n);
        System.out.println(Arrays.toString(strings));
    }

    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
//                if (s1.charAt(n) > s2.charAt(n)) {
//                    return 1;
//                } else if (s1.charAt(n) == s2.charAt(n)) {
//                    return s1.compareTo(s2);
//                } else {
//                    return -1;
//                }
                if (s1.charAt(n) == s2.charAt(n)) {
                    return s1.compareTo(s2);
                } else {
                    return s1.charAt(n) - s2.charAt(n);
                }
            };
        });

        return strings;
    }
}
