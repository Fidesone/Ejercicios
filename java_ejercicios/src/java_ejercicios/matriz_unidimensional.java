package java_ejercicios;



import java.util.*;

public class matriz_unidimensional {
	public static void main(String[] args) {
	//Estructura de datos que contiene una coleccion de valores del mismo tipo
		
	//	Sintaxis
	
	int [] matriz_prueba = new int[10];
	
	for(int i = 0; i<matriz_prueba.length; i++) {
		
		System.out.println("valor del índice " + i +   "=" + (matriz_prueba[i] + i)  );
	}
	
	//Guardar los datos en un array introducidos por pantalla
	
	Scanner teclado  = new Scanner(System.in);
	
	int [] num_pantalla = new int [10];
	
	for ( int i = 0; i< num_pantalla.length; i++) {
		
		System.out.print("valor del índice " + i );
		System.out.print(" (Introduzca su valor) :" );
		  num_pantalla[i]= Integer.parseInt(teclado.next());
		
	}
		
	}
}
	

