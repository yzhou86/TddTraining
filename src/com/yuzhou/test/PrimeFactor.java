package com.yuzhou.test;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

	public List<Integer> factor(int i) {
		List<Integer> list = new ArrayList();
				
		for (int x=2 ; x<=i; x++)
			while (i%x == 0){
				list.add(x);
				i = i/x;
			}
		
		return list;
	}

}
