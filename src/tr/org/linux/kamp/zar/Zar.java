package tr.org.linux.kamp.zar;

import java.util.Random;
import java.util.Scanner;

public class Zar {
	private static Random rgen=new Random();
	private static String oyuncu1;
	private static String oyuncu2;
	private static int zar() {
		int Rnumber = rgen.nextInt(5)+1;
		return Rnumber;
	}
	private static String kazanan() {
		int birincisayı=zar();
		int ikincisayı=zar();
		
		if (birincisayı>ikincisayı) {
			return "oyuncu1";
		}
		else {
			return "oyuncu2";
		}
	}
	public static void main(String[] args) {
		System.out.println(kazanan());
	}
}
