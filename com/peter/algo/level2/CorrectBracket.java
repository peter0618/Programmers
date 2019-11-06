package com.peter.algo.level2;

import java.util.Stack;

public class CorrectBracket {
    public static void main(String[] args) {
        System.out.println(solution("()()"));
        System.out.println(solution("(())()"));
        System.out.println(solution(")()("));
        System.out.println(solution("(()("));
    }

    static boolean solution(String s) {
        Stack<Integer> stack = new Stack<Integer>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(1);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            stack.pop();
        }
        return stack.size() == 0;
    }
}
