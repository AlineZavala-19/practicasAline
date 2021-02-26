package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.*;
public class PruebaPersonaje{
	public static void main(String[] args){
		Personaje per01 = new Personaje ("Aline");
		Personaje per02 = new Personaje ("Erick");
		Personaje per03 = new Personaje ("Alan");
		Personaje per04 = new Personaje ("Lesly");
		Personaje per05 = new Personaje ("Brian");
		per01.setEdad(200);
		per02.setEdad(10);
		per03.setEdad(1);
		per04.setEdad(-10);
		per05.setEdad(500);
		
		System.out.println(per01.getDetalle());
		System.out.println(per02.getDetalle());
		System.out.println(per03.getDetalle());
		System.out.println(per04.getDetalle());
		System.out.println(per05.getDetalle());
		
		Personaje per06 = per05;
		Personaje per07 = per04;
		Personaje per08 = per03;
		Personaje per09 = per02;
		Personaje per10 = per01;
		
		per06.setNombre("Jorge Eduardo");
		per08.setNombre("Yosselin");
		per10.setNombre("Ana");
		
		int newEdad = (int) (Math.random()*1000);
		int newEdad2 = (int)(Math.random()*1000);
		per07.setEdad(newEdad);
        per09.setEdad(newEdad2);
		
		System.out.println();
		System.out.println(per01.getDetalle());
		System.out.println(per02.getDetalle());
		System.out.println(per03.getDetalle());
		System.out.println(per04.getDetalle());
		System.out.println(per05.getDetalle());
	}
}
/* Cuando la edad no esta entre 1 y 120, ejecuta 0, igual en los nombre, si no esta entre 3 y 10 no lo cambia*/
