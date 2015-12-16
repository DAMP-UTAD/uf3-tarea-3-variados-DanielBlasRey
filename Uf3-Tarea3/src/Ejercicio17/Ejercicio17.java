package Ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduzca el número de empleados: ");
		int empleados = scan.nextInt(); 
		int num = 0;
		int sueldo = 0;
		int poco = 0;
		int mucho = 0;
		int gasto = 0;
		System.out.println("Introduzca sus sueldos: ");
		while (num<empleados) {
			sueldo = scan.nextInt();
			gasto+=sueldo;
			if (sueldo>=100 && sueldo<=300) {
				poco++;
			} else if (sueldo>300 && sueldo<=500) {
				mucho++;
			}
			num++;
		}
		System.out.println("Hay " + poco + " personas que cobran entre 100 y 300 euros.");
		System.out.println("Hay " + mucho + " personas que cobran entre 300 y 500 euros.");
		System.out.println("La empresa se gasta " + gasto + " euros.");
		
	}

}
