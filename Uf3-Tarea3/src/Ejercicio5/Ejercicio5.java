package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num1 = scan.nextInt();
		if (num1 > 0) 
			System.out.println("El número " + num1 + " es positivo.");
		else if (num1 < 0)
			System.out.println("El número " + num1 + " es negativo.");
		else
			System.out.println("Este número es el 0.");
		
	}

}
