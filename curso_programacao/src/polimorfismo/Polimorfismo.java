package polimorfismo;

import heranca.Account;
import heranca.SavingsAccount;

public class Polimorfismo {

	public static void main(String[] args) {

		Account x = new Account(1020, "Caio", 1000.0);
		Account y = new SavingsAccount(1023, "Mara", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());

	}

}
