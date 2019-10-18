package com.peter.algo.level1;

import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("hello");
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
//		System.out.println("answer is : " + solution(participant, completion) );
		System.out.println("answer is : " + solution2(participant, completion) );
	}
	

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> partiMap = new HashMap<>();
        HashMap<String, Integer> complMap = new HashMap<>();
        
        for(String name : participant) {
        	if(partiMap.containsKey(name)) {
        		partiMap.put(name, partiMap.get(name)+1);
        	} else {
        		partiMap.put(name, 1);
        	}
        }
        
        for(String name : completion) {
        	if(complMap.containsKey(name)) {
        		complMap.put(name, complMap.get(name)+1);
        	} else {
        		complMap.put(name, 1);
        	}
        }
        
        for(String name : participant) {
        	if(!complMap.containsKey(name) || complMap.get(name) != partiMap.get(name)) {
        		answer = name;
        		break;
        	}
        }
        
        return answer;
    }
    
    public static String solution2(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> complMap = new HashMap<>();
        for(String name : completion) {
        	if(complMap.containsKey(name)) {
        		complMap.put(name, complMap.get(name)+1);
        	} else {
        		complMap.put(name, 1);
        	}
        }
        
        for(String name : participant) {
        	if(!complMap.containsKey(name) || complMap.get(name) < 1) {
        		answer = name;
        		break;
        	} else {
        		complMap.put(name, complMap.get(name)-1);
        	}
        }
        
        return answer;
    }
}
