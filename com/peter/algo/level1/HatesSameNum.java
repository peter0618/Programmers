package com.peter.algo.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class HatesSameNum {

	public int[] solution(int[] arr) {
		
		ArrayList<Integer> answerList = new ArrayList<Integer>();
		int temp = -1;
		
		for(int num : arr) {
			if(temp != num) {
				answerList.add(num);
				temp = num;
			}
		}
		
		int[] answer = new int[answerList.size()];
		for(int i=0 ; i<answerList.size() ; i++) {
			answer[i] = answerList.get(i).intValue();
		}
		
		return answer;
	}
}
