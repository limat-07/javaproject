package com.wipro.test;
import static org.junit.Assert.assertEquals;

import com.wipro.task.Dailtask;

public class TestSTringConcat {

	public static void main(String[] args) {
		Dailtask dailytask =new Dailtask();
		String result =dailytask.doStringConcat("hello","world");
		assertEquals("hello world",result);
		
	}

}
