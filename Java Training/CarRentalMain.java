import java.util.*;

class CarRental {
	void bookCar(int days, String carType){
      	int costPerDay = 0;

        	if (carType.equalsIgnoreCase("Innova") || carType.equalsIgnoreCase("Jeep")) {
            	costPerDay = 250;
        	} 
		else if (carType.equalsIgnoreCase("Suzuki")){
            	costPerDay = 150;
        	} 
		else {
            	System.out.println("Invalid car type");
            	return;
        	}

        	int totalCost = days * costPerDay;
        	System.out.println("Per Day Rental details");
        	System.out.println("Car: " + carType);
        	System.out.println("Days: " + days);
        	System.out.println("Driver: No");
        	System.out.println("Total Cost: Rs." + totalCost);
}
	void bookCar(int days, boolean driver, String carType){
        	int costPerDay = 0;

        	if (carType.equalsIgnoreCase("Innova") || carType.equalsIgnoreCase("Jeep")){
            	costPerDay = 250;
		} 
		else if (carType.equalsIgnoreCase("Suzuki")) {
            	costPerDay = 150;
        	} 
		else {
            	System.out.println("Invalid car type");
            	return;
        	}

        	int totalCost = days * costPerDay;
		if (driver) {
            	totalCost += days * 500;
        	}
		System.out.println("Per day car rental with driver");
        	System.out.println("Car: " + carType);
        	System.out.println("Days: " + days);
        	System.out.println("Driver : Yes");
        	System.out.println("Total Cost: Rs." + totalCost);
}
	void bookCar(String carType, boolean isMonthly) {
        	int costPerDay = 0;

        	if(carType.equalsIgnoreCase("Innova") || carType.equalsIgnoreCase("Jeep")){
            	costPerDay = 250;
        	} 
		else if(carType.equalsIgnoreCase("Suzuki")){
            	costPerDay = 150;
        	}
		else {
            	System.out.println("Invalid car type!");
            	return;
        	}

        	int totalCost = 20000 + (costPerDay * 30);
        	System.out.println("Monthly Rental Details");
        	System.out.println("Car: " + carType);
       	System.out.println("Monthly Advance: Rs.20000");
        	System.out.println("Driver: Not avail for monthly car rentals");
        	System.out.println("Total Monthly Cost: Rs." + totalCost);
}
}

public class CarRentalMain {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      CarRental rental = new CarRental();
      System.out.println("Welcome to CarRental");
      System.out.println("Available Cars: Innova, Suzuki, Jeep");
      System.out.println("Rent Options: Daily or Monthly");
      System.out.println("Daily Cost: Innova & Jeep = Rs.250 | Suzuki = Rs.150");
      System.out.println("Monthly: Rs.20000 advance + 30 days cost");
      System.out.println("Driver only avail for daily rental: Rs.500 per day");
      System.out.println("Enter Car Type: ");
      String carType = sc.next();
      System.out.println("Need Monthly Rental? Enter True or False: ");
      boolean isMonthly = sc.nextBoolean();

      if (isMonthly) {
		rental.bookCar(carType, true);
        }
	else {
            System.out.println("Enter Number of Days: ");
            int days = sc.nextInt();

            System.out.println("Need Driver? Enter True or False: ");
            boolean driver = sc.nextBoolean();

            rental.bookCar(days, driver, carType);
        }
}
}
