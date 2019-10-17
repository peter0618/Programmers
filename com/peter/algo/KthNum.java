package com.peter.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class KthNum {
	public static void main(String[] args) {
		
		int[] array = { 1,5,2,6,3,7,4};
		int[][] commands = { {2,5,3}, {4,4,1}, {1,7,3} };
			
		int[] sol = solution(array, commands);
		System.out.println(Arrays.toString(sol));
	}
	
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        
        answer = new int[commands.length];
        
        for(int idx=0 ; idx<commands.length ; idx++) {
        	int[] command = commands[idx];
        	int i = command[0];
        	int j = command[1];
        	int k = command[2];
        	   	
        	ArrayList<Integer> list = new ArrayList<Integer>();
        	
        	for(int idx2 = i-1 ; idx2 < j ; idx2++) {
        		list.add(array[idx2]);
        	}
        	Collections.sort(list);
        	answer[idx] = list.get(k-1);
        	
        	/* �Ʒ��Ͱ��� �ϸ� ���� ����� �ڵ尡 ������, �ӵ��� ���� �� ���� �����̴�...
        	int[] subArr = Arrays.copyOfRange(array, i-1, j);
        	Arrays.sort(subArr);
        	answer[idx] = subArr[k-1];
        	*/
        }
        
        return answer;
    }
}
