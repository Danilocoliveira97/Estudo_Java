package entities;

public class Employee {
	public String name;
	public double GrossSalary;
	public double Tax;
	
	
	public double nextSalary() {
		return GrossSalary - Tax;
	}
	
	public void increaseSalary(double percentage) {
		GrossSalary += GrossSalary* percentage / 100.00;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", nextSalary());
	}
}
