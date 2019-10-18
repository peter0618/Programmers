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
	
	// 스트림을 쓰면 코드는 간결해지지만, 확실히 속도는 느림 
	public boolean solution2(String s) {
		
		return     s.toLowerCase().chars().filter( c -> c == 'y').count() 
				== s.toLowerCase().chars().filter( c -> c == 'p').count();
	}
}
