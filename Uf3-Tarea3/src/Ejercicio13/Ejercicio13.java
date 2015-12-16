package Ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca su sueldo: ");
		int sueldo = scan.nextInt();
		System.out.println("Introduzca su antigüedad: ");
		int años = scan.nextInt();
		if (sueldo < 500 && años >= 10)
			System.out.println("Su sueldo aumentaría hasta los: " + ((sueldo * 0.2) + sueldo) + " euros.");
		else if (sueldo < 500 && años < 10)
			System.out.println("Su sueldo aumentaría hasta los: " + ((sueldo * 0.05) + sueldo) + " euros.");
		else if (sueldo >= 500)
			System.out.println("Su sueldo es de " + sueldo);



	}

}
