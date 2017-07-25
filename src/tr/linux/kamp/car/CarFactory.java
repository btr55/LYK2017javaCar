package tr.linux.kamp.car;

public class CarFactory {
public static void main(String[] args) {
	Car myCar1= new Car();		//Car sınıfında myCar1 isimli nesne oluşturduk.

	myCar1.setSpeed(100);		//myCar1 in hızını 100 verdik.
	myCar1.setBrand("Mercedes");	//myCar1 in markasını Mercedes verdik.
	
	System.out.println(myCar1.getBrand()+" "+myCar1.getSpeed());	//myCar1 in marka ve hızını get metodlarıyla aldık.
	myCar1.speedUp(10);			//myCar1 in hızını speedUp metoduyla 10 artırdık.
	System.out.println(myCar1.getSpeed());	
	myCar1.changeGear(3);						//myCar1 in vites değerini changeGear metouyla 3 yaptık.
	System.out.println(myCar1.getGear());
	
}
}
