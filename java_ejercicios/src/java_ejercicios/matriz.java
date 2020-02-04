package java_ejercicios;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 Scanner scanner = new Scanner(System.in);
 
 System.out.print("Dime el numero de filas");
 int f = scanner.nextInt();
 System.out.print("Dime el numero de columnas");
 int c = scanner.nextInt();
 
 int matriz [][] = new int [f][c];
 int num_al;
 for (int i = 0; i < f; i++) {
	 for (int j = 0; j < c; j++) {
		num_al= (int) (Math.random()*100); //Genera un numero aleatorio del 0 al 100
		 matriz [i][j] = num_al;
	 }
 }
 for (int i = 0; i<f; i++) {
	 for (int j = 0; j<c; j++) {
		 
		 System.out.print(matriz[i][j] + "\t"); // El caracter \t representa al tabulador
		 
	 }
	 System.out.println(); 
 }
	}
}
	
 

	


