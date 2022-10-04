package utils;

import java.text.ParseException;
import java.util.Date;

import com.app.core.Vehicle;

import customException.ShowroomHandlingException;

import static com.app.core.Vehicle.sdf;

public class ValidationRules {
	public static Date startDate;
	public static Date endDate;
	static {
		try {
			startDate = sdf.parse("2022-4-1");
			endDate = sdf.parse("2023-3-31");
		} catch (ParseException e) {
			System.out.println("err in static init block " + e);
		}
	}

//add a static method for parsing n validating date
	public static Date parseAndValidateDate(String date) throws ParseException, ShowroomHandlingException {
		// parsing
		Date manuDate = sdf.parse(date);
		// => parsing successful , now proceed to validations
		if (manuDate.before(startDate) || manuDate.after(endDate))
			throw new ShowroomHandlingException("Invalid manufacturing date!!!!");
		// => validations success
		return manuDate;// Rets parsed n validated date to the caller
		}
	
	// add a static method to fond vehicle by its unique ID
	public static Vehicle findByChasisNoAndDate(String chasisNo, String date, Vehicle[] vehicle) throws ShowroomHandlingException, ParseException{
		
	//1. parse and validate the date
		Date validDate=parseAndValidateDate(date);
		// 1.5 create a Vehicle object
		Vehicle v1=new Vehicle(chasisNo,validDate);
	//2.Iterate over the Vehicle[]	invoke equals
		for(Vehicle v: vehicle)
			if(v!=null)
			if(v.equals(v1))
				return v;
			//=> vehicle not found
		throw new ShowroomHandlingException("Invalid inputs, Vehicle not found!!!");
	
	}
	
	
}
