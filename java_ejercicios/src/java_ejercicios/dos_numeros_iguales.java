package java_ejercicios;

import java.util.Scanner;

public class dos_numeros_iguales {

	public static void main(String[] args) {
		// Pedir dos numeros y decir si son iguales
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dame el primer n�mero");
		int n1 = scanner.nextInt();
		System.out.println("Dame el segundo n�mero");
		int n2 = scanner.nextInt();
		
		if (n1 == n2) {
			
			System.out.println("Los n�meros son iguales");	
		} else System.out.println("Los n�meros NO son iguales");	

	}

}
