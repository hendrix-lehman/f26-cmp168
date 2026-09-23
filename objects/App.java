class App {

  public static void main(String[] args) {
    Car myCar = new Car("Toyota", "Camry", 2020);
    Car anotherCar = new Car("Honda", "Civic", 2019);
    Car defaultCar = new Car();

    System.out.println("Make: " + myCar.getMake());
    myCar.turbo();

    System.out.println("Make: " + defaultCar.getMake());

    Passenger passenger1 = new Passenger("Alice", 1990, 12.0, 'f', -20);
    passenger1.printDetails();
    passenger1.loseWeight(5.0);
    passenger1.printDetails();
    passenger1.loseWeight(10.0); // This should trigger a warning about negative weight
    // passenger1.printDetails();
    System.out.println(passenger1.toString());

    int count = Passenger.getPassengerCount();
    System.out.println("Passenger count: " + count);

    // passenger1 = null; // Dereference passenger1

    // compiler error: passengerCount has private access in Passenger
    // variable passenger1 is an instance of the type Passenger
    // the variable references the object of the class Passenger
    // Passenger.passengerCount = 1;

    // create 20 passengers
    // Passenger[] passengers = new Passenger[2000];
    // for (int i = 0; i < 2000; i++) {
      // Passenger p = new Passenger("Passenger " + (i + 1), 1990 + i, 10.0 + i, 'm', i);
      // passengers[i] = p;
      // p.printDetails();
    // }

    // set passengers to myCar
    // myCar.setPassengers(passengers);
    //
    Passenger passenger2 = new Passenger("Bob", 1985, 15.0, 'm', 1);
    Passenger passenger3 = new Passenger("Charlie", 1995, 20.0, 'm', 2);
    Passenger passenger4 = new Passenger("Diana", 1992, 18.0, 'f', 1);

    myCar.addPassenger(passenger1);
    myCar.addPassenger(passenger2);
    // myCar.addPassenger(passenger3);
    // myCar.addPassenger(passenger4); // This should trigger a warning about the car being full
    System.out.println("How many passengers in the car: " + myCar.getPassengerCount());

    Passenger passenger5 = new Passenger("Eve", 1998, 14.0, 'f', 1);
    // myCar.addPassenger(passenger5); // This should trigger a warning about the car being full
    System.out.println("How many passengers in the car: " + myCar.getPassengerCount());

    count = Passenger.getPassengerCount();
    System.out.println("How many Passenger object instances: " + count);
    
  }
}
