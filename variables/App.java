// add package name here if needed
//
class App {

  public static void main(String[] args) {
    int max = Integer.MAX_VALUE;
    System.out.println("Max value of int: " + max);
    int tooBig = max + 325;
    System.out.println("Max value of int + 1: " + tooBig);
    
    int result = (int) 25.1 / 2;
    System.out.println("Result of 25.1 / 2: " + result);

    long bigNum = 10000000000L;
    long result2 = bigNum + tooBig;
    System.out.println("Result of bigNum + tooBig: " + result2);

    String letterGradeA = "A";
    char letterGradeAChar = 'A';
    String letterGradeB = "B";
    String letterGradeC = "C";
  }
}

