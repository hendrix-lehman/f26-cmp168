class Dog extends Animal implements Playful {

  // default constructor
  public Dog() {
    this("Unnamed Dog");
  }

  // overloaded constructor
  public Dog(String name) {
    super(name);
    System.out.println("Dog constructor called");
  }

  // implementation of abstract method in the abstract class Animal
  @Override
  public void makeNoise() {
    System.out.println("Woof!");
  }

  // implementation of interface
  @Override
  public void play() {
    System.out.println(getName() + " is playing fetch!");
  }
}
