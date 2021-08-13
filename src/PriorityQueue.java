
import javax.lang.model.type.ArrayType;
import java.util.*;
public class PriorityQueue<T> extends Heap<T> { //🍉 this extends inheritence from Heap
//  private Heap<T> pq;

   public PriorityQueue() {
      super();// this calls line 8 constructor in heap file
   } //last in first out = largest node at top, filled in left to right.

   public PriorityQueue(Comparator<T> c) {
      super(c);
   } //what ever type value is passed is set to new heap passed as the letter c

   // Create a PQ form objects array
   public PriorityQueue(T[] objects) { //creates priority queue of objects that were passed
      super(objects); // this passes objects to constructor super
      //  Left as exercise
   }

   //🍉 all of lines 17-29 commented out because not needed
//   public boolean isEmpty() {
//      return pq.isEmpty();
//   } // checks if any values are in priority queue
//
//   public void add(T newItem){
//      pq.add(newItem);
//   } // this adds the new item into priority queue
//
//   public T remove() {
//      return pq.remove();
//   } // this removes the first maximum value out of priority queue
//
   // Combine this PQ with pq
   public PriorityQueue<T> combine(PriorityQueue<T> pq) { // this combines two priority queues , one from the pq into the instance of another pq
      // Left as exercise

      PriorityQueue<T> PQTwo = new PriorityQueue<T>(); // first create a new priority queue constructor
      // fill in with current class
      for(int i=0;i<this.size();i++)// 🍉  changed here to for loop .
      {
         PQTwo.add(this.get(i));// removes from current and adds to new pqtwo
      }
      //fill in with pq (the argument)
      for(int i=this.size();i< this.size()+size();i++)//while is not empty loop, removes items
      {
         PQTwo.add(pq.get(i));// pq two is now filled with objects from both pq and current class
      }
      return PQTwo;
      // return the created priority queue

//

   }


   // Convert this PQ to an array 
   // public T[] toArray(T[] arr) {
   // Left as exercise
   //  }
   public T[] toArrays(T[] arr) {
      for(int i = 0; i < this.size();i++){
         arr[i] = this.get(i);
      }

      return arr;

   }


   // public String toString() {
   //   return pq.toString();
   //  }

}

