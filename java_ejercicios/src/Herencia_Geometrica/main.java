package Herencia_Geometrica;

public class main {

	public static void main(String[] args) {
		
		Figura figura1= new Figura();
		Figura figura2= new Figura("Blanco", false);
		
		Círculo circulo1= new Círculo();
		Círculo circulo2= new Círculo(5, "morado", false);
		
		Rectángulo rectangulo1= new Rectángulo();
		Rectángulo rectangulo2= new Rectángulo(10, 25, "azul", true);
		Cuadrado cuadrado1= new Cuadrado();
		Cuadrado cuadrado2= new Cuadrado(5);
		
		
		System.out.println(figura1.toString());
		System.out.println(figura2.toString());
		
		System.out.println(circulo1.toString());
		System.out.println(circulo2.toString());
		System.out.println(circulo2.getArea());
		System.out.println(circulo2.getPerimetro());
		
		System.out.println(rectangulo1.toString());
		System.out.println(rectangulo2.toString());
		System.out.println(rectangulo2.getArea());
		
		System.out.println(cuadrado1.toString());
		System.out.println(cuadrado2.toString());
		
		

	}

}
