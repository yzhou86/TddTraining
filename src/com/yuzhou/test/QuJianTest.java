package com.yuzhou.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuJianTest {

	boolean OPEN = false;
	boolean CLOSE = true;
	
	@Test
	public void number_in_qujian_left_open_and_right_close() {
		QuJian qj = new QuJian(2, 5, OPEN, CLOSE);
		
		boolean actual = qj.contain(new int[] { 3});
		
		assertTrue (actual);
	}
	@Test
	public void number_is_right_boundry_of_qujian_left_close_and_right_close() {
		QuJian qj = new QuJian(2, 5, true, true);
		assertTrue (qj.contain(new int[] { 5 }));
		//assert (qj.notContain(new int[] { 1, 6 }));

	}
	@Test
	public void test3() {
		QuJian 	qj = new QuJian(2, 5, false, false);
		assert (qj.contain(new int[] { 3, 4 }));
		assert (qj.notContain(new int[] { 1, 2, 5, 6 }));

	}
	@Test
	public void test4() {
		QuJian qj = new QuJian(2, 5, true, false);
		assert (qj.contain(new int[] { 2, 3, 4 }));
		assert (qj.notContain(new int[] { 1, 5, 6 }));

	}
	@Test
	public void test5() {
		QuJian qj = new QuJian(5, 1, true, false);
		assert (qj.notContain(new int[] { 1,2,3,4,5,6 }));

	}

}
