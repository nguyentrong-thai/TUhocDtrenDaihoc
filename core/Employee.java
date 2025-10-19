package core;

public class Employee {
	protected String name;
	protected double baseSalary;
	public Employee(String name, double baseSalary ) {
		this.name = name;
		this.baseSalary = baseSalary;
	}
	public double calculateSalary() {
		return baseSalary;
	}
	public void displayInfo() {
		System.out.println("Ten: "+name);
		System.out.println("Luong co ban: "+ baseSalary + " VND");
	}
}
