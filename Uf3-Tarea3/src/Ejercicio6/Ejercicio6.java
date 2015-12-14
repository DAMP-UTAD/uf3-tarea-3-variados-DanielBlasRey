package Ejercicio6;

import java.util.Scanner;


public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num1 = scan.nextInt();
		if (num1 > 99 && num1 < 999) 
			System.out.println("El " + num1 + " tiene tres dígitos.");
		else if (num1 > 9 && num1 < 99 )
			System.out.println("El " + num1 + " tiene dos dígitos.");
		else if (num1 < 10)
			System.out.println("El " + num1 + " tiene un dígito.");
		else
			System.err.println("El número de cifras supera las tres.");
		
	}

}
