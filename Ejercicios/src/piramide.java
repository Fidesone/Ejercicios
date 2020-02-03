import java.util.Scanner;

public class piramide {

	public static void main(String[] args) {
		
		// 1. Crea una pirámide con asteriscos
		
		
		for ( int  alt = 0; alt<= 6; alt++ ) {
			for (int bas = 0; bas <=alt; bas++) {
				
				System.out.print("*");	
			}
				System.out.println(" ");
			
		}
		// si quiero invertir la piramide: el segundo for seria: 
		
		//	for ( int bas = alt; bas <=6; bas++)
		
		
	}
	
}
