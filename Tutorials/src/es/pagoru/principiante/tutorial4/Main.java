package es.pagoru.principiante.tutorial4;

public class Main {

	public static void main(String[] args) {
		
		holaBoolean();
		holaArrayInt();
		holaForEach();

	}
	
	public static void holaBoolean(){
		
		boolean hola = false;
		
		if(hola){
			
			System.out.println("hola");
			
		}
		
	}
	
	public static void holaArrayInt(){
		
		int[] integer = {5, 4, 3242342, 89345, 243123};
		System.out.println(integer[0]);
		
		int[] integer2 = new int[5];
		integer2[4] = 67;
		System.out.println(integer2[4]);
				
	}
	
	public static void holaForEach(){
		
		String[] strArray = {"sadasd", "asdad", "asdad", "978872ye", "asy8da878"};
		
		for (String str : strArray) {
			
			System.out.println(str);
			
		}
		
	}

}
