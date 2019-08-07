/**
 * 
 */
package data.structure.sorting;

/**
 * @author sanket
 *
 */
public class HeapSort {



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] input = {7,8,1,9,4,2,6,5,44,22,14}; 
		HeapSort.sort(input);
		for (int i : input) {
			System.out.print(i+" ");
		}
	}

	private static void sort(int[] arr) {
		int n = arr.length;
		//Convert array to MaxHeap
		for (int i = n / 2 - 1; i >= 0; i--) 
			heapify(arr, n, i);
		for (int i=n-1; i>=0; i--) 
		{ 
			// Move current root to end 
			int temp = arr[0]; 
			arr[0] = arr[i]; 
			arr[i] = temp; 

			// call max heapify on the reduced heap 
			heapify(arr, i, 0); 
		}

	}

	private static void heapify(int[] arr, int n, int i) {
		int largest = i;
		int left = 2*i+1;
		int right = 2*i +2;

		if(left < n && arr[left]>arr[largest])
			largest = left;

		if(right < n && arr[right]>arr[largest])
			largest = right;

		if(largest != i) {
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i]= temp;
			heapify(arr, n , largest);
		}

	}

}
