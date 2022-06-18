package in.r0h;

import java.util.Arrays;

public class $RA {
  // Tools class by Rohin Arya.
  // Y11, Computer Science. 

  public static void main(String[] args) {
    System.out.println((char)27 + "[36m" + "---======]" + (char)27 + "[31m" + " Rohin's Tools Class " + (char)27 + "[36m" + "[======---\n\n" + (char)27 + "[35m");

    int[] workingArray = {1, 2, 3, 4, 5, 6, 7, 8};
    // int[] workingArrayUnsorted = {9, 8, 7, 4, 5, 6, 7, 10};
    // selectionSort(workingArrayUnsorted);  

    // int[] negativeArray = {-2, 2};

    // int[] emptyArray = {};

    System.out.println(Arrays.toString(workingArray));
    System.out.println(binarySearch(workingArray, 50));


    // printTriangle Test Cases:
    // printTriangle(4);
    // printTriangle(5);
    // printTriangle(0); // Throws an exception.
    // printTriangle(-1); // Throws an exception.
    // printTriangle(50);

    System.out.println((char)27 + "\n\n[31m" + "---======]" + (char)27 + "[36m" + "      End Class      " + (char)27 + "[31m" + "[======---");
  }

  /**
   * This method will sort an array of integer values using the bubble sort algorithm.
   * @param arr
   * @return void
   */
  public static void bubbleSort(int[] arr) {
    int n = arr.length; // This stores the length of arr.
    for (int i = 0; i < n; i = i + 1) { // Loop through each element of arr.
      for (int j = 0; j < n - 1; j = j + 1) { // N - j - i possible optimization.
        if (arr[j] > arr[j + 1]) { // Swap the elements.
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  /**
   * This method will sort an array of integer values using the bubble sort algorithm.
   * And it will return a copy of the array instead of using the original one.
   * @param arr
   * @return int[]
   */
  public static int[] bubbleSortCopy(int[] arr) {
    int[] arrCopy = Arrays.copyOf(arr, arr.length); // Create a copy of arr.
    int n = arrCopy.length; // This stores the length of arr.
    for (int i = 0; i < n; i = i + 1) { // Loop through each element of arr.
      for (int j = 0; j < n - 1; j = j + 1) { // N - j - i possible optimization.
        if (arrCopy[j] > arrCopy[j + 1]) { // Swap the elements.
          int temp = arrCopy[j];
          arrCopy[j] = arrCopy[j + 1];
          arrCopy[j + 1] = temp;
        }
      }
    }
    return arrCopy;
  }

  /**
   * This method will print a triangle in process console.
   * @param height
   * @return void
   * @throws IllegalArgumentException
   */
  public static void printTriangle(int height) { 
    if (height <= 0) { // Throw an exception if invalid parameter.
      throw new IllegalArgumentException("Height cannot be below or equal to 0.");
    }

    for (int i = 0; i < height; i++) { // For each line, top down
      int sideSpace = (height - (i + 1)) * 2; // Variables for left / right free space
  
      int ink = (2 * i) + 1; // Variable for ink;

      for (int j = 0; j < (sideSpace / 2); j++) {
        System.out.print(" ");
      } // Prints left free space

      for (int j = 0; j < (ink); j++) {
        System.out.print("*");
      } // Prints ink

      for (int j = 0; j < (sideSpace / 2); j++) {
        System.out.print(" ");
      } // Prints right free space

      System.out.println(); // Prints new line
    }
  } // End of printTriangle

  /**
   * This method will reverse the input string.
   * @param str
   * @return String
   */
  public static String reverseString(String str) {
    String newString = ""; // Stores the reversed string.

    for (int i = str.length() - 1; i >= 0; i--) { // Loop through each element of str backwards.
      newString = newString + str.charAt(i); // Add the element to the new string.
    }

    return newString;
  }

  /**
   * This method will create an array of random integers.
   * @param size
   * @return int[]
   * @throws IllegalArgumentException
   */
  public static int[] createRandomArray(int size) {
    if (size <= 0) { // Throw an exception if invalid parameter.
      throw new IllegalArgumentException("Size cannot be below or equal to 0.");
    }

    int[] arr = new int[size]; // Create an array of size.

    for (int i = 0; i < size; i++) { // Loop through each element of arr.
      arr[i] = (int)(Math.random() * 100); // Assign a random integer to each element.
    }

    return arr; // Return the array.
  }

  /** 
   * Calculate the average of an arary of integers.
   * @param arr
   * @return double
   * @throws IllegalArgumentException
   */
  public static double calculateAverage(int[] arr) {
    if (arr.length <= 0) { // Throw an exception if invalid parameter.
      throw new IllegalArgumentException("Array cannot be empty.");
    }

    int sum = 0; // Stores the sum of all elements.

    for (int i = 0; i < arr.length; i++) { // Loop through each element of arr.
      sum = sum + arr[i]; // Add the element to the sum.
    }

    return sum / (arr.length * 1.0); // Return the average and convert to double.
  }

  /**
   * This method will perform a linear search
   * @param arr
   * @return int
   */
  public static int linearSearch(int[] arr, int key) {
    int n = arr.length; // This stores the length of arr.

    for (int i = 0; i < n; i++) { // Loop through each element of arr.
      if (arr[i] == key) { // If the element is the key,
        return i; // Return the index.
      }
    }

    return 0; // Return 0 if not found.
  }

  /** 
   * This method will perform a binary search
   * @param arr
   * @param key
   * @return int
   */
  public static int binarySearch(int[] arr, int key) {
    int n = arr.length;
    
    // The array must be sorted.
    insertionSort(arr);
    // selectionSort(arr);
    // bubbleSort(arr);

    // Low and high values.
    int low = 0; 
    int high = n - 1;

    while (low <= high) { // while search active
      int mid = (low + high) / 2; // get mid

      if (arr[mid] == key) {
        return mid; // Return the index.
      } 

      else if (arr[mid] < key) { // If the element at the mid index is less than the key,
        low = mid + 1; // Set the low index to the mid index + 1.
      }

      else { // If the element at the mid index is greater than the key,
        high = mid - 1; // Set the high index to the mid index - 1.
      }
    }

    return -1; // Return -1 if not found.
  }

  /**
   * This method will perform an insertion sort
   * @param arr
   * @return void
   */

  public static void insertionSort(int[] arr) {
    int n = arr.length; 

    for (int i = 1; i < n; i++) { // Loop through each element of arr.
      int key = arr[i]; // Store the element in key.

      int j = i - 1; // Set the j index to i - 1.
      // After el is sorted, dont need to sort it again.

      while (j >= 0 && arr[j] > key) { // Cursor bigger than key.
        arr[j + 1] = arr[j]; // Shift right & lower cursor
        j = j - 1; 
      }

      arr[j + 1] = key; // Insert the key at the correct index.
    }
  }

  /**
   * This method will perform a selection sort
   * @param arr
   * @return void
   */

  public static void selectionSort(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) { 
      int min = i; // minimum to i

      for (int j = i + 1; j < n; j++) { // Loop through each element of arr.
        if (arr[j] < arr[min]) { // If the element at j is less than the min,
          min = j; // Set the min index to j.
        }
      }

      int temp = arr[i]; // Store the element at i in temp.
      arr[i] = arr[min]; // Set the element at i to the element at min.
      arr[min] = temp; // Set the element at min to temp.
    }
  }

}

/**
 * 
 */
