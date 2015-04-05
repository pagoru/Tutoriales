package es.pagoru.principiante.tutorial6;

import es.pagoru.principiante.tutorial6.prot.Hola;

public class Main {

	public static void main(String[] args) {
		
		String aloha = "Alhoa";
		String hola = "Hola!";
		String adios = "Adios!";
		String nada = "Nada";
		
		setHola(hola, 56, false);
		setHola(aloha, 32456, false);
		setHola(adios, 235, true);
		setHola(nada, 564, true);
		
		Hola.cacahuete();

	}
	
	public static void setHola(){
		
		System.out.println("No tengo argumentos.");
		
	}
	
	public static void setHola(String hola){
		
		System.out.println(hola);
		
	}
	
	public static void setHola(String hola, int integer, boolean bool){
		
		if(bool){
			
			String saludo = hola + " - " + bool + " - " + integer;
			
			System.out.println(saludo);
			
		} else {
			
			System.out.println("No!");
			
		}
				
	}

}
