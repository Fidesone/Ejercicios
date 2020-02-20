package java_ejercicios;

import java.util.Scanner;

public class num_multip {

	public static void main(String[] args) {
		// Pedir dos números y decir si uno es múltiplo del otro.
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Dime el primer número");
		int n1= scanner.nextInt();
		System.out.println("Dime el segundo número");
		int n2= scanner.nextInt();
		
		if ( n1 % n2 == 0) {
			System.out.println("Los dos numeros son multiplos");
			
		} else System.out.println("Los numeros no son multiplos");
		
		

	}

}
