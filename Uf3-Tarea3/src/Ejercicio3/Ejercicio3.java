package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce un número de uno o dos dígitos:");
		int num1 = scan.nextInt();
		int num2 = 9;
		if (num1 > num2) 
			System.out.println("Este número tiene dos dígitos.");
		else 
			System.out.println("Este número tiene un dígito.");
		
	}

}
