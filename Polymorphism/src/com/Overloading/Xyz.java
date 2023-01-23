package com.javabykiran;

public class Xyz {
      void find(int a, int b){
    	  System.out.println("value= "+(a*b));
    	  
      }
      
      void find(int a,int b, int c, int d){
    	  
    	  System.out.println("Value="+(a-b+c*d));
      }
      
      public static void main(String[] args) {
		Xyz xx=new Xyz();
		xx.find(5, 9);
		xx.find(9, 3, 9, 5);
	}
}
