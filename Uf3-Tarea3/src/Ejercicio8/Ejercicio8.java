package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Introduce el día del mes: ");
		int dia = scan.nextInt();
		System.out.print("Introduce el número del mes: ");
		int mes = scan.nextInt();
		if (dia <= 31) 
			if (dia == 25 && mes == 12) 
				System.out.println("¡Es navidad!");
			else
				System.out.println("El día " + dia + " del mes " + mes + " no es navidad.");
			
		
	}

}
