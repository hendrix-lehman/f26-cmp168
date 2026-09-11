// add package name here if needed
//
class App {

  public static void resizeArray(int[] arr, int newSize) {
    if (newSize < arr.length) {
      System.out.println("New size must be greater than or equal to the current size.");
      return;
    }
    // create a new array with the new size
    int[] newArr = new int[newSize];
    // copy the elements from the old array to the new array
    for (int i = 0; i < arr.length && i < newSize; i++) {
      newArr[i] = arr[i];
    }
    // assign the new array to the old array reference
    arr = newArr;
  }

  public static int[] copyArray(int[] arr) {
    // int[] newArr = arr; // DO NOT DO THIS! This does not create a new array, it just creates a new reference to the same array
    int[] newArr = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      newArr[i] = arr[i];
    }
    return newArr;
  }

  public static void swap(int[] arr, int fromIndex, int toIndex) {
    int temp = arr[fromIndex];
    arr[fromIndex] = arr[toIndex];
    arr[toIndex] = temp;
  }

  public static void main(String[] args) {

    int[] numbers; // declare an array of integers
    numbers = new int[5]; // initialize or create an array of 5 integers

    // so far, this is just a container for 5 numbers, but we haven't assigned any values to them yet
    //         |10|20|30|40|50|
    // index    0  1  2  3  4
    //
    // "filling" the array with values
    numbers[0] = 10; // assign value 10 to the first element
    numbers[1] = 20; // assign value 20 to the second element
    numbers[2] = 30; // assign value 30 to the third element
    numbers[3] = 40; // assign value 40 to the fourth element
    numbers[4] = 50; // assign value 50 to the fifth element

    System.out.println("The first number is: " + numbers[0]); // prints 10
    System.out.println("The second number is: " + numbers[1]); // prints 20

    // int temp = numbers[0]; // store the first number in a temporary variable
    // numbers[0] = numbers[1]; // assign the second number to the first number
    // numbers[1] = temp; // assign the temporary variable to the second number
    int[] copiedNumbers = copyArray(numbers); // create a copy of the numbers array
    swap(numbers, 0, 1); // swap the first and second numbers
 
    System.out.println("The first number is: " + numbers[0]); 
    System.out.println("The second number is: " + numbers[1]);
   
    int[] moreNumbers = {60, 70, 80, 90, 100}; // declare, initialize and "fill" the array
    //
    for (int i = 0; i < moreNumbers.length; i++) {
      System.out.println("The number at index " + i + " is: " + moreNumbers[i]);
    }
  }
}

