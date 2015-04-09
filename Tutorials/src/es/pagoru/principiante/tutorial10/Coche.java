package es.pagoru.principiante.tutorial10;

public class Coche {

	public int ruedas;
	public int puertas;
	public String modelo;
	public String marca;
	
	public Coche(int ruedas){
		
		this.ruedas = ruedas;
		
	}
	
	public void setRuedas(int r){
		
		this.ruedas = r;
		
	}
	
	public void setPuertas(int p){
		
		this.puertas = p;
		
	}
	
	public void setModelo(String m){
		
		this.modelo = m;
		
	}
	
	public void setMarca(String m){
		
		this.marca = m;
		
	}
	
	public int getRuedas(){
		
		return this.ruedas;
		
	}
	
	public int getPuertas(){
		
		return this.puertas;
		
	}
	
	public String getModelo(){
		
		return this.modelo;
		
	}
	
	public String getMarca(){
		
		return this.marca;
		
	}
	
}
