package com.peter.algo.level2;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {2,1,3,2}, 2));
        System.out.println(solution(new int[] {1,1,9,1,1,1}, 0));
    }

    public static int solution(int[] priorities, int location) {
        Queue<Document> docQueue = new LinkedList<Document>();
        for(int i = 0 ; i < priorities.length ; i++) {
            Document doc = new Document(priorities[i], i); 
            docQueue.add(doc);
        }
        
        int printCnt = 0;
        int printLoc = -1;
        
        do {
            Document tempDoc = docQueue.poll();
            for(Document doc : docQueue) {
                if(tempDoc.priority < doc.priority) {
                    docQueue.add(tempDoc);
                    break;
                }
            }
            if(!docQueue.contains(tempDoc)) {
                printCnt++;
                printLoc = tempDoc.loc;
            }    
            
        } while(location != printLoc);
        
        return printCnt;
    }
    
    public static class Document{
        int priority;
        int loc;
        
        public Document(int priority, int loc) {
            this.priority = priority;
            this.loc = loc;
        }
    }
    

}


