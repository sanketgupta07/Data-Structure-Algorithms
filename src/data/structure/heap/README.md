# Data Structure and Algorithms -- Heap

### Heap

1. <b>Max Heap</b>

	MaxHeap is a balanced binary tree, which have parent node greater than its child node.
  
      80
     /  \
    40  30
    / \  / \
    20 10 5  3
 
    Array representation:
   
    [80, 40, 30, 20, 10, 5, 3]
     0   1    2   3   4  5  6
   
   <b>Child-Parent relation in heap</b>
   
    Left Child: 2*i+1
   
    Right Child: 2*i+2
   
    Parent: floor[i/2]
   
    Nodes: [2 (pow) h]  -1
    
    Addition: A new element will be added to the next available leaf position, and then it will be arranged to its its position upward direction.
   
    Deletion: Element will always be removed from the root position and rest of the heap will be arranged to make it Max Heap again. 
 
	
2. <b>Min Heap</b>

		MinHeap is a balanced binary tree, which have parent node less than its child node.
  
      3
     /  \
     5    10
    / \   / \
    20 30 40  80
 
    Array representation:
   
    [3, 5, 10, 20, 30, 40, 80]
     0  1   2   3   4   5   6
   
   <b>Child-Parent relation in heap</b>
   
    Left Child: 2*i+1
   
    Right Child: 2*i+2
   
    Parent: floor[i/2]
   
    Nodes: [2 (pow) h]  -1
    
    Addition: A new element will be added to the next available leaf position, and then it will be arranged to its its position upward direction.
   
    Deletion: Element will always be removed from the root position and rest of the heap will be arranged to make it Min Heap again.
	

Refrences: http://www.geeksforgeeks.org/data-structures/