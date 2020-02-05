package java_ejercicios;

import java.util.Scanner;



public class Ejercicio_5 {

	public static void main(String[] args) {
		/*Escribe un programa que pida 10 números por teclado y que luego muestre los
	números introducidos junto con las palabras “máximo” y “mínimo” al lado del
	máximo y del mínimo respectivamente.
		 */
		int num []= new int [10];
		
		Scanner teclado = new Scanner(System.in);
		
		int max = 0, min= 900;
		
		System.out.println("Introduce 10 números");
		for(int i = 0; i<10; i++) {
			
			num[i]=teclado.nextInt();
			
			if (num[i]>max) {
				
				max = num[i];
				
				
			}
			if (num[i]<min) {
				
				min = num[i];
			}
			
		}
		System.out.println(" Los números son: ");
		
		for (int i = 0; i<num.length; i++) {
			
			System.out.println(num[i]);
			
			if (num[i]== max) {
				System.out.println( max + " Es el máximo \t");
				
			}else if (num[i]== min) {
				System.out.println( min + " Es el mínimo \t");
			}
			
		}
		
		 
		
	}

}
