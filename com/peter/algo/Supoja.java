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
        
        int[] pattern1 = {1,2,3,4,5}; 			// 1�� ���� 1,2,3,4,5 �ݺ�
        int[] pattern2 = {2,1,2,3,2,4,2,5}; 	// 2�� ���� 2,1,2,3,2,4,2,5 �ݺ�
        int[] pattern3 = {3,3,1,1,2,2,4,4,5,5}; // 3�� ���� 3,3,1,1,2,2,4,4,5,5 �ݺ�
        
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        
        // 1��,2��,3�� �������� ä�� (���� ���� ī��Ʈ)
        for(int i=0 ; i<answers.length; i++) {
        	if(answers[i] == pattern1[i % 5])
        		cnt1++;
        	if(answers[i] == pattern2[i % 8])
        		cnt2++;
        	if(answers[i] == pattern3[i % 10])
        		cnt3++;
        }
        
        // ���� ���� ���ؼ� ���� ���� ���� ����
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
        
        // �ְ��� �����ڸ� �˾Ƴ��� answerList�� ����(�������)
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
