package com.peter.algo.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class StringSortDesc {
    
    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));
    }
    
    public static String solution(String s) {
        Character[] cArr = s.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
//        Arrays.sort(cArr, new Comparator<Character>() {
//            @Override
//            public int compare(Character c1, Character c2) {
//                return c2.compareTo(c1);            // 문자 정렬 순서 반대로 변경 (c1.comp(c2)가 default)
//            }
//        });
        Arrays.sort(cArr, Collections.reverseOrder() );
        return Arrays.stream(cArr).map(String::valueOf).collect(Collectors.joining());
    }
}
