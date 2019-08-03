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
		
	The good thing about selection sort is it never makes more than O(n) swaps and can be useful when memory write is a costly operation.
		
	2.1 Time Complexity: O(n*n) as there are two nested loops.
	
	2.2 Auxiliary Space: O(1)
	
	2.3 Steps:
		
		* compare all adjacent elements 
		
		* Swapping if not sorted
		
		* Counter++
	
	

Refrences: http://www.geeksforgeeks.org/data-structures/