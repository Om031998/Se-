package com.te.demo;

public class Accountant {
   static int sal ;
   
	public Accountant(int i) {
	sal = i;
}

	public void cal(IncomeTax c) {
		
		c.calTax(sal);
	}
}
