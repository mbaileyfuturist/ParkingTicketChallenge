package Project3;

public class ParkingTicket {

	private ParkedCar illegallyParkedCar;
	private int initialFee = 25;
	private int recuringFee = 10;
	private String officerName;
	private String badgeNumber;
	
	public ParkingTicket() {
		this.illegallyParkedCar = null;
		this.officerName = "";
		this.badgeNumber = "";
	}
	
	public ParkingTicket(ParkedCar illegallyParkedCar, String officerName, String badgeNumber) {
		this.illegallyParkedCar = illegallyParkedCar;
		this.officerName = officerName;
		this.badgeNumber = badgeNumber;
	}
	
	public ParkingTicket(ParkingTicket parkingTicket) {
		this.illegallyParkedCar = parkingTicket.illegallyParkedCar;
		this.officerName = parkingTicket.officerName;
		this.badgeNumber = parkingTicket.badgeNumber;
	}
	
	public int calculateParkingFine() {
		
		int parkingFine = 0;
		int hoursParked = illegallyParkedCar.getNumberOfMinutes()/60;
		
		if(hoursParked <= 1) {
			parkingFine = initialFee;
		}
		else {
			parkingFine = ((hoursParked-1)*recuringFee) + initialFee;
		}
		return parkingFine;
	}
		
	public void setIllegallyParkedCar(ParkedCar illegallyParkedCar) {
		this.illegallyParkedCar = illegallyParkedCar;
	}
	
	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}
	
	public void setBadgeNumber(String badgeNumber) {
		this.badgeNumber = badgeNumber;
	}
	
	public ParkedCar getIllegallyParkedCar() {
		return illegallyParkedCar;
	}
	
	public int getInitialFee() {
		return initialFee;
	}
	
	public int getRecuringFee() {
		return recuringFee;
	}
	
	public String getOfficerName() {
		return officerName;
	}
	
	public String getBadgeNumber() {
		return badgeNumber;
	}
	
	public String toString() {
		return "Parking Fine: " + calculateParkingFine() + "\n" + 
			   "Officer Name: " + getOfficerName() + "\n" +
			   "Officer Badge Number " + getBadgeNumber();
	}
	
	public String generateParkingTicket() {
		String ticket = illegallyParkedCar.toString() + "\n" + toString();
		
		return ticket;
	}
}
