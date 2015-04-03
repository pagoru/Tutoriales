package es.pagoru.principiante.tutorial3;

public class Main {

	public static void main(String[] args) {
		
		holaSwitch();
		arrayString();
		holaDouble();

	}
	
	public static void holaDouble(){
				
		double a = 5.4;
		double b = 3.2;
		
		double c = a / b;
		
		System.out.println(c);
		
	}
	
	public static void holaSwitch(){
		
		String key = "Llave";
		
		switch (key) {
		case "almendra":
			
			System.out.println("almendras");
			
			break;
			
		case "Llave":
			
			System.out.println("Llave");
			
			break;
			
		default:
			
			System.out.println("default");
			
			break;
		}
		
	}
	
	public static void arrayString(){
		
		String[] array = {"primero", "segundo"};
		System.out.println(array[1]);
		
		String[] array2 = new String[2];
		System.out.println(array2[0]);
		
		array2[0] = "cacahuete";
		
		if(array2[0] != null){
			
			System.out.println("No es null");
			
		}
		
		String cacahuete = array[0];
		
		System.out.println(cacahuete);
		
	}

}
