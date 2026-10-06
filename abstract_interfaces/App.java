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

    // NOT ALLOWED to create an instance of an abstract class
    // Animal animal2 = new Animal();
    //

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
    //
    Fish fish = new Fish("Nemo");
    // fish.makeNoise();
    fish.swim();
    fish.play();

    Animal[] animals = {dog, fish};
    for (Animal a : animals) {
      testAnimal(a);
      if (a instanceof Playful playful) {
        testAnimal(playful);
      }
      if (a instanceof Swimmable swimmable) {
        testAnimal(swimmable);
      }
    }

    // cannot instantiate an interface
    // Swimmable swimmable = new Swimmable();

  }

  // using polymorphism to call the makeNoise method on any Animal object
  public static void testAnimal(Animal animal) {
    animal.makeNoise();
  }

  public static void testAnimal(Playful playful) {
    playful.play();
  }

  public static void testAnimal(Swimmable swimmable) {
    swimmable.swim();
  }
}
