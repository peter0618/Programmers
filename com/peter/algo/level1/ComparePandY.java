package com.peter.algo.level1;

public class ComparePandY {
	public boolean solution(String s) {
		
		int cntP = 0;
		int cntY = 0;
		for(int i=0 ; i<s.length(); i++) {
			if(s.charAt(i)=='Y' || s.charAt(i)=='y')
				cntY++;
			if(s.charAt(i)=='P' || s.charAt(i)=='p')
				cntP++;
		}
		return cntP == cntY ? true : false; // return cntP == cntY;
	}
	
	// ��Ʈ���� ���� �ڵ�� ������������, Ȯ���� �ӵ��� ���� 
	public boolean solution2(String s) {
		
		return     s.toLowerCase().chars().filter( c -> c == 'y').count() 
				== s.toLowerCase().chars().filter( c -> c == 'p').count();
	}
}
