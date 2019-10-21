package com.peter.algo.level1;

public class Test {
    public static void main(String[] args) {

//        System.out.println(solution(3));
//        System.out.println(solution(4));
        
        String str = new String(new char[4/2+1]);
        System.out.println(str);
        
        str = str.replace("\0", "수박");
        System.out.println(str);
        System.out.println(str.substring(0,4));

    }

    public static String solution(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += ((i % 2 == 0) ? "수" : "박");
        }

        return answer;
    }
}
