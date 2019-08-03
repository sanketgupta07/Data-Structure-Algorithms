/**
 * 
 */
package data.structure.sorting;

/**
 * @author sanket
 *
 */
public class QuickSort {

	static void sort (int []arr, int low, int high) {
		if(low < high) {
			// decide a pivot and arrange all small element to left and bigger to right of it.
			int pi = partition(arr, low, high);

			sort(arr, low, pi -1);
			sort(arr, pi +1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[low];
		int j = high;
		int i = low+1;
		while(i<j) {
			while(pivot >= arr[i] && i<=j) {
				i++;
			}
			while (pivot <= arr[j] && i<=j){			
				j--;
			}

			if (i<=j) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]= temp;
			}
		}

		int temp = arr[j];
		arr[j] = arr[low];
		arr[low] = temp;

		return j;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input = {7,8,1,9,4,2,6,5}; 
		QuickSort.sort(input, 0, input.length-1);
		for (int i : input) {
			System.out.println(i);
		}
	}

}
