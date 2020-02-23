package java_ejercicios;

import java.util.Scanner;

public class num_ordena {

	public static void main(String[] args) {
		// 9. Pedir dos números y mostrarlos ordenados de mayor a menor.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime el primer numero");
		int num1 = scanner.nextInt();
		System.out.println("Dime el segundo numero");
		int num2 = scanner.nextInt();
		
		if (num1>num2) {
			System.out.println("Enumerados de mayor a menor: ");
			System.out.println(num1);
			System.out.println(num2);
		} else if (num2>num1) {
			System.out.println("Enumerados de mayor a menor: ");
			System.out.println(num2);
			System.out.println(num1);
			
		} else System.out.println("los numeros son iguales");

	}

}
