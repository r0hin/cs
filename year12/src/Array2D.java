import java.util.Scanner;

public class Array2D {
  
  public static void main(String[] args) throws Exception {
    double[][] arr = new double[10][10]; // 10x10 array
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = (Math.random() * 100);
      }
    }
    // arr[first dimension][second dimension]
    // arr[0][0] is row 0, column 0

    System.out.println(arr[0][0]);

    // print the array
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

    // Ask for row 
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter row to get average: ");

    int row = sc.nextInt();

    // get average of row
    double sum = 0;
    for (int i = 0; i < arr[row].length; i++) {
      sum += arr[row][i];
    }
    double avg = sum / arr[row].length;
    System.out.println("Average of row " + row + " is " + avg);

    // get average of column
    System.out.print("Enter column to get average: ");
    int col = sc.nextInt();
    sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i][col];
    }
    avg = sum / arr.length;
    System.out.println("Average of column " + col + " is " + avg);

    sc.close(); // stop memory leak
  }

}
