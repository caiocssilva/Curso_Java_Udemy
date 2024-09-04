package polimorfismo;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee" + i+1 + " data:");
			System.out.print("Outsourced (y/n)? ");
			char letra = sc.nextLine().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if (letra == "n") {
				System.out.print("Name: ");
				String name = sc.next();
				
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				
				System.out.print("Additional charge: ");
				
			}
		}

		
			
			
		sc.close();	
			
	}
}