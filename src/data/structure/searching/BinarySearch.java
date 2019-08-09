/**
 * 
 */
package data.structure.searching;

/**
 * It assume that we have a sorted array to search an element in it.
 *  
 *  int [] input = {37,18,11,59,24,22,46,35};
 *  Arrays.sort(input);
 * 
 * @author sanket
 *
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] input = {11,18,22,24,35,37,46,59};

		int val = 46;
		int index = BinarySearch.search(input, val, 0, input.length-1);
		if(index<0)
			System.out.println("Value not found in array.");
		else
			System.out.println("Index for value: "+index);

	}

	private static int search(int[] input, int val, int l, int h) {		
		if(h<l)
			return -1;
		int mid = (h+l)/2;
		if(input[mid] == val) {
			return mid;
		}else if(input[mid] < val)
			return search(input, val, mid+1, h);
		else
			return search(input, val, l, mid-1);

	}

}
