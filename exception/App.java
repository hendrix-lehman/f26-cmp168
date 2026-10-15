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

  public static void riskyDivision(int a, int b) throws MathException, ArithmeticException {
    // NOTE: not a recommended way to throw an exception. This is just for demonstration purposes.

    if(b == 0) { // this data validation. 
      throw new MathException("X.Division by zero is not allowed.");
    }

    System.out.println("I am doing well too! Here is the result of a / b: " + (a / b));
  }

  public static void main(String[] args) {

    System.out.println("Hi");

    System.out.println("Hello");

    System.out.println("How are you?");

    System.out.println("I am fine, thank you! How about you?");

    // we can't call riskyDivision here
    // because it throws a checked exception (MathException) that we are not handling here.
    // riskyDivision(5, 1);

    int a = 5;
    int b = 0;

    try {
      // risky stuff here
      // this will cause an ArithmeticException: / by zero
      // System.out.println("I am doing well too! Here is the result of a / b: " + (a / b));
      riskyDivision(a, b);
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
      System.out.println("This line may not be reached if a child exception is thrown before it.");
    } catch (ArithmeticException e) {
      // handle the exception here
      System.out.println("ArithmeticException caught: " + e.getMessage());
    // } catch (StackOverflowError e) { // DO NOT catch Error. Very rarely you want to do this.
                                     // errors are usually unrecoverable 
      // handle the exception here
      // System.out.println("Oops! An error occurred: " + e.getMessage());
    } catch (MathException e) {
      // handle the exception here
      System.out.println("MathException caught: " + e.getMessage());
      e.printStackTrace(); // print the stack trace for debugging purposes
    } catch (NullPointerException e) {
      // handle the exception here
      System.out.println("NullPointerException caught: " + e.getMessage());
    } catch (Exception e) { // catch the parent Exception class last
      // handle the exception here
      System.out.println("Exception caught: " + e.getMessage());
    } finally {
      // this block will always execute, regardless of whether an exception was thrown or not
      System.out.println("This is the finally block. It always executes.");
      System.out.println("Done with risky stuff!");
    }

    System.out.println("I am good too!");

    System.out.println("That's great to hear! See you later!");

    System.out.println("See you later!");

    System.out.println("Bye!");

  }
}

