package es.pagoru.principiante.tutorial5;

public class Main {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		
		array[0] = 0;
		
		if(array[0] == 0){
			
			array[1] = 4;
			array[2] = 6;
			
			if((array[1] < array[2] || array[1] != 5) && array[2] < 8){
				
				array[3] = array[1] + array[2];
				
				if(array[3] > 12){
					
					System.out.println("Mas grande que 12");
					
				} else if(array[3] < 12){
					
					System.out.println("Mas pequeño que 12");
					
				} else if(array[3] == 12) {
					
					System.out.println("12");
					
				}
				
			}
			
		}
		
		compararStringInteger();

	}
	
	public static void compararStringInteger(){
		
		int in = 10;
		String str = "10";
		
		int string = Integer.valueOf(str);
		String integer = in + "";
		
		if(str.equals(integer) || in == string){
			
			System.out.println("10 es 10");
			
		}
				
	}

}
