/**
 * 
 */
package data.structure.sorting;

/**
 * @author sanket
 *
 */
public class BinaryInsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] input = {7,8,1,9,4,2,6,5,44,22,14}; 
		BinaryInsertionSort.sort(input);
		for (int i : input) {
			System.out.print(i+" ");
		}

	}

	/**
	 * Binary search for position for insertion element in array.
	 * @param input
	 * @param val
	 * @param l
	 * @param h
	 * @return
	 */
	private static int search(int[] input, int val, int l, int h) {		
		if(h<=l) {// Means element not found and it should retun the low position if the value is less than low or low +1;
			return val>input[l]?l+1:l;
		}

		int mid = (h+l)/2;
		if(input[mid] == val) {// return next location
			return mid+1;
		}else if(input[mid] < val)
			return search(input, val, mid+1, h);
		else
			return search(input, val, l, mid-1);

	}

	/**
	 * 
	 * @param arr
	 * @return
	 */
	public static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			int loc=search(arr, key, 0, j);
			while (j>=loc) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[loc] = key;
		}
	}

}
