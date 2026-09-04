// add package name here if needed
//
class App {

  public static void main(String[] args) {

    if ( true /* condition */) {
      // code to execute if condition is true
    } /* else if optional */ else if ( false /* another condition */) {
      // code to execute if another condition is true
    } /* else is optional */ else {
      // code to execute if condition is false
    }

    // switch statement example
    int day = 3;
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Invalid day");
    }
    
  }
}

