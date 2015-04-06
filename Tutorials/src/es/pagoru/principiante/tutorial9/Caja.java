package es.pagoru.principiante.tutorial9;

public class Caja {
	
	private String nombre;
	private int numeroCaras;
	
	public Caja(){
		
		this.nombre = "Default";
		this.numeroCaras = 6;
		
	}
	
	public Caja(String n){
		
		this.nombre = n;
		System.out.println("Hemos creado una caja " + n);
		
	}
	
	public void setCaja(String n, int c){
		
		this.nombre = n;
		this.numeroCaras = c;
		
	}
	
	public String getNombre(){
		
		return this.nombre;
		
	}
	
	public int getNumeroCaras(){
		
		return this.numeroCaras;
		
	}

}
