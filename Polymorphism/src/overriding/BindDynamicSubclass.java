package overriding;

public class BindDynamicSubclass extends BindDynamic {
	
	 void display (String str){
		     //super.display();
		   if (val==null){
			   str="Derived Class Function".concat(str);
		   }
		  
			 System.out.println(str);
		 }
	 }

	


