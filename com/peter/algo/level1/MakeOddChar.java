package com.peter.algo.level1;

public class MakeOddChar {
    public static void main(String[] args) {
        System.out.println(solution("try hello world  "));
    }
    
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ", -1);
        
        for(int i = 0 ; i < words.length ; i ++) {
            char[] chArr = words[i].toCharArray();
            for(int j = 0 ; j < chArr.length ; j++) {
                chArr[j] = ( j % 2 == 0 ) 
                            ? Character.toUpperCase(chArr[j])   // Â¦¼öÀÎµ¦½º => ´ë¹®ÀÚÈ­ 
                            : Character.toLowerCase(chArr[j]);  // È¦¼öÀÎµ¦½º => ¼Ò¹®ÀÚÈ­
            }
            sb.append(chArr);
            if(i != words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
