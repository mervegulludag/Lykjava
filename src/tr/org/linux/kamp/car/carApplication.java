package tr.org.linux.kamp.car;

public class carApplication {
	public static void main(String[] args) {
		car car1=new car(20,80,"ford");
		car1.speedDown(10);
		System.out.println(car1.getSpeed());
		car1.speedUp(20);
		System.out.println(car1.getSpeed());
		car1.changeGear(30);
		System.out.println(car1.getGear());

	}

}
