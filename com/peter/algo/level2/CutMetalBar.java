package com.peter.algo.level2;

public class CutMetalBar {
    public static void main(String[] args) {
        String arrangement = "()(((()())(())()))(())";
        System.out.println(solution(arrangement)); // 17

    }

    public static int solution(String arrangement) {
        int numOfTotalBars = 0;
        int numOfBarStack = 0;
        char preCh = '0';

        for (char ch : arrangement.toCharArray()) {
            if (preCh == '(' && ch == '(') {
                numOfTotalBars++;
                numOfBarStack++;
            } else if (preCh == '(' && ch == ')') {
                numOfTotalBars += numOfBarStack;
            } else if (preCh == ')' && ch == ')') {
                numOfBarStack--;
            }
            preCh = ch;
        }

        return numOfTotalBars;
    }
}
