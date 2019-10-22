package com.peter.algo.level1;

import java.util.Arrays;

public class Budget {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,2,5,4}, 9));
        System.out.println(solution(new int[]{2,2,3,3},  10));
        System.out.println(solution(new int[]{2,3,2,4},  7));
        System.out.println(solution(new int[]{1,2,3,4},  1000));
        System.out.println("====================================");
        System.out.println(solution2(new int[]{1,3,2,5,4}, 9));
        System.out.println(solution2(new int[]{2,2,3,3},  10));
        System.out.println(solution2(new int[]{2,3,2,4},  7));
        System.out.println(solution2(new int[]{1,2,3,4},  1000));
    }
    
    public static int solution(int[] d, int budget) {
        Arrays.sort(d);
        int sum = 0;
        int idx = 0;
        // d[0] + d[1] + ... +d[k] <= budget 이 되는 최대의 k를 찾는다.
        while(sum < budget) {
            sum += d[idx++];
            if(idx >= d.length) {   // d의 모든 원소의 sum이 budget보다 작은 경우 d[idx++]에서 OutOfBound Exception 발생하므로 회피
                break;
            }
        }
        if(sum > budget) {
            idx--;
        }
        
        return idx;
    }
    
    public static int solution2(int[] d, int budget) {
        Arrays.sort(d);
        int sum = 0;
        // d[0] + d[1] + ... +d[k] <= budget 이 되는 최대의 k를 찾는다.
        for(int i = 0 ; i < d.length ; i++) {
            if(sum < budget) {
                sum += d[i];    
            } else {
                return sum == budget ? i : (i-1);
            }
        }
        return sum <= budget ? d.length : (d.length-1);
    }
}
