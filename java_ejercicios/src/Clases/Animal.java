package Clases;

public class Animal {
	
protected String nombre;
protected int edad;
protected static int numAnimales= 0;


public Animal(){
	 nombre = "desconocido";
	 edad = 0;
	 numAnimales++;
}
public String toString(){
	return "Los animales tienes estas características: nombre: "+nombre +" y edad: "+edad+
			". Han sido creados un total de "+ numAnimales+ " animales";
}
public Animal(String nombre, int edad) {
	this.nombre=nombre;
	this.edad=edad;
	numAnimales++;
}

public String getnombre() {
	return nombre;
}

public void setname(String nombre) {
	this.nombre= nombre;
	
}

public int getedad() {
	return edad;
}

public void setedad(int edad) {
	this.edad=edad;
}


}
