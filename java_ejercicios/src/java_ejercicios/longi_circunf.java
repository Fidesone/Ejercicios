package java_ejercicios;

import java.util.Scanner;

public class longi_circunf {

	public static void main(String[] args) {
		// Pedir el radio de una circunferencia y calcular su longitud.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime el radio de la circunferencia");
		int radio = scanner.nextInt();
		
		int circunferencia = radio * radio;
		System.out.println("La longitud de la circunferencia es: "+ circunferencia);
		
		

	}

}
