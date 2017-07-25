package tr.org.linux.kamp.account;

public class AccountApplication {
	public static void main(String[] args) {
		Account myAccount = new Account();
		Account myAccount2 = new Account("yavuz çetin", 300);
		Account myAccount3 = new Account("ali yılmaz");
		myAccount3.deposit(300);
		System.out.println(myAccount3.getBalance());
		System.out.println(myAccount2.getName());
		System.out.println(myAccount.getName());

	}

}
