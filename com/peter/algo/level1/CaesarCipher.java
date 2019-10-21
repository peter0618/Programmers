package com.peter.algo.level1;

public class CaesarCipher {
    public static void main(String[] args) {
        
        System.out.println(solution("AB", 1));
        System.out.println(solution("z", 1));
        System.out.println(solution("a B z", 4));
    }
    
    public static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(c == ' ') {
                sb.append(c);
                continue;
            }
            if( 'A' <= c && c <= 'Z') {
                c = (char)(c + n);
                if(c > 'Z') {
                    c = (char) (c - 26);
                }
            }
            if( 'a' <= c && c <= 'z') {
                c = (char)(c + n);
                if(c > 'z') {
                    c = (char) (c - 26);
                }
            }
            
            sb.append(c);
        }
        
        return sb.toString();
    }
}
