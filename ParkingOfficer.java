package Project3;

public class ParkingOfficer {

	private ParkingTicket officer;
	private ParkingMeter meter; 
	
	public ParkingOfficer() {
		this.officer = null;
	}
	
	public ParkingOfficer(ParkingTicket officer, ParkingMeter meter) {
		this.officer = officer;
		this.meter = meter;
	}
	
	public String getOfficersNameBage() {
		return "Officer Name: " + this.officer.getOfficerName() +
			   "Badge Number: " + this.officer.getBadgeNumber();
	}
	
	public boolean timeExpired() {
			boolean timeExpired = false;
			
			if(officer.getIllegallyParkedCar().getNumberOfMinutes() > meter.getTimePurchased()) {
				timeExpired = true;
			}
			
			return timeExpired;
	}
	
	public void printTimeExpired(boolean timeExpired) {
		if(timeExpired == true) {
			System.out.print(officer.generateParkingTicket());
		}else {
			System.out.println("No fee");
		}
	}
}
