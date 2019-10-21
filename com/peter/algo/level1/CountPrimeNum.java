package com.peter.algo.level1;

import java.util.Collections;
import java.util.HashSet;

public class CountPrimeNum {
    
    public static void main(String[] args) {
        
        System.out.println(solution2(10));
        System.out.println(solution2(5));
    }
    
    public static int solution(int n) {
        HashSet<Integer> setS = new HashSet<Integer>();
        HashSet<Integer> primeNumSet = new HashSet<Integer>();
        
        for(int i = 2 ; i <= n ; i++) { // 1은 소수가 아니므로 미리 제외
            setS.add(new Integer(i));
        }
        
        while(true) {
            int prime = Collections.min(setS).intValue();
            primeNumSet.add(new Integer(prime));
            HashSet<Integer> mulitpleOfPrimeSet = new HashSet<Integer>();
            
            for(Integer num : setS) {
                if(num.intValue() % prime == 0) {
                    mulitpleOfPrimeSet.add(num);
                }
            }
            setS.removeAll(mulitpleOfPrimeSet);
            
            if(setS.size() == 0) {
                break;
            }
        }
        
        return primeNumSet.size();
    }
    
    public static int solution2(int n) {
        int answer = 0;
        for(int i = 2 ; i <= n ; i++) {
            boolean isDivisible = false;
            for(int j = 2 ; j <= (int)Math.sqrt(i) ; j++) {
                if( i % j == 0) {
                    isDivisible = true;
                    break;
                }
            }
            if(!isDivisible) {
                answer ++ ;
            }
        }
        return answer;
    }
}
