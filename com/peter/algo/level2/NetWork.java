package com.peter.algo.level2;

import java.util.Stack;

public class NetWork {
    public static void main(String[] args) {
        System.out.println(solution(3, new int[][] { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } }));
        System.out.println(solution(3, new int[][] { { 1, 1, 0 }, { 1, 1, 1 }, { 0, 1, 1 } }));
        System.out.println(solution(3, new int[][] { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }));
        System.out.println(solution(4, new int[][] { { 1, 1, 0, 0 }, { 0, 1, 0, 1 }, { 0, 0, 1, 0 }, { 0, 1, 0, 1 } }));
        System.out.println(solution(5, new int[][] { { 1, 0, 1, 0, 0 }, { 0, 1, 0, 1, 1 }, { 1, 0, 1, 0, 0 },
                { 0, 1, 0, 1, 0 }, { 0, 1, 0, 0, 1 } }));
    }

    public static int solution(int n, int[][] computers) {
        boolean[] visitedArr = new boolean[computers.length]; // 모두 false로 초기화
        Stack<Integer> computerStack = new Stack<Integer>();

        int cntNetWork = 0;

        while (!isVistedAll(visitedArr)) {
            int startVertex = findNotVisited(visitedArr);
            visitedArr[startVertex] = true;
            computerStack.add(startVertex);

            while (computerStack.size() != 0) {
                int vertax = computerStack.peek();
                boolean hasMorePath = false;
                for (int j = 0; j < computers[vertax].length; j++) {
                    if (computers[vertax][j] == 1 && j != vertax && !visitedArr[j]) {
                        computerStack.add(j);
                        visitedArr[j] = true;
                        hasMorePath = true;
                        break;
                    }
                }
                if (!hasMorePath) {
                    computerStack.pop();
                }
            }
            cntNetWork++;
        }
        return cntNetWork;
    }

    static boolean isVistedAll(boolean[] visitedArr) {
        for (boolean visited : visitedArr) {
            if (!visited) {
                return false;
            }
        }
        return true;
    }

    static int findNotVisited(boolean[] visitedArr) {
        for (int i = 0; i < visitedArr.length; i++) {
            if (!visitedArr[i]) {
                return i;
            }
        }
        return -1;
    }
}
