package com.peter.algo.level2;

public class NextBigNumber {
    public static void main(String[] args) {
        System.out.println(solution(78));   //83
        System.out.println(solution(15));   //23
    }
    
    public static int solution(int n) {
        int cntOne = getCntOne(Integer.toBinaryString(n));
        
        do {
            n++;
        } while (getCntOne(Integer.toBinaryString(n)) > cntOne );
        int leftOne = cntOne - getCntOne(Integer.toBinaryString(n));
        for(int i = 0 ; i < leftOne ; i++) {
            n += Math.pow(2, i);
        }
        
        return n;
    }
    
    // Integer.bitCount(int n) 함수를 써서 처리해도 됨...
    public static int getCntOne(String binaryString) {
        int cntOne = 0;
        for(char ch : binaryString.toCharArray()) {
            if(ch == '1') {
                cntOne++;
            }
        }
        return cntOne;
    }
}
