package tr.org.linux.kamp.car;

public class car {
	private int gear;
	private int speed;
	private String brand;
	
	public car(int gear,int speed,String brand) {
		this.gear=gear;
		this.speed=speed;
		this.brand=brand;
	}
	public car() {
		
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void speedUp(int speed){
		this.speed=this.speed+speed;
		
	}	
	public void speedDown(int dec) {
		speed=speed-dec;
		
	}
	public void changeGear(int gear) {
		this.gear=gear;
		
	}

}
