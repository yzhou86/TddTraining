package com.yuzhou.test;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.mockito.Mockito;

public class NowTimeTest {

	@Test
	public void test() {
		NowTime nt = new NowTime();
		
		final Date date = Mockito.mock(Date.class);
        Mockito.when(date.getTime()).thenReturn(30L);
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS");
        String nowStr = nt.now();
        System.out.println(nowStr);
        assert(dateFormat.format(date).equals(nowStr));
	}

}
