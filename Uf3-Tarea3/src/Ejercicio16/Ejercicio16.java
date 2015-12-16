package Ejercicio16;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("¿Cuántas alturas va a introducir?: ");
		int num1 = scan.nextInt();
		double num2 = 0;
		double media = 0;
		System.out.println("Introduce las alturas: ");
		while (num2 < num1) {
			num2 = scan.nextDouble();
			media = (num2 += num2);
		}
		System.out.println(media / num1);


	}

}
