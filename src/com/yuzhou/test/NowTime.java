package com.yuzhou.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NowTime {
	
	public String now(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS");
		   Date date = new Date();
		   return dateFormat.format(date);
	}
	
}
