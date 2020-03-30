package Utilidades.matematicas;

public class Potenciar {
	
public static double Potencia(double num1, int num2) {
	
	
        double resultado = 1;

        for (int i = 1; i <= num2; i++) {

            resultado = resultado * num2;

        }

        return resultado;

    }
			
}

