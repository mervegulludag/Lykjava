package tr.org.linux.kamp.library;

import java.util.Random;

public class Library {
	public static void main(String[] args) {
		System.out.println(Math.max(10, 5));
		System.out.println(Math.min(5,9));
		System.out.println(Math.random());
		Random rgen=new Random(4);
		System.out.println("rgen random next int"+rgen.nextInt());
		System.out.println("rgen random next double"+rgen.nextDouble());
		System.out.println("rgen random next boolean"+rgen.nextBoolean());
		Random rgen2=new Random();
		System.out.println("rgen random next int"+rgen2.nextInt(4));//4 dahil değil
		System.out.println("rgen random next double"+rgen2.nextDouble());
		System.out.println("rgen random next boolean"+rgen2.nextBoolean());
	}
}
