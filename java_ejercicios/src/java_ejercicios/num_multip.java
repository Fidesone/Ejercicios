package java_ejercicios;

import java.util.Scanner;

public class num_multip {

	public static void main(String[] args) {
		// Pedir dos n�meros y decir si uno es m�ltiplo del otro.
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Dime el primer n�mero");
		int n1= scanner.nextInt();
		System.out.println("Dime el segundo n�mero");
		int n2= scanner.nextInt();
		
		if ( n1 % n2 == 0) {
			System.out.println("Los dos numeros son multiplos");
			
		} else System.out.println("Los numeros no son multiplos");
		
		

	}

}
