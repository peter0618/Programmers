package com.peter.algo.level1;

public class Collatz {
    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(16));
        System.out.println(solution(626331));
    }
    public static int solution(int num) {
        int cnt = 0;
        long lNum = num;
        while(lNum != 1) {
            if(cnt == 500) {
                return -1;
            }
            
            if(lNum % 2 == 0) {
                lNum = lNum / 2;
            } else {
                lNum = 3 * lNum + 1;
            }
            cnt++;
        }
        return cnt;
    }
}
