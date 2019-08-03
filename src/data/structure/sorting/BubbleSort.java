/**
 * 
 */
package data.structure.sorting;

/**
 * @author sanket
 *
 *Bubble Sort : it will compare two consecutive elements of an array and swap them for sorting in order.
 */
public class BubbleSort {
	static void sort(int[]arr){
		boolean inerationflag = true;
		while(inerationflag) {
			inerationflag = false;
			for (int i = 0; i < arr.length; i++) {
				if(i< arr.length -1 && arr[i] >arr[i+1]) {
					//swap 
					int temp;
					temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i]=temp;
					inerationflag = true;
				}

			}	
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {3,9,2,5,6,4,7,1}; 
		BubbleSort.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}	
}
