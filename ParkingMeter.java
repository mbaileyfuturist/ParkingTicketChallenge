package Project3;

public class ParkingMeter {

	private int timePurchased;
	
	public ParkingMeter() {
		timePurchased = 0;
	}
	
	public ParkingMeter(int timePurchased) {
		this.timePurchased = timePurchased;
	}
	
	public ParkingMeter(ParkingMeter copyObject) {
		this.timePurchased = copyObject.timePurchased;
	}
	
	public void setTimePurchased(int timePurchased) {
		this.timePurchased = timePurchased;
	}
	
	public int getTimePurchased() {
		return timePurchased;
	}
}
