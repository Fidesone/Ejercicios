package java_ejercicios;

import java.util.Scanner;

public class num_0y9999 {

	public static void main(String[] args) {
		// 11. Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dame un numerito entre el 0 y el 9.999");
		int num = scanner.nextInt();
		
		if (num >= 0 && num < 10) {
			System.out.println("El número " + num + " tiene una cifra"  );
		} else if (num >= 10 && num < 100) {
			System.out.println("El número " + num + " tiene dos cifras"  );
		} else if (num >= 100 && num < 1000) {
			System.out.println("El número " + num + " tiene tres cifras"  );
		} else if (num >=1000 && num < 10000) {
			System.out.println("El número " + num + " tiene cuatro cifras"  );
		} else System.out.println("El número " + num + " no entra dentro de los requisitos"  );
		

	}

}
