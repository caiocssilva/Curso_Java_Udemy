package exercise1;

import java.util.Locale;
import java.util.Scanner;

import entitiesExercise1.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee empl = new Employee();
		
		System.out.print("Name: ");
		empl.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		empl.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		empl.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + empl);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		empl.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + empl);
		
		sc.close();
	}

}
