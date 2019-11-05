package com.peter.algo.level2;

import java.util.Arrays;

public class Carpet {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10, 2)));
        System.out.println(Arrays.toString(solution(8, 1)));
        System.out.println(Arrays.toString(solution(24, 24)));
    }

    public static int[] solution(int brown, int red) {
        int sumOfWidthRedAndHeightRed = (brown - 4) / 2;
        int widthRed = sumOfWidthRedAndHeightRed - 1;
        int heightRed = 1;
        while (red != widthRed * heightRed) {
            widthRed--;
            heightRed++;
        }
        return new int[] { widthRed + 2, heightRed + 2 };
    }
}
