import java.util.Scanner;

public class dias_sem_array {

	public static void main(String[] args) {
		
		// Creamos un array con los d�as de la semana
		Scanner scanner = new Scanner(System.in);
		
		String [] dias = new String [] {"Lunes", "Martes", "Miercoles", "Jueves" , "Viernes", " S�bado", "Domingo"};

		System.out.println("Introduce un n�mero de la semana");
		
		int num = Integer.parseInt(scanner.next());
		
			if(num < dias.length) {
				System.out.print( "El n�mero que has introducido corresponde a -->" + dias[num]);
				
			} else System.out.print("Numero erroneo");
		
	}

}
