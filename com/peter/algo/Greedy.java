package com.peter.algo;

import java.util.HashSet;

public class Greedy {
	public static void main(String[] args) {
		int n = 3;
		int[] lost = {3};
		int[] reserve = {1};
		
		System.out.println("the answer is : " + solution(n,lost,reserve));
	}
	
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        HashSet<Integer> setL = new HashSet<Integer>();
        for(int num : lost) {
        	setL.add(num);
        }
        
        HashSet<Integer> setR = new HashSet<Integer>();
        for(int num : reserve) {
        	setR.add(num);
        }
        
        // 교집합 제거 
        HashSet<Integer> intersection = new HashSet<Integer>(setL);
        intersection.retainAll(setR);
        
        setL.removeAll(intersection);
        setR.removeAll(intersection);
        
        int sizeOfL = setL.size();
        
        while(true) {
        	
        	// setR에 있는 원소 a중 d(a,l) = 1인 L의 원소 l이 1개만 있으면 지운다.
        	for(int r : setR) {
        		if(setL.contains(r-1) && !setL.contains(r+1)) {
        			setL.remove(r-1);
        			setR.remove(r);
        			break;
        		} else if(!setL.contains(r-1) && setL.contains(r+1)) {
        			setL.remove(r+1);
        			setR.remove(r);
        			break;
        		} else if(setL.contains(r-1) && setL.contains(r+1)) {
        			setL.remove(r-1);
        			setR.remove(r);
        			break;
        		}
        	}
        	if(sizeOfL == setL.size())
        		break;
        	sizeOfL = setL.size();
        }
        
        System.out.println(setL.toString());
        answer = n - sizeOfL;
        
        return answer;
    }
}
