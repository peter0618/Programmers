package com.peter.algo.level1;

import java.util.Arrays;

public class GCDandLCM {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));
        System.out.println(Arrays.toString(solution(2, 5)));
    }
    /* 
     * 최대공약수 G를 구하면, n = Ga, m = Gb 로 표현할 수 있다.
     * 이 때, 최소공배수 L = Gab임을 이용하여  L을 쉽게 구할 수 있다. ( n * m / G 로 계산 가능)
     */
    public static int[] solution(int n, int m) {
        int G = 1;
        for(int i = 1 ; i <= Math.min(n, m) ; i++) {
            if( (n % i == 0) && (m % i == 0)) {
                G = i;
            }
        }
        return new int[] {G, n * m / G };
    }
}
