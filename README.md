# PriorityQueue-HeapSort
Implement a PQ and Heapsort, inheritance, pq convert to arraylist, call testpq, randonnumbergenerator
____________________________________________________________________________________________________
Given “Heap.java”, “PriorityQueue.java”, and “HeapSort.java” classes:

STAGE 1: Heap.java
Implement the following method. (10 points)

// Create a heap form objects array
@SuppressWarnings("unchecked")
public Heap(T[] objects) {
// Left as exercise

 }

public int size(){
// Left as exercise

}

public T get(int i) {
// Left as exercise
}


STAGE 2: PriorityQueue.java

Change the implementation of “PriorityQueue.java” from composition to inheritance. (10 points)
Implement the following methods: (60 points)
	
	// Create a PQ form objects array
public PriorityQueue(T[] objects) {
   		 //  Left as exercise
  	 }


	// Combine this PQ with pq
   	public PriorityQueue<T> combine(PriorityQueue<T> pq) {
    		// Left as exercise
  	 }

	
// Convert this PQ to an array 
  	 public T[] toArray(T[] arr) {
	 	 // Left as exercise
  	 }

STAGE 3: TestPQ.java (20 points)

Write a drive program called “TestPQ.java” and do the following:

Create an array called “smallData” of size 10 and initialize it with random integers between 0-999 (inclusive) 
Create an array called “mediumData” of size 20 and initialize it with random integers between 0-999 (inclusive) 
Create a PQ called “smallPQ” from the “smallData” array.
Create a PQ called “mediumPQ” from the “mediumData” array.
Combine “smallPQ” and “mediumPQ” as “result” PQ
 // result = smallPQ.combine(mediumPQ);
Convert “result” PQ to an array called “list”
Print “list” array
Sort “list” array using HeapSort
Print “list” array








