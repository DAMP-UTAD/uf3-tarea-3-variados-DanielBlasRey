package Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce las coordenadas X e Y: ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		if (x>0 && x!=0 && y>0 && y!=0) 
			System.out.println("Estas coordenadas se encuentran en el primer cuadrante.");
		else if (x<0 && x!=0 && y<0 & y!=0)
			System.out.println("Estas coordenadas se encuentran en el segundo cuadrante.");
		else
			System.out.println("Estas coordenadas no existen.");


	}

}
