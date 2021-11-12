package main_principal;

import inventario.Artistas;

public class Humanos {

	public static void main(String[] args) {
		
		Persona persona_1 = new Persona();
		persona_1.setNombre("Carlos");
		System.out.println("Mi nombre es..." + persona_1.getNombre()); 

		Artistas art = new Artistas();
		art.setId_artista(10);
		art.setNombre_artista("Carlos");
		art.setLugar_de_nacimiento("Zaragoza");
		System.out.println("El nombre del artista es..." +art.getNombre_artista());
	}

}
