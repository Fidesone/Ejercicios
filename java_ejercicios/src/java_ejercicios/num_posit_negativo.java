package java_ejercicios;

import java.util.Scanner;

public class num_posit_negativo {

	public static void main(String[] args) {
		// Pedir un número e indicar si es positivo o negativo.
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Dime un número");
		int num = scanner.nextInt();
		
		if (num > 0) {
			System.out.println("El número "+ num + " es positivo");	
		} else System.out.println("El número "+ num + " es negativo");	

	}

}
