package com.peter.algo.level1;

public class HidePhoneNum {
    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
        System.out.println(solution("027778888"));
    }
    
    public static String solution(String phNum) {
        StringBuilder sb = new StringBuilder(phNum.length());
        for(int i = 0 ; i < phNum.length()-4 ; i++) {
            sb.append("*");
        }
        sb.append(phNum.substring(phNum.length()-4));
        return sb.toString();
    }
}
