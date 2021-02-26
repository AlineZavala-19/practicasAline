package mx.com.softgame.poo1game.personajes;
public class Personaje{
	//atributos
	private String nombre;
	private int edad;
	//constructor
	public Personaje (String nombre){
		this.nombre = nombre;
		this.edad = edad;
	}
	//metodos
	public String getNombre(){
		return nombre;
	}
	public int getEdad(){
		return edad;
	}
	public String getDetalle(){
		return nombre + "\t" + edad; 
	}
	public void setNombre(String nombre){
		if (nombre.length() >=3 && nombre.length() < 10){
			this.nombre = nombre;
		}
	}
	public boolean setEdad(int edad){
		boolean inicio = false;
		if (edad > 0 && edad < 121 ){
			this.edad = edad;
			inicio = true;
		}
		return inicio;
	}
	public void saludar(){
		System.out.println("Hola Alumno de POO " + nombre);
	}
}