package com.peter.algo.level1;

import java.util.Arrays;

public class DeleteMin {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {4,3,2,1}))); // [4,3,2]
        System.out.println(Arrays.toString(solution(new int[] {10})));      // [-1]
    }
    
    public static int[] solution(int[] arr) {
        if(arr.length == 1) {
            return new int[] {-1};
        }
        
        int min = arr[0];
        for(int i = 1; i <arr.length ; i++) {
            min = Math.min(min, arr[i]);
        }
        
        int[] answer = new int[arr.length-1];
        int idx = 0;
        
        for(int num : arr) {
            if(num != min) {
                answer[idx++] = num;
            }
        }
        return answer;
    }
    
    public static int[] solution2(int[] arr) {
        if(arr.length == 1) {
            return new int[] {-1};
        }
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(num -> num != min).toArray();
    }
}
