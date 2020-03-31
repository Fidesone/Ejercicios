package Herencia_Geometrica;



public class Círculo extends Figura {
	
	protected double radio;

	
	public Círculo() {
		radio = 1;
		
	}
	public Círculo(double radio) {
		this.radio = radio;
	}
	public Círculo( double radio, String color, boolean relleno) {
		this.radio = radio;
		this.color = color;
		this.relleno = relleno;
	}
	
	//Getter y setter de radio
	
	public Double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio=radio;
	}
	
	//Métodos getArea | getPerímetro
	
	 public double getArea() {
		 double Area = Math.PI * (radio * radio);
		 return Area;
	 }
	public double getPerimetro() {
		double Perimetro = 2 * Math.PI * radio;
		
		return Perimetro;
		
	}
	
	 @Override
	 public String toString() {
			return "Soy un circulo con radio = "+radio+ " esta es mi superclase: Soy una figura de color "+color+ " y relleno (true/false) "+ relleno;
		}
	 

}
