package com.peter.algo.level1test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.peter.algo.level1.ComparePandY;

public class ComparePandYTest {
	
	private ComparePandY comp;
	
	@Before
	public void setup() {
		comp = new ComparePandY();
	}

	@Test
	public void test1() {
		assertTrue(comp.solution("pPoooyY"));
	}
	
	@Test
	public void test2() {
		assertTrue(!comp.solution("Pyy"));
	}
}
