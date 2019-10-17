package com.peter.algo;

public class Calendar {
	public static void main(String[] args) {
		System.out.println(solution(5,24));
	}

	public static String solution(int a, int b) {
		int[] days = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 1월 31일, 2월 29일 , ...
		String[] weekDays = {"FRI","SAT","SUN","MON","TUE","WED","THU"}; 
		int totDays = 0;
		
		// (a-1)월 까지의 총 날짜 sum
		for(int i=0 ; i<a-1 ; i++) {
			totDays+=days[i];
		}
		
		// b일까지 포함해서 1월 1일부터 몇일이 지났는지 계산 (일주일의 주기가 7이므로 7로 나눈 나머지 계산)
		totDays = (totDays + b - 1) % 7;
		
		return weekDays[totDays];
	}
}
