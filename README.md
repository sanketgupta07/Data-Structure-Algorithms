# Data Structure and Algorithims

### Sorting

1. <b>Insertion Sort</b>
	
	Insertion sort takes maximum time to sort if elements are sorted in reverse order. And it takes minimum time (Order of n) when elements are already sorted.
		
	1.1 Time Complexity: O(n*n) -- 2 nested loops
		
	1.2 Auxiliary Space: O(1)
		
	1.3 Steps:
		
		* Start from second element.

		* sorted|unsorted <--> arr[0]|arr[1..n]
		
		* pick first value from unsorted array and insert it in sorted part of array.
		
		* move forward to unsorted array.
		
2. <b>Selection Sort</b>
		
	The good thing about selection sort is it never makes more than O(n) swaps and can be useful when memory write is a costly operation.
		
	2.1 Time Complexity: O(n*n) as there are two nested loops.
	
	2.2 Auxiliary Space: O(1)
	
	2.3 Steps:
		
		* Selection
		
		* Swapping
		
		* Counter++
	
3. <b>Bubble Sort</b>
		
	Bubble sort will compare two adjacent element and rearrange them in proper order. It will do the same until there is no swap.
		
	2.1 Time Complexity: O(n*n) as there are two nested loops.
	
	2.2 Auxiliary Space: O(1)
	
	2.3 Steps:
		
		* compare all adjacent elements 
		
		* Swapping if not sorted
		
		* Counter++
	
4. <b>Merge Sort</b>
		
	Merge sort works on divide and conquire method. It will divide the list of elements into sub list or array and sort them by comparing the smallest array and merge the ordered array.
		
	2.1 Time Complexity: O(nLogn) .
	
	2.2 Auxiliary Space: O(n)
	
	2.3 Steps:
		
		* Divide the array into smallest
		
		* compare and arrange element
		
		* Merge the ordered arrays into one.

3. <b>Quick Sort</b>
		
	Quick sort as the name suggest is the quickest way to sort elements. It it select one pivotal value and arrange that in the list at its correct place.
		
	2.1 Time Complexity: O(nLogn) .
	
	2.2 Auxiliary Space: O(n)
	
	2.3 Steps:
		
		* Select one pivotal, usually it select the first element. 
		
		* compare it from low +1 and high from both side and swap the element such that all the element bigger should come from right and smaller should come to left of pivotal. Which arrange pivotal element to its ordered position.
		
6. <b>Heap Sort</b>
		
	Heap sort will use MaxHeap or MinHeap to sort the elements of array.
		
	2.1 Time Complexity: O(nLogn) .
	
	2.2 Auxiliary Space: O(1)
	
	2.3 Steps:
		
		* Add the element in MaxHeap from array 
		
		* Delete the largest element (root) from MaxHeap. and add them to replaced location.
		* rearrange the elements in reduced heap to make it Max heap
		* repeat from step 2.

Refrences: http://www.geeksforgeeks.org/data-structures/