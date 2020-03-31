package Herencia_Geometrica;

public class Figura {
	
	 protected String color;
	 protected boolean relleno;
	

	 //constructor sin parametros
public Figura() { 
	color = "rojo";
	relleno = true;
	
}

	//constructor con dos parámetros
public Figura (String color, boolean relleno) {
	this.color= color;
	this.relleno = relleno;
}

	//Metodo toString()
public String toString() {
	return "Soy una figura de color "+color+ " y relleno (true/false) "+ relleno;
}
	//Getter y setter de los atributos
public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public boolean getRelleno() {
	return relleno;
}
public void setRelleno(boolean relleno) {
	this.relleno = relleno;
}
}
