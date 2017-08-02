/**
 * 
 */
package data.structure.sorting;

/**
 * @author Sanket Gupta
 *
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] input = {7,8,1,9,4,2,6,5}; 

		int [] output = insertionSort(input);

		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

	}

	/**
	 * This method will sort the int array in assending order.
	 * @param arr
	 * @return int []
	 */
	public static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j ;
			for (j = i-1; j >=0 && key < arr[j]; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = key;
		}
		return arr;
	}

}
