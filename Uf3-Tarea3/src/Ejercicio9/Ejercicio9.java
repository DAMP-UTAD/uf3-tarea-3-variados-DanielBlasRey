package Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el primer n�mero: ");
		int num1 = scan.nextInt();
		System.out.print("Introduce el segundo n�mero: ");
		int num2 = scan.nextInt();
		System.out.print("Introduce el tercer n�mero: ");
		int num3 = scan.nextInt();
		int suma = num1 + num2;
		if (num1 == num2 && num1 == num3 && num2 == num3)
			System.out.println("La suma de los tres n�meros es: "
					+ (suma * num3));
		else
			System.out.println("Los tres n�meros no son iguales.");

	}
}
