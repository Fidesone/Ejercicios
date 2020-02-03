import java.util.Scanner;



public class Ejercicio_3 {

	public static void main(String[] args) {
		// Escribe un programa que lea 10 números por teclado y que luego los muestre
		// en orden inverso, es decir, el primero que se introduce es el último en mostrarse
		// y viceversa.
		
		int num[] = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i<num.length; i++)
		{
		System.out.println("Dime el numero "+ i);
		num[i]= scanner.nextInt();
		}
		System.out.println("----------------------------");
		System.out.println("Los numeros introducidos de forma inversa son : ");
		System.out.println("----------------------------");
		
		
		for (int i = 9; i>0; i--) 
		{
			
			
			
			System.out.println("El número es :" + num[i]);
			
		}
	
											}
	
}
