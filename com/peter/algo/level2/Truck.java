package com.peter.algo.level2;

import java.util.LinkedList;
import java.util.Queue;

public class Truck {
    public static void main(String[] args) {
        System.out.println(solution(2, 10, new int[] { 7, 4, 5, 6 })); // 8
        System.out.println(solution(100, 100, new int[] { 10 })); // 101
        System.out.println(solution(100, 100, new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 })); // 110

    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int truck_weights_idx = 0;
        int sum = 0;
        int cnt = 0;

        Queue<Integer> truckQueue = new LinkedList<Integer>();
        for (int i = 0; i < bridge_length; i++) {
            truckQueue.add(0);
        }

        while (truck_weights_idx != truck_weights.length) {
            sum -= truckQueue.poll();
            if (sum + truck_weights[truck_weights_idx] <= weight) {
                truckQueue.add(truck_weights[truck_weights_idx]);
                sum += truck_weights[truck_weights_idx];
                truck_weights_idx++;
            } else {
                truckQueue.add(0);
            }
            cnt++;
        }
        // 마지막 트럭이 다리를 건너기 시작했을 때, bridge_length초 뒤에는 모두 건너므로...
        return cnt + bridge_length;
    }
}
