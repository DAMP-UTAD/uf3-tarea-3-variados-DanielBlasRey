package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce un n�mero de uno o dos d�gitos:");
		int num1 = scan.nextInt();
		int num2 = 9;
		if (num1 > num2) 
			System.out.println("Este n�mero tiene dos d�gitos.");
		else 
			System.out.println("Este n�mero tiene un d�gito.");
		
	}

}
