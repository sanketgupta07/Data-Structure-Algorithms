/**
 * 
 */
package data.structure.sorting;

/**
 * @author Sanket Gupta
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] input = {7,8,1,9,4,2,6,5}; 

		//		int [] output = selectionSort(input);
		int [] output = recursionSelectionSort(input, 0);

		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

	}


	/**
	 * Selection Sort
	 *  1. Selection
	 *  2. Swaping 
	 *  3. counter shift
	 * @param arr
	 * @return
	 */
	public static int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) { //Counter shift
			int minIndx =i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[minIndx]) {
					minIndx = j; //Selection 
				}				
			}
			//Swap
			int temp = arr[i];
			arr[i] = arr[minIndx];
			arr[minIndx] = temp;

		}
		return arr;
	}

	/**
	 * Selection Sort in recursion.
	 * @param input
	 * @return
	 */
	public static int[] recursionSelectionSort(int[] arr, int n) {
		if(n == arr.length ) {
			return arr;
		}else {
			int i;
			int min_indx=n;
			for ( i = n+1; i < arr.length; i++) {
				if(arr[i] < arr[min_indx])
					min_indx=i;				
			}

			int temp = arr[min_indx];
			arr[min_indx]=arr[n];
			arr[n]=temp;
			return recursionSelectionSort(arr, n+1);
		}

	}
}
