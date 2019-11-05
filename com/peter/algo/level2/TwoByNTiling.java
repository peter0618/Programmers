package com.peter.algo.level2;

public class TwoByNTiling {
    public static void main(String[] args) {
        System.out.println(solution(1)); // 1
        System.out.println(solution(2)); // 2
        System.out.println(solution(3)); // 3
        System.out.println(solution(4)); // 5
        System.out.println(solution(5)); // 8
    }

    public static int solution(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        
        int answer = 2;
        int preAnswer = 1;
        
        for (int i = 0; i < (n - 2); i++) {
            int temp = answer;
            answer += preAnswer;
            answer %= 1000000007;
            preAnswer = temp;
        }
        return answer;
    }
}
