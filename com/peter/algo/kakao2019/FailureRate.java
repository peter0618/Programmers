package com.peter.algo.kakao2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FailureRate {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[] { 2, 1, 2, 6, 2, 4, 3, 3 })));
        System.out.println(Arrays.toString(solution(4, new int[] { 4, 4, 4, 4, 4 })));

    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] cntStages = new int[N+2];
        List<Stage> list = new ArrayList<Stage>();
        for(int stage : stages) {
            cntStages[stage]++;
        }
        
        for(int i = 1 ; i <= N ; i++) {
            int sum = 0;
            for(int j = i ; j <= N+1 ; j++) {
                sum += cntStages[j];
            }
            if(sum == 0) {
                list.add(new Stage(i, 0));
                continue;
            }
            list.add(new Stage(i, ((double) cntStages[i]) / sum));
        }
        
        Collections.sort(list);
        int idx = 0;
        for(Stage stage : list) {
            answer[idx++] = stage.stageNum;
        }
        
        return answer;
    }
    
    static class Stage implements Comparable<Stage>{
        int stageNum;
        double failureRate;
        
        public Stage(int stageNum, double failureRate) {
            this.stageNum = stageNum;
            this.failureRate = failureRate;
        }
        
        @Override
        public int compareTo(Stage st) {
            if(st.failureRate == this.failureRate) {
                return this.stageNum - st.stageNum;
            }
            
            if(st.failureRate > this.failureRate) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
