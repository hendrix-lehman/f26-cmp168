// add package name here if needed
//
class App {

  public static void printItem(int index, int[] arr) {
    if(index < 0 || index >= arr.length) { // if index is less than zero OR index is greater than or equal to the length
      System.out.println("Index out of bounds");
    } else {
      System.out.println("Element at index " + index + ": " + arr[index]);
    }
  }

  public static void main(String[] args) {
   // array index is based 0. In other words, index start at zero 
    int[] arr = {1, 2, 3, 4, 5}; // 0 -> 1, 1 -> 2, 2 -> 3, 3 -> 4, 4 -> 5
    int index = 2;

    printItem(index, arr); // should print "Element at index 2: 3"

  }
}

