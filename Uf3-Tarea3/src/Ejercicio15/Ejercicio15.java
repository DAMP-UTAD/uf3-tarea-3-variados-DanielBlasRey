package Ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int ingreso = 1, nota, mayor = 0,menor = 0;
		while (ingreso < 10) {
			System.out.print("Introduzca una nota: ");
			nota = scan.nextInt();
			if (nota>=7 && nota<=10) {
				mayor++;
			} else {
				menor++;
			}
			ingreso++;
		}
		System.out.println(mayor + " alumnos tienen un 7 ó más.");
		System.out.println(menor + " alumnos tienen menos de un 7.");
	}

}
