// add package name here if needed
//
class App {

  public static void main(String[] args) {

    int[] numbers; // declare an array of integers
    numbers = new int[5]; // create an array of 5 integers

    // so far, this is just a container for 5 numbers, but we haven't assigned any values to them yet
    //         |10|20|__|__|__|
    // index    0  1  2  3  4
    numbers[5] = 10; // assign value 10 to the first element
    numbers[1] = 20; // assign value 20 to the second element

    System.out.println("The first number is: " + numbers[0]); // prints 10
    System.out.println("The second number is: " + numbers[1]); // prints 20
    
  }
}

