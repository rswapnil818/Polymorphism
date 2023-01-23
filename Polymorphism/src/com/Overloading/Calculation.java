package com.javabykiran;

public class Calculation {
	void sum(int a, int b) {
		 
		System.out.println("Addition  "+(a+b));
	}
    void sum(double a, double b) {
    	System.out.println("Addition  "+(a+b));
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Calculation cc=new Calculation();
      cc.sum(12, 22);
      cc.sum(12.5, 22.5);
	}

}
