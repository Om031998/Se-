package com.te.demo;

public class Tax extends IncomeTax{

	@Override
	public void calTax(int sal) {
		
		if (sal<=100000 && sal>=500000) {	
			float tax = sal*0.1f;
			System.out.println(tax);
		}
		if (sal<=800000 && sal>500000) {	
			float tax = sal*0.2f;
			System.out.println(tax);
		}
		if ( sal>800000) {	
			float tax = sal*0.33f;
			System.out.println(tax);
		}
	}

	

}
