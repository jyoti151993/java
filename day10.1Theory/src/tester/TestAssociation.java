package tester;
import com.app.core.Vehicle;
import com.app.core.DeliveryAddress;
import java.util.Date;

import com.app.core.Category;

public class TestAssociation {

	public static void main(String[] args) {
		// will you be able to create instance of delivery adr w/o creating Vehicle first? NO
		//This is an example of composition
	
//DeliveryAddress adr =new DeliveryAddress(null,null,null,null,null);
// create inner class instance in 2 steps
		Vehicle v1=new Vehicle("def-1234","car",234567, new Date(),Category.PETROL);
Vehicle.DeliveryAddress adr=v1.new DeliveryAddress(null,null,null,null,null);
//OR// creating inner class instance in a single step
Vehicle.DeliveryAddress adr2=new Vehicle("def-1234","car",234567, new Date(),Category.PETROL).new DeliveryAddress(null,null,null,null,null);
	}

}
