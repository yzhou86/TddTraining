package com.yuzhou.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PrimeFactorTest {
	/**
	 * 1: {}
	 * 2: {2}
	 * 3: {3}
	 * 4: {2,2}
	 * 5: {5}
	 * 6: {2,3}
	 * 12: {2,2,3}
	 * 256: {2,2,2,2,2,2,2,2}
	 */
	PrimeFactor pf = new PrimeFactor();
	List<Integer> list = new ArrayList();
	@Test
	public void _1_should_return_empty() {
		
		Assert.assertEquals(list, pf.factor(1));
	}

	@Test
	public void _2_should_return_2() {
		list.add(2);
		Assert.assertEquals(list, pf.factor(2));
	}

	@Test
	public void _3_should_return_3() {
		list.add(3);
		Assert.assertEquals(list, pf.factor(3));
	}

	@Test
	public void _4_should_return_2_2() {
		list.add(2);
		list.add(2);
		Assert.assertEquals(list, pf.factor(4));
	}
	
	@Test
	public void _6_should_return_2_3() {
		list.add(2);
		list.add(3);
		Assert.assertEquals(list, pf.factor(6));
	}
	
	@Test
	public void _9_should_return_3_3() {
		list.add(3);
		list.add(3);
		Assert.assertEquals(list, pf.factor(9));
	}
	
	@Test
	public void _45_should_return_3_3_5() {
		list.add(3);
		list.add(3);
		list.add(5);
		Assert.assertEquals(list, pf.factor(45));
	}
	

}
