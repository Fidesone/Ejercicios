package java_ejercicios;

public class Ejercicio_2 {

	public static void main(String[] args) {
		//Define un array de 10 caracteres con nombre simbolo y asigna valores a los
		//elementos seg�n la tabla que se muestra a continuaci�n. Muestra el contenido
		//de todos los elementos del array. �Qu� sucede con los valores de los elementos
		//que no han sido inicializados?
		
		//  Respuesta: Se queda vac�o.
		
		char simbolo [] = new char [10];
		
		simbolo [0]= 'A';
		simbolo [1]= 'X';
		simbolo [4]= '@';
		simbolo [6]= '\'';
		simbolo [7]= '+';
		simbolo [8]= 'Q';
		
		for (int i= 0; i<simbolo.length; i++)
		{
			System.out.println(simbolo[i]);
		}


	}

}
