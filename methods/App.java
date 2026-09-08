class App {

  public void methodOne() {
    System.out.println("This is method one.");
    methodTwo(); // calling methodTwo() from within methodOne()
  }

  public void methodTwo() {
    System.out.println("This is method two.");
  }

  public void sayHello() {
    System.out.println("Hello, world!");
    System.out.println("This is a simple Java program.");
  }

  public int add(int a, int b) {
    a = 0; // reassigning the value of a to 0
    System.out.println("Inside add method. The value of a is: " + a); // printing the value of a after reassignment
    int sum = a + b; // calculates the sum of a and b
    return sum; // returns the sum of a and b
  }

  public int generateARandomNumber() {
    return (int) (Math.random() * 100); // generates a random number between 0 and 99
  }
  
  public void sayMyName(Person person) {
    System.out.println("Inside sayMyName method. My name is: " + person.getName()); // prints the name of the person
    person.setName("Bob"); // changes the name of the person to "Bob"
  }

  public static void main(String[] args) {
    App app = new App(); // object creation; instance of the class App
    app.sayHello(); // invoking the method sayHello() on the object app
    app.sayHello(); // invoking the method sayHello() again on the object app

    int a = 5; // declaring and initializing variable a with value 5
    int b = 10; // declaring and initializing variable b with value 10
    int sum = app.add(a, b); // invoking the method add() on the object app with arguments 5 and 10
    System.out.println("Outside add method. The value of a is: " + a); // printing the value of a
    System.out.println("The sum of 5 and 10 is: " + sum); // printing the result of the addition
    //
    int randomNumber = app.generateARandomNumber(); // invoking the method generateARandomNumber() on the object app
    System.out.println("A random number between 0 and 99 is: " + randomNumber); // printing the generated random number

    Person person = new Person("Alice", 30); // creating a new Person object
    app.sayMyName(person); // invoking the method sayMyName() on the object app with the person object as an argument
    System.out.println("Outside sayMyName method. The name of the person is: " + person.getName()); // printing the name of the person
    //
    app.methodOne(); // invoking the method methodOne() on the object app
  }
}

