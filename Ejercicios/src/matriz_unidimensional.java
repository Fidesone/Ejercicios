import java.util.Scanner;

public class matriz_unidimensional {

	public static void main(String[] args) {
		// Matriz unidimensional
		
	
		int [] mi_matriz = new int[10]; // Definicion de matriz
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < mi_matriz.length; i++) { //El método Length se utiliza para recorrer el array
			System.out.print("Espacio de la matriz " + i);
			System.out.print(" ( Introduce un valor): " );
			mi_matriz[i] = Integer.parseInt(scanner.next());
		}
		
		System.out.println("Ha salido del bucle");

	}
	
	

}
