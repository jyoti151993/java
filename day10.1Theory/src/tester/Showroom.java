package tester;
import static com.app.core.Vehicle.sdf;
import java.util.Arrays;
import com.app.core.Category;
import java.util.Scanner;
import com.app.core.Vehicle;
import static utils.ValidationRules.*;
public class Showroom {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
		// initialisation phase 
			System.out.println("Enter the max no of vehicles");
			Vehicle[] showroom=new Vehicle[sc.nextInt()];
			boolean exit=false;
			int counter=0;
	/// servicing phase	
			while(!exit) {
				System.out.println("Options: 1.Add Vehicle 2.Display 3.Purchase Vehicle 10. Exit");
				System.out.println("choose an option");
				try {
					switch(sc.nextInt()){
					case 1:
						if(counter<showroom.length)
						{
							System.out.println("Valid Categories: "+Arrays.toString(Category.values()));
						System.out.println("Enter the vehicle Details: chasisNo, model, pric, manufactureDate(yr-mon-day),category");	
Vehicle newVehicle=new Vehicle(sc.next(),sc.next(),sc.nextDouble(), sdf.parse(sc.next()), Category.valueOf(sc.next().toUpperCase()));	
						showroom[counter++]= newVehicle;
						System.out.println("Vehicle added in the showroom");
						}
						else
							System.out.println("Showroon Full!!!!!");
			            break;
						
					case 2:
						System.out.println("showroom info:");
						for(Vehicle v: showroom)
							if(v!=null)
								System.out.println(v);
						break;
						
					case 3:
						System.out.println("Enter Chasis no and the date");
						Vehicle vehicle=findByChasisNoAndDate(sc.next(), sc.next(), showroom);
						System.out.println("found vehicle"+vehicle);
						// chck for availability//=> vehicle available
					    System.out.println("Enter delivery address : adrLine1,  city,  state,  country,  zipCode");
					    //link address to the vehicle
					    System.out.println(vehicle.linkDeliveryAddress(sc.next(),sc.next(),sc.next(),sc.next(),sc.next()));
						break;
						
					case 10:
						break;
				default:
	                        break;
					
					}
				
				}catch(Exception e) {
				e.printStackTrace();
				System.out.println("Invalid Input ...try again");
				//readoff pending inputs from the Scanner
				sc.nextLine();
			}
				
			}
			
			
		}

	}

}
