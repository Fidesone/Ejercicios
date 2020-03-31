package Herencia_Geometrica;

public class Rectángulo extends Figura {
	
 protected double ancho;
 protected double largo;
 
 public Rectángulo() {
	 ancho=1;
	 largo=2;
	 
 }
 public Rectángulo(double ancho, double largo) {
	 this.ancho=ancho;
	 this.largo=largo;
	 
 }
 public Rectángulo( double ancho, double largo, String color, boolean relleno) {
	 this.ancho= ancho;
	 this.largo= largo;
	 this.color= color;
	 this.relleno= relleno;
	 
 }
 public double getAncho() {
	 return ancho;
 }
 public void setAncho(double ancho) {
	 this.ancho=ancho;
 }
 public double getLargo() {
	 return largo;
 }
 public void setLargo(double largo) {
	 this.largo=largo;
 }
 public double getArea() {
	 double Area =  ancho * largo;
	 return Area;
 }
 public double getPerimetro() {
	 double Perimetro= 2 * (ancho + largo);
	 return Perimetro;
 }
 
 @Override
 public String toString() {
		return "Soy un rectángulo con ancho: "+ancho+ " y largo: "+largo+ " esta es mi superclase: Soy una figura de color "+color+ " y relleno (true/false) "+ relleno;
	}
 
 
 
 
 
 
 
 
 
 
 
}
