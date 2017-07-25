package tr.org.linux.kamp.küre;

import java.util.Scanner;

public class Sphere {
	public static double hacim(double r) {
		return (4.0/3.0*Math.PI*Math.pow(r, 3));
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("yarıçap girin:");
		double r=input.nextDouble();
		System.out.println("hacim:"+hacim(r));

	}
}
