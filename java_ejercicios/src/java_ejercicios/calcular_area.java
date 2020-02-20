package java_ejercicios;

import java.util.Scanner;

public class calcular_area {

	public static void main(String[] args) {
		// 2. Pedir el radio de un círculo y calcular su área. A=PI*r^2.
		
				Scanner scanner= new Scanner(System.in);
				
				System.out.println("Introduce el radio");
				double radio =  (double) scanner.nextInt();
				
				double area = Math.PI * (radio* radio);
				
				System.out.println("El área del círculo es: "+ area);
				

	}

}
