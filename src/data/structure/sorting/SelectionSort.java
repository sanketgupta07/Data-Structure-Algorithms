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

		int [] output = selectionSort(input);

		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

	}

	/**
	 * Selection Sort
	 * @param arr
	 * @return
	 */
	public static int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIndx =i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[minIndx]) {
					minIndx = j; //setting the minIndx for small value 
				}				
			}
			//Swap
			int temp = arr[i];
			arr[i] = arr[minIndx];
			arr[minIndx] = temp;
			
		}
		return arr;
	}

}
