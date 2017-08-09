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

//		int [] output = insertionSort(input);
		int [] output = recursiveInsertionSort(input, 1);

		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

	}

	/**
	 * This method will sort the int array in assending order.
	 * 1. Start from second element.
	 * 2. sorted|unsorted <--> arr[0]|arr[1..n]
	 * 3. pick first value from unsorted array and insert it in sorted part of array.
	 * 4. move forward to unsorted array.
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

	/**
	 * Insertion Sort in recursion.
	 * @param arr
	 * @param n
	 * @return
	 */
	public static int[] recursiveInsertionSort(int[] arr, int n) {
		if(n == arr.length +1) {
			return arr;
		}else {
			int i;
			for ( i = n-1; i >0 && arr[i] < arr[i-1]; i--) {
				int temp = arr[i-1];
				arr[i-1] = arr[i];
				arr[i]=temp;
			}
			return recursiveInsertionSort(arr, n+1);
		}
	}

}
