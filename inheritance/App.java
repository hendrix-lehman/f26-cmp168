class App {

  public static void printAnimalInfo(Animal animal) {
    String animalInfo = String.format("Animal Name: %s, Age: %d", animal.getName(), animal.getAge());
    System.out.println(animalInfo);
  }

  public static void main(String[] args) {
    // Animal animal = new Animal(5, "Buddy");
    Dog dog = new Dog("Buddy", 5);
    // dog.toString();
    // System.out.println(dog);
    Cat cat = new Cat("Whiskers", 3);

    printAnimalInfo(dog);
    printAnimalInfo(cat);

    Animal.AnimalToy dogToy = dog.new AnimalToy("Bone");
    System.out.println("Dog's toy: " + dogToy.getToyName());
  }
}
