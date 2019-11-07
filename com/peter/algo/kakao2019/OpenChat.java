package com.peter.algo.kakao2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class OpenChat {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        System.out.println(Arrays.toString(solution(record)));
    }
    
    public static String[] solution(String[] record) {
        ArrayList<String> list = new ArrayList<String>();
        HashMap<String, String> nickMap = new HashMap<String, String>();
        
        for(String chatLog : record) {
            String[] tokens = chatLog.split(" ");
            String action = tokens[0];
            String uid = tokens[1];
            
            if(action.equals("Enter")) {
                list.add("E " + uid);
                nickMap.put(uid, tokens[2]);
            } else if(action.equals("Leave")) {
                list.add("L " + uid);
            } else { // "Change"
                nickMap.put(uid, tokens[2]);
            }
        }
        
        String[] answer = new String[list.size()];
        for (int i = 0 ; i < answer.length ; i++) {
            String[] token = list.get(i).split(" ");
            if(token[0].equals("E")) {
                answer[i] = nickMap.get(token[1]) + "´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.";
            } else { // L
                answer[i] = nickMap.get(token[1]) + "´ÔÀÌ ³ª°¬½À´Ï´Ù.";
            }
        }
        
        return answer;
    }
    
}
