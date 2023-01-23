package com.javabykiran;

public class Student {
	int Id;
String Name;
int Rollno;

public void setData(int Id, String Name , int Rollno){
	this.Id=Id;
	this.Name=Name;
	this.Rollno=Rollno;
	
}
public void setData(int Id, int Rollno){
	this.Id=Id;
	this.Rollno=Rollno;
}

public void display(){
	System.out.println(Id);
	System.out.println(Name);
	System.out.println(Rollno);
}
public static void main(String[] args) {
	Student sd1=new Student();
	sd1.setData(123, 789);
	sd1.display();
	Student sd2=new Student();
	sd2.setData(10, "Swapnil Ramteke", 420);
	sd2.display();
}
}

	
	