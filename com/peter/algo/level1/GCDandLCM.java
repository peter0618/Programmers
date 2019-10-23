package com.peter.algo.level1;

import java.util.Arrays;

public class GCDandLCM {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));
        System.out.println(Arrays.toString(solution(2, 5)));
    }
    /* 
     * �ִ����� G�� ���ϸ�, n = Ga, m = Gb �� ǥ���� �� �ִ�.
     * �� ��, �ּҰ���� L = Gab���� �̿��Ͽ�  L�� ���� ���� �� �ִ�. ( n * m / G �� ��� ����)
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
