package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.print("�Cu�ntas preguntas se han realizado?: ");
		double ph = scan.nextInt();
		System.out.print("�Cu�ntas preguntas ha respondido correctamente?: ");
		double pc = scan.nextInt(); /*
									 * 'ph' es el n�mero de preguntas hechas
									 * y 'pc' es el n�mero de preguntas
									 * correctas.
									 */
		if (pc * 10 >= 90) 
			System.out.println("Est� en el nivel m�ximo.");
		else if (pc * 10 >= 75 && pc * 10 < 90) 
			System.out.println("Est� en el nivel medio.");
		else if (pc * 10 >= 50 && pc * 10 < 75)
			System.out.println("Est� en el nivel regular.");
		else
			System.out.println("Est� fuera de nivel.");
	}
}
