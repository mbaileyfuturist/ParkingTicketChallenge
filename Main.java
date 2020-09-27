package Project3;

public class Main {

	public static void main(String[] args) {

		//ParkedCar Object: Ask for the make, model, color, license number and minutes parked.
		ParkedCar parkedCar = new ParkedCar("Ford", "Mustang", "Green", "123456", 180);
		
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
