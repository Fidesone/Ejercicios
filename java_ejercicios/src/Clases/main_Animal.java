package Clases;

public class main_Animal {

	public static void main(String[] args) {
		Animal animal1= new Animal();
		Animal animal2= new Animal("foca",  8);
		Animal animal3= new Animal("pingüino", 6);
		Animal animal4= new Animal();
		Animal animal5= new Animal();
		Perro animal6= new Perro();
		Perro animal7= new Perro("naruto", 5, "pomeranian");
		Gato animal8= new Gato();
		Gato animal9= new Gato("garfield", 5, 3);
		
		
		/*System.out.println(animal1.toString());
		System.out.println(animal2.toString());
		System.out.println(animal3.toString());
		System.out.println(animal4.toString());
		System.out.println(animal5.toString());

		System.out.println(animal6.toString());
		System.out.println(animal7.toString());
		*/
		
		System.out.println(animal8.toString());
		System.out.println(animal8.getVidas());
		System.out.println(animal8.restarVida());
	}

}
