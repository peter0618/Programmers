package com.peter.algo.level2;

import java.util.HashMap;

public class Camouflage {
    public static void main(String[] args) {

        String[][] clothes1 = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
                                { "green_turban", "headgear" } };
        String[][] clothes2 = { { "crow_mask", "face" }, { "blue_sunglasses", "face" }, 
                                { "smoky_makeup", "face" } };

        System.out.println(solution(clothes1)); // 5
        System.out.println(solution(clothes2)); // 3
    }

    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1];
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }

        for (String key : map.keySet()) {
            answer *= (map.get(key) + 1);
        }
        return answer - 1;
    }
}
