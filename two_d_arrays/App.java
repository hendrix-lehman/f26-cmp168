// add package name here if needed
//
class App {

  public static void displayArray(String[][] arr) {
    // looping 1D array is simply going over each element using its index
    for(int row = 0; row < arr.length; row++) {

      // each row is a 1D array, so we can loop over it using its length
      System.out.print("row: " + row + " -> ");

      // loop over each column in the current row
      for(int col = 0; col < arr[row].length; col++) {
        System.out.print(arr[row][col] + " ");
      }
      // since we use print() to print each element, we need to print a new line after each row
      // separate the rows visually in the output
      System.out.println(); // print a new line after each row
    }
  }

  public static void displayArray(int[][] arr) {
    // looping 1D array is simply going over each element using its index
    for(int row = 0; row < arr.length; row++) {

      // each row is a 1D array, so we can loop over it using its length
      System.out.print("row: " + row + " -> ");

      // loop over each column in the current row
      for(int col = 0; col < arr[row].length; col++) {
        System.out.print(arr[row][col] + " ");
      }
      // since we use print() to print each element, we need to print a new line after each row
      // separate the rows visually in the output
      System.out.println(); // print a new line after each row
    }
  }

  public static String[][] getPopulatedArray(int row, int col) {
    String[][] arr = new String[row][col];

    for(int r = 0; r < row; r++) {
      for(int c = 0; c < col; c++) {
        arr[r][c] = "[" + r + "][" + c + "]";
      }
    }

    return arr;
  }

  public static int[][] getPopulatedIntArray(int row, int col) {
    int[][] arr = new int[row][col];

    for(int r = 0; r < row; r++) {
      for(int c = 0; c < col; c++) {
        arr[r][c] = r + c;
      }
    }

    return arr;
  }
  
  private static int[] findTargetLocation(int[][] arr, int target) {

    for(int row = 0; row < arr.length; row++) {
      for(int col = 0; col < arr[row].length; col++) {
        if(arr[row][col] == target) {
          return new int[]{row, col};
        }
      }
    }
    return new int[]{-1, -1}; // return -1, -1 if target not found
  }

  public static void main(String[] args) {

    // declaring a 2D array of integers with 3 rows and 5 columns
    // int[][] scores = new int[3][5];
    // int[][] scores;
    // scores = new int[3][5];
    // int[][] scores = {
      // {0, 0, 0, 0, 0},
      // {0, 0, 7, 0, 0},
      // {0, 0, 0, 0, 0}
    // };
    int[] row1 = {0, 0, 0, 0, 0};
    int[] row2 = {0, 0, 7, 0, 0};
    int[] row3 = {0, 0, 0, 0, 0};

    int[][] scores = {row1, row2, row3};

    // first index is [0] [0] and last index is [2] [4] 
    //
    // assigning values to the 2D array
    scores[0][0] = 10;
    scores[2][4] = 20;

    System.out.println("The value at scores[0][0] (first index) is: " + scores[0][0]);
    System.out.println("The value at scores[2][4] (last index) is: " + scores[2][4]);

    System.out.println("The value at scores[1][2] is: " + scores[1][2]);

    String[][] names = {
      {"John", "Doe"},
      {"Jane", "Smith"},
      {"Alice", "Johnson"}
    };
    displayArray(names);

    displayArray(scores);
    
    String[][] arr = getPopulatedArray(3, 5);
    displayArray(arr);

    int[][] intArr = getPopulatedIntArray(3, 5);
    displayArray(intArr);

    int[] location = findTargetLocation(scores, 22);

    System.out.println("the location for 7 in the 2D scores - row: " + location[0] + ", col: " + location[1]);
  }
}

