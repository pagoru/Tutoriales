package es.pagoru.principiante.tutorial9;

public class Main {
	
	public static void main(String[] args) {
		
		Caja caja1 = new Caja();
		
		System.out.println(caja1.getNombre() + " - " + caja1.getNumeroCaras());
		
		Caja caja2 = new Caja();
		caja2.setCaja("Caja numero 2", 9);
		
		System.out.println(caja2.getNombre() + " - " + caja2.getNumeroCaras());
		
	}

}
