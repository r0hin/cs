public class ArrayProblem {
  public static void main(String[] args) {

    // Create array of integers called nums
    // int[] nums = {1, 2, 1, 1, 3};
    int[] nums = {1, 1, 1};

    int maxSpan = 0;
    
    for (int i = 0; i < nums.length; i++) {
      
      // Get leftmost appearance
      int leftMostIndex = 0;
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          leftMostIndex = j;
          break;
        }
      }

      // Get rightmost appearance
      int rightMostIndex = leftMostIndex;
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          if (j > rightMostIndex) {
            rightMostIndex = j;
          }
        }
      }

      System.out.println(rightMostIndex);
      
      int span = rightMostIndex - leftMostIndex;

      if (span > maxSpan) {
        maxSpan = span;
      }
    }
    
    System.out.println(maxSpan);
  }

}
