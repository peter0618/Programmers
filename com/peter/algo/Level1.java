package com.peter.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Level1 {
	public static void main(String[] args) {
		
		int[] d = {2,2,3,3};
//		int[] d = {1,3,2,5,4};
		int budget = 10;
		int answer = 0;
		
		
		ArrayList<Integer> reqList = new ArrayList<Integer>();
		for(int num : d) {
			reqList.add(num);
		}
		Collections.sort(reqList);
		
		int sum = 0;
		for(int i=0 ; i<reqList.size(); i++) {
			int num = reqList.get(i);
			if(sum + num > budget) {
				answer = i;
				break;
			} else {
				sum += num;
			}
		}
		if(sum == budget)
			answer = reqList.size();

		
		
		System.out.println("sum : " + sum);
		System.out.println("answer : " + answer);
		
		
	}
}
