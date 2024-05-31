package daw.prog.CodeWars_HighestScoringWord;

public class Kata {

	  public static String high(String s) {
		  String words[] = s.split(" ");
		  int pointsWords[] = new int[words.length];
		  
		  for(int i = 0; i < words.length; i++) {
			  //words[i]=words[i].toLowerCase();
			  pointsWords[i] = 0;
			  for(int j = 0; j < words[i].length(); j++) {
				  int pointsChar = (int) words[i].charAt(j);
				  pointsChar -= 96;
				  pointsWords[i] += pointsChar;
			  }
			  
		  }
		  
		  int biggest = Integer.MIN_VALUE;
		  int pos = 0;
		  for(int i = 0; i < pointsWords.length; i++) {
			  if(pointsWords[i] > biggest) {
				  biggest = pointsWords[i];
				  pos = i;
			  }
		  }
		  
		  return words[pos];
	  }
	
}
