// add package name here if needed
//
class App {

  public static void main(String[] args) {
    // loops
    //
    // for loop
    // for (/* initialize variable */ ; /* conditional (true/false) */ i < 5; /* increment/decrement */ i++) {
    for (int i = 0; i < 5; i++) {
      System.out.println("For loop iteration: " + i);
    }
    
    for(;;) {
      System.out.println("This is an infinite loop");
      break; // break statement to exit the loop
    }

    // while loop
    //
    // while (/* conditional (true/false) */ i < 5) {
    int j = 0;
    while (j < 5) {
      System.out.println("While loop iteration: " + j);
      j++;
    }

    while (true) {
      System.out.println("This is an infinite while loop");
      break; // break statement to exit the loop
    }

    // do-while loop
    //
    int k = 0;
    do {
      if (k == 2) {
        System.out.println("Skipping iteration: " + k);
        k++;
        continue; // continue statement to skip the rest of the loop and go to the next iteration
      }
      System.out.println("Do-while loop iteration: " + k);
      k++;
    } while (k < 5); // conditional (true/false)
    
  }
}

