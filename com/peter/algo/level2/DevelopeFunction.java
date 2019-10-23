package com.peter.algo.level2;

import java.util.ArrayList;
import java.util.Arrays;

public class DevelopeFunction {
    public static void main(String[] args) {
        int[] progresses = new int[] {93,30,55};
        int[] speeds = new int[] {1,30,5};
        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }
    
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] leftDays = new int[progresses.length];

        for (int i = 0; i < leftDays.length; i++) {
            leftDays[i] = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
        }

        int pivot = leftDays[0];    // ���س�¥
        int deployCnt = 1;          // �Բ� ������ �� �ִ� ��� ����
        ArrayList<Integer> deployCntList = new ArrayList<Integer>();
        
        for (int j = 1; j < leftDays.length; j++) {
            if (pivot >= leftDays[j]) {         // ���س�¥���� �۾����� �� ����  ���� ����� �Բ� ���� ����. 
                deployCnt++;
            } else {                            // ���س�¥���� �۾����� �� ���� ���� ����� �Բ� ���� �Ұ���. ���� ���س�¥�� ����
                deployCntList.add(deployCnt);
                pivot = leftDays[j];
                deployCnt = 1;
            }
            if (j == leftDays.length - 1) {
                deployCntList.add(deployCnt);
            }
        }

        return deployCntList.stream().mapToInt( i -> i.intValue()).toArray();
    }
}
