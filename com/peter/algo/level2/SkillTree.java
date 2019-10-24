package com.peter.algo.level2;

import java.util.LinkedList;
import java.util.Queue;

public class SkillTree {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };
        System.out.println(solution(skill, skill_trees));

    }

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String tree : skill_trees) {
            if (isAvailable(skill, tree)) {
                answer++;
            }
        }

        return answer;
    }

    public static boolean isAvailable(String skill, String tree) {

        Queue<Character> cQueue = new LinkedList<Character>();
        for (int i = 0; i < skill.length(); i++) {
            cQueue.add(skill.charAt(i));
        }

        for (int i = 0; i < tree.length(); i++) {
            char c = tree.charAt(i);
            if (cQueue.contains(c)) {
                if (cQueue.poll() == c) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
