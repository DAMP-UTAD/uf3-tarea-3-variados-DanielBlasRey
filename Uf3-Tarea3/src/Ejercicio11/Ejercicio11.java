package Ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce tres números: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		if (num1<10 && num2<10 && num3<10)
			System.out.println("Algunos de los números son menores a diez");
		else 
			System.out.println("Todos los números son mayores que diez.");


	}

}
