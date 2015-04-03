package es.pagoru.principiante.tutorial2;

public class Main {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		
		int c = a + b;
		
		System.out.println(c);
		
		if(a != 10){
			
			System.out.println("a");
			
		} else if(b == 12) {
			
			System.out.println("b");
			
		} else {
			
			System.out.println("c");
			
		}
		
		String alpha = "alpha";
		String bravo = "alpha";
		
		if(alpha.equals(bravo)){
			
			System.out.println("true alpha");
			
		}
		
		for (int i = 10; i > -1; i--) {
			
			if(i == a){
				
				System.out.println(i + " >> La a == a i");
				
			}
			
		}

	}

}
