package daw.prog.CodeWars_Kata_DontGiveMeFive;

public class Kata {
	
//	En este kata obtienes el número inicial y el número
//	final de una región y debes devolver el recuento de
//	todos los números excepto los números con un 5. 
//	¡El número inicial y final son ambos inclusivos!
	
	public static int dontGiveMeFive(int start, int end){
		int answer = 0;
		boolean tieneUnCinco = false;
		
		for(int i = start; i <= end; i++) {
			String stringNum = String.valueOf(i);
			
			for(int j = 0; j < stringNum.length(); j++) {
				if(stringNum.charAt(j)=='5') {
					tieneUnCinco = true;
				}
			}
			
			if(!tieneUnCinco) {
				answer++;
			}
			
			tieneUnCinco = false;
		}
		
		return answer;
	}
	
}
