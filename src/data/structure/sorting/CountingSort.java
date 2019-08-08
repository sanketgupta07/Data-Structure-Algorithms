/**
 * 
 */
package data.structure.sorting;

import java.util.Arrays;

/**
 * @author sanket
 *
 */
public class CountingSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] input = {37,18,11,59,24,22,46,35}; 
		CountingSort.sort(input);
		for (int i : input) {
			System.out.print(i+ " ");
		}

	}

	private static void sort(int[] input) {
		int min= Arrays.stream(input).min().getAsInt();
		int max= Arrays.stream(input).max().getAsInt();
		
		int counting[] = new int[max+1];
		int arr_count = 0;
		for (int i = 0; i < input.length; i++) {
			counting[input[i]]++;
		}
		
		for (int i = min; i < counting.length; i++) {
			if(counting[i]>0)
			for (int j = 1; j <= counting[i]; j++) {
				input[arr_count] = i;
						arr_count++;
			}			
		}
	}

}
