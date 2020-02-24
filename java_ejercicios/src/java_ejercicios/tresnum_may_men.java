package java_ejercicios;

import java.util.Scanner;

public class tresnum_may_men {

	public static void main(String[] args) {
		// 10. Pedir tres números y mostrarlos ordenados de mayor a menor.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dame el numero uno");
		int num1 = scanner.nextInt();
		System.out.println("Dame el numero dos");
		int num2 = scanner.nextInt();
		
		System.out.println("Dame el numero tres");
		int num3 = scanner.nextInt();
		
		if (num1>num2 && num2>num3) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
					
		} else if (num1>num3 && num3>num2) {
			System.out.println(num1);
			System.out.println(num3);
			System.out.println(num2);
		} else if (num2>num1 && num1>num3) {
			System.out.println(num2);
			System.out.println(num1);
			System.out.println(num3);
		}else if (num2>num3 && num3>num1){
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num1);
		} else if (num3>num1 && num1>num2) {
			System.out.println(num3);
			System.out.println(num1);
			System.out.println(num2);
		} else if (num3>num2 && num2>num1) {
			System.out.println(num3);
			System.out.println(num2);
			System.out.println(num1);
		}

	}

}
