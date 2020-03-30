package java_ejercicios;

import java.util.Scanner;

public class cifras_reves_0_9999 {

	public static void main(String[] args) {
		// 12. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Dime un número entre 0 y 9.999");
		int num = scanner.nextInt();
		
		int u = num % 10; // unidad
		num = num / 10;
		int d = num % 10; // decena
		num = num / 10;
		int c = num % 10; //centena
		num = num / 10; 
		int umil= num; // unidad de millar
		
		
		System.out.println(u + "" +  d + ""+ c + ""+ umil);
		
	}

}
