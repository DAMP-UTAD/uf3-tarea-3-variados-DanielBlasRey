package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un n�mero: ");
		int num1 = scan.nextInt();
		if (num1 > 0) 
			System.out.println("El n�mero " + num1 + " es positivo.");
		else if (num1 < 0)
			System.out.println("El n�mero " + num1 + " es negativo.");
		else
			System.out.println("Este n�mero es el 0.");
		
	}

}
