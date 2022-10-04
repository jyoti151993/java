package wrappers;
//import java.lang.Date;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Integer i1=new Integer(12345);
		Integer i1=Integer.valueOf(100); // boxing
		int data=i1.intValue(); // unboxing
		Double d1=Double.valueOf(23.54);// boxing
		Double data2=d1.doubleValue();// unboxing
		i1=1234; // auto boxing(prim-->wrapper) done by javac: 1i=Integer.ValueOf(12345)
		data=i1;//auto un boxing (wrapper--> prim)
		String s="12345678";
		//s++; 
		Date curntDate=new Date();
		// curntDate+=0;
		i1++; // auto unboxing -> (Integer ---> int)--->inc-->>auto boxing.
		System.out.println(i1);
		d1*=10;
		System.out.println(d1);
		int i=1234;
		double d=1;//auto promotion(int--->double) : widening
		//Double d2=i;// javc err : since int ---.Integer(auto Boxing)---X--Double, type mismatch
		 Double d2=(double)i;//int---double(prog)--Double:javac(auto boxing)
		// Double d2=(Double)i;//this will not work as int in Double box
		 d=100;
		 //d2=100;
		 d=123.45F;
	// d2=123.45F;//
		 Number n1=100;// auto boxing to Integer followed by upcasting, super cls(abstract) ref can refer to sub class(concrete)
	 System.out.println(n1.getClass());
	 n1=123.45F;// auto boxing ---> up casting
	 Object o=true;
	 System.out.println(o.getClass());
	 o=12345;
	 System.out.println(o.getClass());	 
	 o=34.56F;
	 o="Hello";
	// object type of reference can refer to any data type in java.
	
	}

}
