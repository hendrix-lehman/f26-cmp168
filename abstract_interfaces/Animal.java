abstract class Animal {

  // instance variable
  private final String name;

  // constructor
  public Animal(String name) {
    System.out.println("Animal constructor called");
    this.name = name;
  }

  // getter method
  public String getName() {
    return name;
  }

  // abstract method
  public abstract void makeNoise();
}
