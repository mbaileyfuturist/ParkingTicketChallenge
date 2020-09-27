package Project3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String make, model, color, liscenseNumber; 
		int minutesParked;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the car make: ");
		make = sc.nextLine();
		
		System.out.print("Please enter the car model: ");
		model = sc.nextLine();
		
		System.out.print("Please enter the car color: ");
		color = sc.nextLine();
		
		System.out.print("Please enter the car liscense number: ");
		liscenseNumber = sc.nextLine();
		
		System.out.print("Please enter the time parked in minutes: ");
		minutesParked = sc.nextInt();


		
		//ParkedCar Object: Ask for the make, model, color, license number and minutes parked.
		ParkedCar parkedCar = new ParkedCar(make, model, color, liscenseNumber, minutesParked);
		
		//ParkingMeter Object: Ask for the time purchased in minutes.
		ParkingMeter parkingMeter = new ParkingMeter(40);
		
		//ParkingTicket: 
		ParkingTicket parkingTicket = new ParkingTicket(parkedCar, "Micheal", "246810");
		
		//ParkingOfficer: Create an officer.
		ParkingOfficer officer = new ParkingOfficer(parkingTicket, parkingMeter);
		
		boolean timeExpired = officer.timeExpired();
		
		officer.printTimeExpired(timeExpired);
	}

}
