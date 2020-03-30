package Clases;

public class Gato extends Animal {
	
	protected int vidas = 7;


	public Gato () {
		nombre= "Tom";
		edad= 2;
		vidas= 7;
		
	}
	
	public Gato(String nombre,int edad, int vidas) {
	this.nombre=nombre;
	this.edad=edad;
	this.vidas=vidas;
	}
	
	
	public String toString(){
		return "Los animales tienes estas características: nombre: "+nombre +" y edad: "+edad+
				". Los gatos tienen "+vidas+" vidas. Han sido creados un total de "+ numAnimales+ " animales";
	}
public int getVidas() {
	return vidas;
}
public int restarVida() {
	 int resultado = vidas - 1;
	return resultado;
}

}