package daw.prog.CodeWars_TwoToOne;
import java.util.List;
import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;

public class TwoToOne {
	
    public static String longest (String s1, String s2) {
    	List<Character> letras = new ArrayList<>();
    	
        for(int i = 0; i < s1.length(); i++) {
        	if(!letras.contains(s1.charAt(i))) {
        		letras.add(s1.charAt(i));
        	}
        }
        for(int i = 0; i < s2.length(); i++) {
        	if(!letras.contains(s2.charAt(i))) {
        		letras.add(s2.charAt(i));
        	}
        }
        
        letras.sort(null);
        String s = "";
        for(int i = 0; i < letras.size(); i++) {
        	s+=String.valueOf(letras.get(i));
        }
        
    	return s;
    }
}
