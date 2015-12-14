package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.print("¿Cuántas preguntas se han realizado?: ");
		double ph = scan.nextInt();
		System.out.print("¿Cuántas preguntas ha respondido correctamente?: ");
		double pc = scan.nextInt(); /*
									 * 'ph' es el número de preguntas hechas
									 * y 'pc' es el número de preguntas
									 * correctas.
									 */
		if (pc * 10 >= 90) 
			System.out.println("Está en el nivel máximo.");
		else if (pc * 10 >= 75 && pc * 10 < 90) 
			System.out.println("Está en el nivel medio.");
		else if (pc * 10 >= 50 && pc * 10 < 75)
			System.out.println("Está en el nivel regular.");
		else
			System.out.println("Está fuera de nivel.");
	}
}
