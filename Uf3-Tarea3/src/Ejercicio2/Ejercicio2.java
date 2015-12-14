package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Primera nota: ");
		int num1 = scan.nextInt();
		System.out.print("Segunda nota: ");
		int num2 = scan.nextInt();
		System.out.print("Tercera nota: ");
		int num3 = scan.nextInt();
		if ((num1 + num2 + num3) / 3 >= 7) {
			System.out.println("Promocionado.");
		} else {
			System.out.println("No promocionado.");
		}
	}

}
