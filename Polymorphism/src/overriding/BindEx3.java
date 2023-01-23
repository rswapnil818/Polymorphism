package overriding;

public class BindEx3 extends BindEx2 {
	void display(){
		text="BindEx3";
		
		super.display();
		System.out.println(text+"Function Called");
		
	}
}
