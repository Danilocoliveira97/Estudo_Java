package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class exe27_SalarioFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		System.out.print("Name");
		emp.name = sc.nextLine();
		System.out.print("Gross Salary");
		emp.GrossSalary = sc.nextDouble();
		System.out.print("tax");
		emp.Tax = sc.nextDouble();
		
		System.out.println();
		System.out.println(" Employee " + emp);
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data" + emp);
		
		System.out.println(emp);




		


		
				
				
				
		sc.close();

	}

}
