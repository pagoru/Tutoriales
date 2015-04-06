package es.pagoru.principiante.tutorial8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		createScanner();
		createScannerBoolean();
		createScannerinteger();
		
	}
	
	public static void createWhile(){
		
		while(true){
			
			System.out.println("Hola!");
			
		}
		
	}
	
	public static void createScanner(){
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
			
			String str = scan.next();
			
			if(str.equals("hola")){
				
				System.out.println("Hola, que tal estas?");
				
			} else if(str.equals("exit")){
				
				break;
				
			}
			
		}
		
	}
	
	public static void createScannerBoolean(){
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
				
			boolean bool = scan.nextBoolean();
			
			if(bool){
				
				System.out.println("Es verdadero.");
				
			}

		}
		
	}
	
	public static void createScannerinteger(){
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
				
			int integer = scan.nextInt();
			
			if(integer == 0){
				
				System.out.println("Es 0.");
				
			}

		}
		
	}

}
