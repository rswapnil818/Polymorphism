package overriding;

public class BindEx2 extends BindEx1 {
	
	void display(){ super.display();
		text="BindEx2";
		
		System.out.println(text+"function called");
	}

}
