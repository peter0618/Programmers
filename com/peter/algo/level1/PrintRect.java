package com.peter.algo.level1;

import java.util.Scanner;

public class PrintRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        for(int i = 0 ; i < height ; i++) {
            for(int j = 0 ; j < width ; j++) {
                System.out.print("*");    
            }
            if( i != height - 1) {
                System.out.println();    
            }
        }
        sc.close();
    }
}
