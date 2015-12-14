package Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
		int num1 = scan.nextInt();
		System.out.print("Introduce el segundo número: ");
		int num2 = scan.nextInt();
		System.out.print("Introduce el tercer número: ");
		int num3 = scan.nextInt();
		int suma = num1 + num2;
		if (num1 == num2 && num1 == num3 && num2 == num3)
			System.out.println("La suma de los tres números es: "
					+ (suma * num3));
		else
			System.out.println("Los tres números no son iguales.");

	}
}
