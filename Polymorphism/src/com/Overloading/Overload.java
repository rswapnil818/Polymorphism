package com.javabykiran;

public class Overload {
	
	void demo(int a) {
		System.out.println("Print a= "+a);
	}
	
	void demo(int a,int b) {
		System.out.println("Additon of a and b ="+(a+b));
	}
	double demo(double a) { 
		System.out.println("Double a" +a);
		return a*a;
	}
	
	int demo(int a, int b, int c) {
		System.out.println("Addition of Double Value is :"+(a+b+c));
		return a+b+c;
	}
	
	String demo (String s , String r){
		System.out.println(s+" "+r);
		return s+r;
		
		
		
	}
	public static void main(String[] args) {
		Overload od=new Overload();
			od.demo(2,3);
			od.demo(2);
			od.demo(2.5);
			od.demo(2,3,5);
			od.demo("Swapnil" ," Ramteke");
	}
	}
