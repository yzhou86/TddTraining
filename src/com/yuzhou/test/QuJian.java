package com.yuzhou.test;

public class QuJian {
	int left;
	int right;
	boolean leftContain; 
	boolean rightContain;
	public QuJian(int left, int right, boolean leftContain, boolean rightContain){
		this.left = left;
		this.right = right;
		this.leftContain = leftContain;
		this.rightContain = rightContain;
	}
	
	public boolean contain(int num){
		if (
				leftContain && rightContain && num >=left && num <=right
				||
				leftContain && !rightContain && num >=left && num <right
				||
				!leftContain && !rightContain && num >left && num <right
				||
				!leftContain && rightContain && num >left && num <=right
				
				){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean contain(int[] nums){
		for (int x : nums){
			if (!this.contain(x)){
				return false;
			}
		}
		return true;
	}
	
	public boolean notContain(int[] nums){
		for (int x : nums){
			if (this.contain(x)){
				return false;
			}
		}
		return true;
	}
}
