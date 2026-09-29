class App {
  public static void main(String[] args) {
    // Abstract class
    //
    // Relationship: Child or Subclass have a "is-a" relationship. For example, a Dog is an Animal.
    // Inheritance: A class can only extend one class
    // State / Variables: Can have instance fields, methods, constructors, and static methods
    // Constructors: Abstract classes can have constructors, but cannot be instantiated directly

    // Interface
    //
    // Relationship: Classes the implement interface have a "can-do" relationship. For example, a Dog can bark.
    // Inheritance: A class can implement multiple interfaces
    // State / Variables: Can only have static final variables (constants) and abstract methods (by default)
    // Constructors: Interfaces cannot have constructors, and cannot be instantiated directly

    // the animal variable is of type Animal
    // the object assigned is of type Dog
    // this is possible because a Dog is-a Animal
    // this is an example of polymorphism
    // late binding: the method to be called is determined at runtime based on the actual object type
    Animal animal = new Dog();
    animal.makeNoise();

    // see 3 casting examples below
    //
    // RECOMMENDED: safe casting
    if(animal instanceof Dog dog) {
      dog.play();
    }

    // casting to a variable dog
    Dog dog = (Dog) animal;
    dog.play();

    // old style casting
    ((Dog) animal).play();

    // cannot instantiate an interface
    // Playful playful = new Playful();
  }
}
