package com.peter.algo.level2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class MoreSpicy {
    public static void main(String[] args) {
        System.out.println(solution(new int[] { 1, 2, 3, 9, 10, 12 }, 7));
        System.out.println(solution(new int[] { 1, 1 }, 100));
    }
    
    // 시간복잡도에서 걸림
    public static int solution2(int[] scoville, int K) {
        int answer = 0;

        LinkedList<Integer> list = new LinkedList<>();
        for (int num : scoville) {
            list.add(num);
        }
        Collections.sort(list);

        int min = list.getFirst();
        while (min < K) {
            list.removeFirst();
            int minsecnd = list.getFirst();
            list.removeFirst();

            int nextNum = min + (minsecnd * 2);
            int index = -1;
            for (int i = 0; i < list.size(); i++) {
                if (nextNum < list.get(i)) {
                    index = i;
                    break;
                }
            }

            if (list.size() == 0) {
                list.add(nextNum);
            } else if (index == -1) {
                list.addLast(nextNum);
            } else {
                list.add(index, nextNum);
            }

//            list.add(nextNum);
//            Collections.sort(list);
            System.out.println(list.toString());
            min = list.getFirst();
            answer++;
            if (list.size() == 1) {
                if (min < K) {
                    return -1;
                } else {
                    break;
                }
            }
        }
        return answer;
    }
    
    public static int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for (int num : scoville) {
            queue.add(num);
        }

        int min = queue.peek();
        while (min < K) {
            queue.poll();
            int minsecnd = queue.poll();
            queue.add(min + (minsecnd * 2));
            System.out.println(queue.toString());
            min = queue.peek();
            answer++;
            if (queue.size() == 1) {
                if (min < K) {
                    return -1;
                } else {
                    break;
                }
            }
        }
        return answer;
    }
}
