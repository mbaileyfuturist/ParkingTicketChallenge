package Project3;

public class ParkedCar {
	
	private String make, model, color, liscenseNumber;
	private int numberOfMinutes;
	
	public ParkedCar() {
		make = "";
		model = "";
		color = "";
		liscenseNumber = "";
		numberOfMinutes = 0;
	}
	
	public ParkedCar(String make, String model, String color, String liscenseNumber, int numberOfMinutes) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.liscenseNumber = liscenseNumber;
		this.numberOfMinutes = numberOfMinutes;
	}
	
	public ParkedCar(ParkedCar copyObject) {
		this.make = copyObject.make;
		this.model = copyObject.model;
		this.color = copyObject.color;
		this.liscenseNumber = copyObject.liscenseNumber;
		this.numberOfMinutes = copyObject.numberOfMinutes;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setliscenseNumber(String liscenseNumber) {
		this.liscenseNumber = liscenseNumber;
	}
	public void setNumberOfMinutes(int numberOfMinutes) {
		this.numberOfMinutes = numberOfMinutes;
	}
	
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public String getLiscenseNumber() {
		return liscenseNumber;
	}
	public int getNumberOfMinutes() {
		return numberOfMinutes;
	}
	
	public String toString() {
		return "Make: " + getMake() + "\n" +
				"Model: " + getModel() + "\n" +
				"Color: " + getColor() + "\n" +
				"liscenceNumber: " + getLiscenseNumber() + "\n" +
				"Number of minutes parked: " + getNumberOfMinutes();
	}
}
