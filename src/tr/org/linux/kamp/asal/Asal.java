package tr.org.linux.kamp.asal;

public class Asal {
	
	public static void main(String[] args) {
		for(int i=1;i<50;i++) {
			for(int k=2;k<=i;k++) {
				if(i%k==0) {
					break;
				}
				else {
					System.out.println(i+"asal");
					break;
				}
			}
				
		}
	}
	
	
}

