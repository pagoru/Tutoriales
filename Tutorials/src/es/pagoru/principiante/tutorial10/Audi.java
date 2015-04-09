package es.pagoru.principiante.tutorial10;

public class Audi extends Coche{
	
	public boolean volante;
	
	public Audi(int ruedas){
		
		super(ruedas);
		
	}
	
	public void setVolante(boolean v){
		
		this.volante = v;
		
	}
	
	public boolean isVolante(){
		
		return this.volante;
		
	}
	
	public void setPuertas(int p){
		
		super.setPuertas(p * 5);
		
	}
	
	public int getPuertas(){
		
		return super.getPuertas() / 5;
		
	}

}
