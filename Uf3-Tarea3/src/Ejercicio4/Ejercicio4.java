package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el primer n�mero: ");
		int num1 = scan.nextInt();
		System.out.print("Introduce el segundo n�mero: ");
		int num2 = scan.nextInt();
		System.out.print("Introduce el tercer n�mero: ");
		int num3 = scan.nextInt();
		if (num1 > num2 && num1 > num3) 
			System.out.println("El n�mero " + num1 + " es el mayor.");
		else if (num2 > num1 && num2 > num3) 
			System.out.println("El n�mero " + num2 + " es el mayor.");
		else 
			System.out.println("El n�mero " + num3 + " es el mayor.");
		
	}

}
