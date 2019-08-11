/**
 * 
 */
package data.structure.heap;

/**
 * @author sanket
 * 
 * MaxHeap is a balanced binary tree, which have parent node greater than its child node.
 * 
 *     80
 *    /  \
 *   40  30
 *  / \  / \
 * 20 10 5  3
 * 
 * Array representation:
 * [80, 40, 30, 20, 10, 5, 3]
 *  0   1    2   3   4  5  6
 * 
 * Child-Parent relation in heap
 * 
 * Left Child: 2*i+1
 * Right Child: 2*i+2
 * Parent: floor[i/2]
 * Nodes: [2 (pow) h]  -1
 * 
 * Addition: A new element will be added to the next available leaf position, and then it will be arranged to its its position upward direction.
 * Deletion: Element will always be removed from the root position and rest of the heap will be arranged to make it Max Heap again. 
 */
public class MaxHeap {

	public MaxHeap(int lenght) {
		maxHeap = new int [lenght];
		size=0;
	}
	private int [] maxHeap;
	private int size;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] input = {80, 50, 55, 76, 22, 90, 3}; 
		MaxHeap h = new  MaxHeap(input.length);

		for (int i : input) {
			h.insert(i);
		}

		for (int i : h.maxHeap) {
			System.out.print(i+" ");
		}
		System.out.println("");
		for (int i = 0; i < h.maxHeap.length; i++) {
			System.out.print(h.remove()+" ");
		}

	}

	/**
	 * Return the left node 
	 * @param position
	 * @return
	 */
	private int left(int position) {
		return position*2 +1;
	}

	/**
	 * Return the right node
	 * @param position
	 * @return
	 */
	private int right(int position) {
		return position*2 +2;
	}

	/**
	 * return the parent 
	 * @param position
	 * @return
	 */
	private int parent(int position) {
		return position/2;
	}

	/**
	 * leaf element check
	 * @param position
	 * @return
	 */
	private boolean isLeaf(int position) {
		if(position >= (size / 2) && position <= size)
			return true;
		return false;
	}

	/**
	 * Insert a element in heap.
	 * @param i
	 */
	private  void insert(int i) {
		if(size == 0) {
			maxHeap[0] = i;
			size++;
			return;
		}

		maxHeap[size] = i;	
		int current = size;
		while(maxHeap[current]>maxHeap[parent(current)]) {
			swap(current, parent(current));
			current = parent(current);
		}
		size++;
	}
	/**
	 * Remove element from max heap. remove the 0th position and replace it with last element .
	 * @return
	 */
	private int remove() {
		int val = maxHeap[0];
		maxHeap[0]=maxHeap[--size];
		heapify(0);
		return val;
	}
	private void swap(int i, int j) 
	{ 
		int tmp; 
		tmp = maxHeap[i]; 
		maxHeap[i] = maxHeap[j]; 
		maxHeap[j] = tmp; 
	} 

	private void heapify(int position) {
		if(isLeaf(position)){
			return;
		}

		if(maxHeap[position]<maxHeap[left(position)]) {
			swap(position,left(position));
			heapify(left(position));
		}

		if(maxHeap[position]<maxHeap[right(position)]) {
			swap(position,right(position));
			heapify(right(position));
		}
	}
}
