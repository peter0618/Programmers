package com.peter.algo.level1;

import java.util.Arrays;

public class CompressString {
    public static void main(String[] args) {
        String str = "abcabcabcabcdededededede";
        System.out.println(solution(str));
    }
    
    public static int solution(String str) {
        int answer = str.length();
        
        for(int count = 1 ; count <= str.length()/2 ; count++) {
            String[] tokens = str.split("(?<=\\G.{"+count+"})");
            StringBuilder sb = new StringBuilder();
            String temp = "";
            int dupleCnt = 0;
            for(int i = 0 ; i < tokens.length ; i++) {
                if(!temp.equals(tokens[i])) {
                    if(dupleCnt >= 2) {
                        sb.append(String.valueOf(dupleCnt));
                    }
                    sb.append(temp);
                    temp = tokens[i];
                    dupleCnt = 1;
                } else {
                    dupleCnt++;
                }
                
                if(i == tokens.length-1) {
                    if(dupleCnt >= 2) {
                        sb.append(String.valueOf(dupleCnt));
                    }
                    sb.append(temp);
                }
            }
            answer = Math.min(answer, sb.toString().length());
            System.out.println(Arrays.toString(tokens));
            System.out.println(sb.toString());
        }
  
        return answer;
    }
}
