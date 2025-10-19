package core;

public class Programmer extends Employee{
	private String programmingLanguage;
	private double bonus;
	public Programmer(String name, double baseSalary, String programmingLanguage, double bonus) {
		super(name,baseSalary);
		this.programmingLanguage = programmingLanguage;
		this.bonus = bonus;
	}
	@Override
	public double calculateSalary() {
		return baseSalary+bonus;
	}
	@Override
	public void displayInfo() {
		super.displayInfo();
		 System.out.println("Ngôn ngữ lập trình: " + programmingLanguage);
	        System.out.println("Thưởng: " + bonus + " VND");
	        System.out.println("Tổng lương: " + calculateSalary() + " VND");

	}
}
