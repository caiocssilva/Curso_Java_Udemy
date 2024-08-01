package application;

import java.util.Scanner;
import entities.UserPensionato;

public class Pensionato {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		UserPensionato[] vect = new UserPensionato[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			vect[i] = new UserPensionato(name, email, room);
		}
		
		sc.close();
	}

}
