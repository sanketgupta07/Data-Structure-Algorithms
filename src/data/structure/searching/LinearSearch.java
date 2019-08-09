/**
 * 
 */
package data.structure.searching;

/**
 * @author sanket
 *
 */
public class LinearSearch {	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] input = {37,18,11,59,24,22,46,35}; 
		int val = 46;
		int index = LinearSearch.search(input, val);
		if(index<0)
			System.out.println("Value not found in array.");
		else
			System.out.println("Index for value: "+index);
	}

	private static int search(int[] input, int val) {
		for (int i = 0; i < input.length; i++) {
			if(input[i]== val)
				return i;
		}
		return -1;
	}

}
