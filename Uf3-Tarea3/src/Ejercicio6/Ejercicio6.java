package Ejercicio6;

import java.util.Scanner;


public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un n�mero: ");
		int num1 = scan.nextInt();
		if (num1 > 99 && num1 < 999) 
			System.out.println("El " + num1 + " tiene tres d�gitos.");
		else if (num1 > 9 && num1 < 99 )
			System.out.println("El " + num1 + " tiene dos d�gitos.");
		else if (num1 < 10)
			System.out.println("El " + num1 + " tiene un d�gito.");
		else
			System.err.println("El n�mero de cifras supera las tres.");
		
	}

}
