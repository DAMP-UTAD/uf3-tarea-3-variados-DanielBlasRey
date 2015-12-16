package Ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca tres números: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.println("El número más grande es el " + num1);
		} else if (num2 > num3) {
			System.out.println("El número más grande es el " + num2);
		} else
			System.out.println("El número más grande es el " + num3);
		if (num1 < num2 && num1 < num3) {
			System.out.println("El número más pequeño es el " + num1);
		} else if (num2 < num3) {
			System.out.println("El número más pequeño es el " + num2);
		} else
			System.out.println("El número más pequeño es el " + num3);

	}

}
