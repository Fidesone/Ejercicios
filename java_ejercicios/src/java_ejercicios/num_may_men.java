package java_ejercicios;

import java.util.Scanner;

public class num_may_men {
	public static void main(String[] args) {
		// 7. Pedir dos n�meros y decir cual es el mayor.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dame el primer n�mero");
		int num1 = scanner.nextInt();
		System.out.println("Dame el segundo n�mero");
		int num2 = scanner.nextInt();
		
		if (num1>num2) {
			System.out.println(num1);
		} else System.out.println(num2);
	}

}
