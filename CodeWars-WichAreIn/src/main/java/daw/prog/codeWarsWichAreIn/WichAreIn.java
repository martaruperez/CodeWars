package daw.prog.codeWarsWichAreIn;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class WichAreIn {
	
//	Given two arrays of strings a1 and a2
//	return a sorted array r in lexicographical
//	order of the strings of a1 which are
//	substrings of strings of a2
	
	public static String[] inArray(String[] array1, String[] array2) {
		List <String> s = new ArrayList <>();
		for(int i = 0; i < array1.length; i++) {
			
			for(int j = 0; j < array2.length; j++) {
				
				int count = 0;
				for (int k = 0; k < array2[j].length(); k++) {
					if(count < array1[i].length() && array2[j].charAt(k)==array1[i].charAt(count)) {
						count++;
					}
				}
				if( count==array1[i].length() && !(s.contains(array1[i])) ) {
					s.add(array1[i]);
				}
				count = 0;
			}
			
		}
		return  arrayListToArray(s);
	}
	
	public static String[] arrayListToArray(List<String> a) {
		String[] s = new String[a.size()];
		
		for(int i = 0; i < s.length; i++) {
			s[i] = a.get(i); 
		}
		
		Arrays.sort(s);
		return s;
	}
}
