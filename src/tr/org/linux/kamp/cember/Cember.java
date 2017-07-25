package tr.org.linux.kamp.cember;

import java.util.Random;

public class Cember {
	
	public static void main(String[] args) {
		int icindekiler=0;
		Random rgen=new Random();
		int atış=10000;
		int i=0;
		while(i<atış) {
		double X = (rgen.nextDouble()*2)-1;//sayı aralığımız -1ile 1 arasında bunu 2 ileçarpıp bir çıkarmayla oluyor.
		System.out.println(X);

		double Y = (rgen.nextDouble()*2)-1;
		System.out.println(Y);

		double islem=Math.pow(X, 2)+Math.pow(Y, 2);
		System.out.println(islem);
		if (islem<1) {
			System.out.println("nokta içerde"+icindekiler);
			icindekiler++;	
			i++;
		}
		else {
			System.out.println("içinde değil");
			i++;
		}
		double pi;
		pi=4*(icindekiler*1.0/atış);//içindekiler int tipinde olduğundan 1.0 ile çarparak tip uyumu yapıyoruz.
		System.out.println(pi);
		}
	}

}
