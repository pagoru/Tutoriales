package es.pagoru.principiante.tutorial7;

public class Main {

	public static void main(String[] args) {
		
		String va = vacio("hola!");
		System.out.println(va);
		
		boolean bo = isNumber(0);
		System.out.println(bo);
		
		System.out.println(formula(45));
		
		String[] array = getFromArray("Alpha", "Beta", "Gamma");
		String[] array2 = getFromArray("Alpha", "Beta", "Gamma");
		String[] array3 = getFromArray("Alpha", "Beta", "Gamma");
		
		System.out.println(array[2] + array2[0] + array3[1]);

	}
	
	public static String vacio(String str){
		
		return str + " algo!";
		
	}
	
	public static boolean isNumber(int i){
		
		if(i > 0){
			
			return true;
			
		}
		
		return false;
		
	}
	
	public static int formula(int x, int y){
		
		int z = x * y;
		
		return z;
		
	}
	
	public static double formula(double a){
		
		double xc = formula(34, 2) / a;
		
		return xc;
		
	}
	
	public static String[] getFromArray(String a, String b, String c){
		
		String[] arrayStr = new String[3];
		
		String input = "";
		
		for (int i = 0; i < 3; i++) {
			
			if(i == 0){
				
				input = a;
				
			} else if(i == 1){
				
				input = b;
				
			} else {
				
				input = c;
				
			}
			
			arrayStr[i] = input;
			
		}
		
		return arrayStr;
		
	}

}
