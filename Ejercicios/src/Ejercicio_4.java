package java_ejercicios;

public class Ejercicio_4 {

	public static void main(String[] args) {
		/* Define tres arrays de 20 n�meros enteros cada una, con nombres numero, cuadrado
		y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
		cuadrado se deben almacenar los cuadrados de los valores que hay en el array
		numero. En el array cubo se deben almacenar los cubos de los valores que hay en
		numero. A continuaci�n, muestra el contenido de los tres arrays dispuesto en tres
		columnas.
		*/
		int numero [] = new int [20];
		int cuadrado [] = new int [20];
		int cubo [] = new int [20];
		
		
		for (int i= 0; i<20; i++)
		{
			numero [i] = (int) (Math.random() * 100);
			cuadrado [i]= numero [i] * numero [i];
			cubo [i] = cuadrado [i] * numero [i]; 
		}
		
		for (int i=0; i<20; i++)
		{
			System.out.println(" Aleatorio : " + numero[i] +  "\t" + "  |  Cuadrado : " + cuadrado [i] + "\t" +  "  |  cubo : " + cubo[i] +  "\t" );
				
			
				
			} 
			
		}
		
		
		

	}


