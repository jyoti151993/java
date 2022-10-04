package generic;

public class Tester {
//***to disable diamond<>, go to >window>prefernces>advanced>restore-default>>apply changes
	public static void main(String[] args) {
		// create holder class instance to store a double: 123.45
		Holder<Double>h1=new Holder<>(123.45); //double to Double via auto boxing
		double data=h1.getRef(); // Double-->auto unboxing (explicit downcasting no longer required
//		h1=new Holder<Double>(12345); // 
//		
		
		System.out.println(h1.getClass());
	 System.out.println(h1.getRef().getClass());
	 
	 /// Java generic type eraser
	// create another holder class instacne to store a string :"123.45"
		
		Holder<String>h2=new Holder<>("123.45"); //no implicit Conversion
		String s=h2.getRef(); // (explicit down casting : no longer required
//		h1=h2; h1:Holder<Double> n h2:Holder<String> : incompatible
		System.out.println(h2.getClass());
		 System.out.println(h2.getRef().getClass());
		
		
		 Holder<Boolean>h3=new Holder<>(false);
	//---------------Remaining topics---------------	 
		 //collection Frame-works
		 //functional progamming
		 //io
		 ///threads
		 
		// generic syntax is all for educating the compiler
		// for JVM it remains the same
		
	}

}
