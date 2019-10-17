package com.peter.algotest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.peter.algo.Multiple;

class MultipleTest {

	@Test
	void testSolution1() {
		Multiple multiple = new Multiple();
		
		assertArrayEquals(
				new int[] {5, 10}, 
				multiple.solution1(new int[] {5,9,7,10}, 5)
		);
		
	}
	
	@Test
	void testSolution2() {
		Multiple multiple = new Multiple();
		
		assertArrayEquals(
				new int[] {1,2,3,36}, 
				multiple.solution1(new int[] {2,36,1,3}, 1)
		);
		
	}
	
	@Test
	void testSolution3() {
		Multiple multiple = new Multiple();
		
		assertArrayEquals(
				new int[] {-1}, 
				multiple.solution1(new int[] {3,2,6}, 10)
		);
		
	}

}
