// add package name here if needed
//
class App {

  // DO NOT do this.
  // This method will cause a StackOverflowError due to infinite recursion.
  // It calls itself until the stack is exhausted.
  public static void println(String message) {
    System.out.println(message);
    println("This is a custom println method.");
  }

  public static void main(String[] args) {

    System.out.println("Hi");

    System.out.println("Hello");

    System.out.println("How are you?");

    System.out.println("I am fine, thank you! How about you?");

    int a = 5;
    int b = 0;

    try {
      // risky stuff here
      // this will cause an ArithmeticException: / by zero
      // System.out.println("I am doing well too! Here is the result of a / b: " + (a / b));
      //
      // this will cause a NullPointerException because str is null and we are trying to call length() on it.
      String str = null;
      System.out.println("The length of the string is: " + str.length());
    
      // this will cause a StackOverflowError due to infinite recursion
      // see println method above. It keeps calling itself without a base case (exit).
      println("HERE IS A CUSTOM PRINTLN METHOD!");
    // } catch (RuntimeException e) { // DO NOT catch parents first.
                                      // or Exception hierarchy will cause the child exceptions to be unreachable. 
      // handle the exception here
      // System.out.println("Oops! An error occurred: " + e.getMessage());
    } catch (ArithmeticException e) {
      // handle the exception here
      System.out.println("ArithmeticException caught: " + e.getMessage());
    // } catch (StackOverflowError e) { // DO NOT catch Error. Very rarely you want to do this.
                                     // errors are usually unrecoverable 
      // handle the exception here
      // System.out.println("Oops! An error occurred: " + e.getMessage());

    } catch (NullPointerException e) {
      // handle the exception here
      System.out.println("NullPointerException caught: " + e.getMessage());
    } catch (Exception e) { // catch the parent Exception class last
      // handle the exception here
      System.out.println("Exception caught: " + e.getMessage());
    }

    System.out.println("I am good too!");

    System.out.println("That's great to hear! See you later!");

    System.out.println("See you later!");

  }
}

