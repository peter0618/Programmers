package com.peter.algotest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.peter.algo.HatesSameNum;

public class HatesSameNumTest {

	@Test
	public void test() {
		HatesSameNum hatesSameNum = new HatesSameNum();
		
		int[] arr1 = {1,1,3,3,0,1,1};
		int[] arr2 = {4,4,4,3,3};
		
		assertArrayEquals(new int[] {1,3,0,1}, hatesSameNum.solution(arr1));
		assertArrayEquals(new int[] {4,3}, hatesSameNum.solution(arr2));
	}

}
