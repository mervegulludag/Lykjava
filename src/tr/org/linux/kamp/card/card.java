package tr.org.linux.kamp.card;

import java.util.Random;

public class card {
	private static Random rgen=new Random();
	public static void main(String[] args) {
		System.out.println(chooseRandomCard());
	}
	private static String chooseRandomCard() {
		String card=chooseRandomSuit()+" "+chooseRandomRank();
		return card;
	}
	private static String chooseRandomSuit() {// kart türü maça,sinek,karo,kupa
		int Rnumber = rgen.nextInt(4);
		switch (Rnumber) {
		case 0:
			return "Maça";
		case 1:
			return "Kupa";

		case 2:
			return "karo";

		case 3:
			return "sinek";
		default:
			return " ";
		}
	}

	private static String chooseRandomRank() {
		int Rnumber=rgen.nextInt(13)+1;
		if (Rnumber>1 && Rnumber<10)
			return Integer.toString(Rnumber);
		switch (Rnumber) {
		case 0:
			return "As";

		case 10:
			return "vale";

		case 11:
			return "kız";
		
		case 12:
			return "papaz";
		default:
			return "";
		}
	}
}
