package in.r0h;

import java.util.Stack;

public class StackDemo {
  
  public static void main(String[] args) {

    Stack<Integer> s1 = new Stack<Integer>();
    Stack<String> s2 = new Stack<String>();
    
    /*
      * A collection C has an unknown number of elements.
      * Populate stack S with the event valued elements from C.
      * For example, if C = {1,2,3} then S = {2}
    */

    int[] arr = {1, 2, 3};

    for (int i = 0; i < arr.length; i++) {
      s1.push(arr[i]);
    }

    int num = s1.peek();

    System.out.println("num: " + num);
    System.out.println("s1: " + s1);

    /*
      * An array of strings called WORDS contains an unknown number of elements.
      * Push all the elements from the array into stack S.
    */

    String[] words = {"one", "two", "three"};
    for (int i = 0; i < words.length; i++) {
      s2.push(words[i]);
    }

    System.out.println("s2: " + s2);


  }
}
