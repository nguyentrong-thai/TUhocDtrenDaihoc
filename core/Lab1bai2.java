package core;
import java.util.Scanner;
public class Lab1bai2 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chieu dai : ");
		double dai = sc.nextDouble();
		System.out.print("Nhap chieu rong : ");
		double rong = sc.nextDouble();
		System.out.print("chu vi hinh chu nhat: " + (dai+dai+rong+rong) + "\n");
		System.out.print("dien tich hinh chu nhat : "+ (dai*rong)+"\n");
		System.out.print("Chieu dai canh nho nhat : " + Math.min(dai, rong));
		sc.close();
	}
}
