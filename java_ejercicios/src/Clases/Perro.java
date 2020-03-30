package Clases;



public class Perro extends Animal {
	protected String raza;

  public Perro() {
	  nombre = "Goku";
	  edad = 3;
	  raza = "pitbull";
  }
  public Perro ( String nombre, int edad, String raza) {
	  this.nombre=nombre;
	  this.edad=edad;
	  this.raza=raza;
	  
  }
  public String toString() {
	  return "Los animales tienes estas características: nombre: "+nombre +"| edad: "+edad+
	  		"| raza: " + raza +"	Han sido creados un total de "+ numAnimales+ " animales";
	  
  }
  
public String getRaza(){
	return raza;
	
}
 public void setRaza(String raza) {
	 this.raza = raza;
 }
}