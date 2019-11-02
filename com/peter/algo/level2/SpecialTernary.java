package com.peter.algo.level2;

public class SpecialTernary {
    public static void main(String[] args) {
        for(int i=1 ; i < 14 ; i++) {
            System.out.println(solution(i));
        }
    }
    
    /*
     * 0) 기본 아이디어는 10진수 -> 3진법 변환때 주로 사용하는 반복적으로 나머지구하기
     * 1) 3으로 나눈 나머지를 순차적으로 구하되, 3으로 나누어 떨어지는 경우 몫을 하나 줄이고 나머지를 3으로 인식하면 됨.(0이 없기 떄문) 
     * 2) 3을 4로 바꿈 
     * 3) 전체를 reverse
     */
    public static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 3) {
            if (n % 3 == 0) {
                sb.append(3);
                n = n / 3 - 1;
            } else {
                sb.append(n % 3);
                n = n / 3;
            }
        }
        return sb.append(n).reverse().toString().replace('3', '4');
    }
}
