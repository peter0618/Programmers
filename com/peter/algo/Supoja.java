package com.peter.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Supoja {
	public static void main(String[] args) {
		
		int[] answers = {1,2,3,4,5};
//		int[] answers = {1,3,2,4,2};
		
		System.out.println(Arrays.toString(solution(answers)));
		
	}
	
    public static int[] solution(int[] answers) {
        int[] answer = {};
        ArrayList<Integer> answerList = new ArrayList<>();
        
        int[] pattern1 = {1,2,3,4,5}; 			// 1번 패턴 1,2,3,4,5 반복
        int[] pattern2 = {2,1,2,3,2,4,2,5}; 	// 2번 패턴 2,1,2,3,2,4,2,5 반복
        int[] pattern3 = {3,3,1,1,2,2,4,4,5,5}; // 3번 패턴 3,3,1,1,2,2,4,4,5,5 반복
        
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        
        // 1번,2번,3번 패턴으로 채점 (맞은 갯수 카운트)
        for(int i=0 ; i<answers.length; i++) {
        	if(answers[i] == pattern1[i % 5])
        		cnt1++;
        	if(answers[i] == pattern2[i % 8])
        		cnt2++;
        	if(answers[i] == pattern3[i % 10])
        		cnt3++;
        }
        
        // 맞은 갯수 비교해서 가장 높은 점수 리턴
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, cnt1);
        map.put(2, cnt2);
        map.put(3, cnt3);
        
        int maxCnt = 0;
        if(cnt1 >= cnt2) {
        	if(cnt1 >= cnt3) maxCnt = cnt1;
        	else maxCnt = cnt3;
        } else {
        	if(cnt2 >= cnt3) maxCnt = cnt2;
        	else maxCnt = cnt3;
        }
        
        // 최고점 동점자를 알아내어 answerList에 저장(순서대로)
        for(int key=1 ; key<=3 ; key++) {
        	if(map.get(key) == maxCnt)
        		answerList.add(key);
        }
        
        answer = new int[answerList.size()];
        for(int i=0 ; i<answer.length ; i++) {
        	answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}
