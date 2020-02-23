package java_ejercicios;

import java.util.Scanner;

public class mayor_igual_num {

	public static void main(String[] args) {
		// 8. Pedir dos números y decir cual es el mayor o si son iguales.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dame el primer número");
		int num1 = scanner.nextInt();
		System.out.println("Dame el segundo número");
		int num2 = scanner.nextInt();
		
		if (num1>num2) {
			System.out.println("El número mayor es: " + num1);
			
		} else if (num2>num1) {
			System.out.println("El número mayor es: " + num2);
		} else System.out.println("Los números son iguales");
		

	}

}
