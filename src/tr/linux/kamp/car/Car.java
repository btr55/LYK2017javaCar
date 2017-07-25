package tr.linux.kamp.car;

public class Car {

	private int gear;
	private int speed;
	private String brand;
	
	public int speedUp(int increase) {		//parametre kadar hız artıran metod
		
		speed=speed+increase;
		return speed;
		
	} 
public int speedDown(int decrease) {		//parametre kadar hız azaltan metod
		if (speed>decrease) {
		speed=speed-decrease;
		}
		return speed;
}
public int changeGear(int gear) {		//parametrede değeri vites değeri olarak döndüren metod
	this.gear=gear;
	return gear;
}
	public int getSpeed() {
		return speed;
	}
	
	public int getGear() {
		return gear;
	}
	
	public String getBrand() {
		return brand;
	}
public int setSpeed(int speed) {
		this.speed=speed;
		return speed;
	}

public String setBrand(String brand) {
	this.brand=brand;
	return brand;
}
}
