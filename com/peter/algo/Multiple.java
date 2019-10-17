package com.peter.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Multiple {
	  public int[] solution2(int[] arr, int divisor) {
		  ArrayList<Integer> list = new ArrayList<Integer>();
	      for(int num : arr) {
	    	  if(num % divisor == 0) {
	    		  list.add(num);
	    	  }
	      }
	      if(list.size() == 0)
	    	  list.add(new Integer(-1));
	      
	      Collections.sort(list);
	      int[] answer = new int[list.size()];
	      for(int i=0 ; i<list.size(); i++) {
	    	  answer[i] = list.get(i).intValue();
	      }
	      return answer;
	  }
	  
	  public int[] solution1(int[] arr, int divisor) {
		  int[] answer = Arrays.stream(arr).sorted().filter(num -> num % divisor == 0).toArray();
		  return answer.length == 0 ? new int[] {-1} : answer;
	  }
}
