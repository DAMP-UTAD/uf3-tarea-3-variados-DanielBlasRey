package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el primer n�mero: ");
		int num1 = scan.nextInt();
		System.out.print("Introduce el segundo n�mero: ");
		int num2 = scan.nextInt();
		if (num1 > num2) {
			System.out.println("La suma de los dos n�meros es: " + ((float) num1 + num2));
			System.out.println("La resta de los dos n�meros es: " + ((float) num1 - num2));
		} else {
			System.out.println("La multiplicaci�n de los dos n�meros es: " + ((float) num1 * num2));
			System.out.println("La divisi�n de los dos n�meros es: " + ((float) num1 / num2));
		}
	}

}
