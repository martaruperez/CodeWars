package daw.prog.CodeWars_FindOutlier;

public class FindOutlier 
{	
//	You are given an array 
//	(which will have a length of at
//	least 3, but could be very large) 
//	containing integers. The array is
//	either entirely comprised of odd integers
//	or entirely comprised of even integers except
//	for a single integer N. Write a method that 
//	takes the array as an argument and 
//	returns this "outlier" N.
	
	static int find(int[] integers) {
		for(int i = 0; i < integers.length; i++) {
			
			if( esPar(integers[0]) == esPar(integers[1])) {
				if(esPar(integers[i]) != esPar(integers[0])) {
					return integers[i];
				}
			}
			else {
				if(esPar(integers[0]) == esPar(integers[2])) {
					return integers[1];
				}
				else {
					return integers[0];
				}
			}
			
		}
		
		return 0;
	}
	
	static boolean esPar(int num) {
		if(num%2==0) {
			return true;
		}
		return false;
	}
}
