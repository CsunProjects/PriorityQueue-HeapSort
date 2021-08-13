
import java.util.Arrays;
import java.util.Random;

public class TestPQ
{
   public static void main(String[] args) {
      //Create an array called “smallData” of size 10 and initialize it with random integers between 0-999 (inclusive)
      Integer[] smallData = new Integer[10];
      //Create an array called “mediumData” of size 20 and initialize it with random integers between 0-999 (inclusive)
      Integer[] mediumData= new Integer[20];
     // System.out.println("HI");
      //Create a for loop that takes in the length size of the random integer produced into an arraylist
      for (int i = 0; i < smallData.length; i++) {
         //Creating the Random Number Variable
         Random number = new Random();
         //next int assigns the integer to a variable  x, and produces any number between 1 and 100000 because array size+1 is the index
         int x = 1 + number.nextInt(1000);
         smallData[i] = x;
      }
      for (int i = 0; i < mediumData.length; i++) {
         //Creating the Random Number Variable
         Random number = new Random();
         //next int assigns the integer to a variable  x, and produces any number between 1 and 100000 because array size+1 is the index
         int x = 1 + number.nextInt(1000);
         mediumData[i] = x;
      }

      // Create a PQ called “smallPQ” from the “smallData” array.
      PriorityQueue<Integer> smallPQ= new PriorityQueue<Integer>((smallData));// 🍉 might be wrong cause it was wrapped as list
//                Create a PQ called “mediumPQ” from the “mediumData” array.
      PriorityQueue<Integer> mediumPQ= new PriorityQueue<Integer>((mediumData)); //????
//                Combine “smallPQ” and “mediumPQ” as “result” PQ
      System.out.println("SmallPq: Line 34: "+smallPQ.toString());
      System.out.println("MediumPq: Line 35: "+mediumPQ.toString());

      PriorityQueue<Integer> result = smallPQ.combine(mediumPQ);
//        Convert “result” PQ to an array called “list”
//        Print “list” array
//        Sort “list” array using HeapSort
//        Print “list” array
     // System.out.println("line 41" +result.toString() ); //same as line 45
      Integer[] list = new Integer[result.size()];
      list = result.toArrays(list);
      System.out.println("Line 45: "+ Arrays.toString(list));

      HeapSort.heapSort(list);
      System.out.println("Line 48: "+ Arrays.toString(list));

   }
}
