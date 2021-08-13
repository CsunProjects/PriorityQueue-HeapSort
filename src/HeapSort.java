import java.util.Comparator;

public class HeapSort {
  /** Heap sort method */
  @SuppressWarnings("unchecked")
  public static <E> void heapSort(E[] list) {
    // Create a Heap of integers
    heapSort(list, (e1, e2) -> ((Comparable<E>)e1).compareTo(e2)); // this compares a pq denoted as list (name of variable ) to another pq
  }
  
  /** Heap sort method */
  public static <E> void heapSort(E[] list, Comparator<E> c) { // this sorts the element list comparing another element
    // Create a Heap of integers
    Heap<E> heap = new Heap<>(c); // this sets the heap element to new heap passing it as "c"/creates new heap element

    // Add elements to the heap
    for (int i = 0; i < list.length; i++) // this adds values to  heap until  length of list is equal or more
      heap.add(list[i]);

    // Remove elements from the heap
    for (int i = list.length - 1; i >= 0; i--) // removes values of elements from the heap
      list[i] = heap.remove();
  }

  /** A test method */
  public static void main(String[] args) {
    Integer[] list = {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53}; 
    heapSort(list); // sorting list via heapsort
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + " "); //prints out list elements that were passed from heap
  }
}