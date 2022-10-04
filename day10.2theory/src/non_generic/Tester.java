package non_generic;

public class Tester {

	public static void main(String[] args) {
		// TODO create holder class instance to store a double: 123.45
		Holder h1=new Holder(123.45);// double--->Double(auto boxing)--> upcasted to Object --->Double is a object
		System.out.println(h1.getClass());
		System.out.println(h1.getRef().getClass());
// get double value from the holder
		//double val=h1.getRef();
		double val=(double)h1.getRef();// explicit downcasting is required to accessa ny data from the holder which is a non generic class
		
		
		// create another holder class instacne to store a string :"123.45"
		Holder h2=new Holder("123.45"); // string-->object via a upcasting which is a automatic convers
		// String s =h2
		System.out.println(h2.getRef());// Holder class
		System.out.println(h2.getRef().getClass()); //String class
		//String s=h2.getRef(); // since object IS NOT A STRING
		String s=(String)h2.getRef();
		h1=h2;
		val=(Double)h1.getRef();
		
	}

}
