package java_ejercicios;

import java.util.Scanner;



public class Ejercicio_5 {

	public static void main(String[] args) {
		/*Escribe un programa que pida 10 n�meros por teclado y que luego muestre los
	n�meros introducidos junto con las palabras �m�ximo� y �m�nimo� al lado del
	m�ximo y del m�nimo respectivamente.
		 */
		int num []= new int [10];
		
		Scanner teclado = new Scanner(System.in);
		
		int max = 0, min= 900;
		
		System.out.println("Introduce 10 n�meros");
		for(int i = 0; i<10; i++) {
			
			num[i]=teclado.nextInt();
			
			if (num[i]>max) {
				
				max = num[i];
				
				
			}
			if (num[i]<min) {
				
				min = num[i];
			}
			
		}
		System.out.println(" Los n�meros son: ");
		
		for (int i = 0; i<num.length; i++) {
			
			System.out.println(num[i]);
			
			if (num[i]== max) {
				System.out.println( max + " Es el m�ximo \t");
				
			}else if (num[i]== min) {
				System.out.println( min + " Es el m�nimo \t");
			}
			
		}
		
		 
		
	}

}
