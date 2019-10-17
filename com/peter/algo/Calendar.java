package com.peter.algo;

public class Calendar {
	public static void main(String[] args) {
		System.out.println(solution(5,24));
	}

	public static String solution(int a, int b) {
		int[] days = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 1�� 31��, 2�� 29�� , ...
		String[] weekDays = {"FRI","SAT","SUN","MON","TUE","WED","THU"}; 
		int totDays = 0;
		
		// (a-1)�� ������ �� ��¥ sum
		for(int i=0 ; i<a-1 ; i++) {
			totDays+=days[i];
		}
		
		// b�ϱ��� �����ؼ� 1�� 1�Ϻ��� ������ �������� ��� (�������� �ֱⰡ 7�̹Ƿ� 7�� ���� ������ ���)
		totDays = (totDays + b - 1) % 7;
		
		return weekDays[totDays];
	}
}
