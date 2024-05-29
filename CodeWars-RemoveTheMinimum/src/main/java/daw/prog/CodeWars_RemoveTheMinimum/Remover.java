package daw.prog.CodeWars_RemoveTheMinimum;

public class Remover {
	
//	Given an array of integers, remove
//	the smallest value. Do not mutate the
//	original array/list. If there are multiple
//	elements with the same value, remove the
//	one with the lowest index. If you get an
//	empty array/list, return an empty array/list.
//	Don't change the order of the elements that are left.
	
	public static int[] removeSmallest(int[] numbers) {
		if(numbers.length<1) {
			return new int[]{};
		}
		
		int[] answer = new int[numbers.length - 1];
		int smallest = Integer.MAX_VALUE;
		int pos = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < smallest) {
				smallest = numbers[i];
				pos = i;
			}
		}
		
		for(int i = 0; i < answer.length; i++) {
			if(i < pos) {
				answer[i]=numbers[i];
			}
			else {
				answer[i]=numbers[i+1];
			}
		}
		
		return answer;
	}
	
}
