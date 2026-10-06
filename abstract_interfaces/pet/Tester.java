class Tester {

  public static void main(String[] args) {

    Dog dog1 = new Dog("Buddy", 30.0, 20.0, true, 5); // dogNumber is automatically assigned, equal to 0
    Dog dog2 = new Dog("Max", 25.0, 18.0, false, 3); // dogNumber is automatically assigned, equal to 1
    Dog dog3 = new Dog("Bella", 28.0, 19.0, true, 4); // dogNumber is automatically assigned, equal to 2
    Dog dog4 = new Dog("Charlie", 32.0, 21.0, false, 6); // dogNumber is automatically assigned, equal to 3
    Dog dog5 = new Dog("Lucy", 27.0, 18.5, true, 2); // dogNumber is automatically assigned, equal to 4

    // Pet is an abstract class
    // Cannot instantiate the type Pet
    // Pet pet = new Pet();
    //
    int numDogs;

    Dog[] dogs = {dog4, dog1, dog2, dog5, dog3};
    for (Dog dog : dogs) {
      System.out.println(dog.toString());
      dog.play();
      if (dog.getIsVaccinated()) {
        Food food = new Food(dog.getFavoriteFood(), 40, 10);
        dog.eat(food);
        double mf = dog.metabolizeFood(food);
        System.out.println("Metabolized Food: " + mf);
      } else {
        dog.eat();
      }
      dog.speak();
      dog.speak("I love playing fetch!");
      System.out.println();
    }

    // compare 2 dogs
    System.out.println("Comparing dogs:");
    System.out.println(dog1.getName() + " vs " + dog2.getName() + ": " + dog1.compareTo(dog2));

    // sort dogs by dogNumber
    java.util.Arrays.sort(dogs);

    System.out.println("\nSorted dogs by dogNumber:");
    for (Dog dog : dogs) {
      System.out.println(dog.toString());
    }
    
  }
}
