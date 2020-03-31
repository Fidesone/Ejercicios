package Herencia_Geometrica;

public class Cuadrado extends Rectángulo {
	
	double lado = largo;
	
	public Cuadrado() {
		
	}
	
	public Cuadrado(double lado) {
		super (lado, lado);
	}
	
	public double getLado() {
		return lado;
		
	}
	public void setLado(double lado) {
		this.lado=lado;
		
	}
	
	 @Override
	 public double getLargo() {
		 return largo;
	 }
	 
	 @Override
	 public void setLargo(double largo) {
		 this.largo=largo;
	 }
	
	
	 @Override
	 public String toString() {
			return "Soy un cuadrado con lado: "+lado+ " esta es mi superclase: Soy una figura de color "+color+ " y relleno (true/false) "+ relleno;
		}
}

