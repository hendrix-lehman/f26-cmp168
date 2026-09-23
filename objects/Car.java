class Car {
  // member variables
  private String make; // identifier, member variable, instance variable
  private String model;
  private int year;
  private final String secretEngineSound = "Vroom Vroom!"; // private member variable

  private Passenger[] passengers; // array of Passenger objects

  public static final int MAX_PASSENGERS = 4; // constant

  // constructor
  // overloading constructors
  public Car() {
    this("Unknown", "Unknown", 0);
    // this.make = "Unknown";
    // this.model = "Unknown";
    // this.year = 0;
  }

  public Car(String make) {
    this(make, "Unknown", 0);
    // this.make = make;
    // this.model = "Unknown";
    // this.year = 0;
  }

  public Car(String make, String model) {
    this(make, model, 0);
    // this.make = make;
    // this.model = model;
    // this.year = 0;
  }

  public Car(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.passengers = new Passenger[MAX_PASSENGERS]; // default to 4 passengers
  }

  // methods
  //
  // getters
  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public int getYear() {
    return year;
  }

  // public Passenger[] getPassengers() {
    // return passengers;
  // }
  
  // setters
  // public void setMake(String make) {
  //   this.make = make;
  // }

  // public void setModel(String model) {
  //   this.model = model;
  // }

  // public void setYear(int year) {
  //   this.year = year;
  // }

  // public void setPassengers(Passenger[] passengers) {
  //   if (passengers.length > MAX_PASSENGERS) {
  //     System.out.println("Cannot set passengers. Exceeds maximum capacity of " + MAX_PASSENGERS);
  //     return;
  //   }
  //   this.passengers = passengers;
  // }
  public void addPassenger(Passenger passenger) {
    for (int i = 0; i < passengers.length; i++) {
      if (passengers[i] == null) {
        passengers[i] = passenger;
        return;
      }
    }
    System.err.println("Cannot add passenger. Car is full.");
  }

  public void removePassenger(Passenger passenger) {
    for (int i = 0; i < passengers.length; i++) {
      if (passengers[i] == passenger) {
        passengers[i] = null;
        Passenger.decrementPassengerCount();
        return;
      }
    }
    System.err.println("Cannot remove passenger. Passenger not found.");
  }

  public int getPassengerCount() {
    int count = 0;
    for (Passenger p : passengers) {
      if (p != null) {
        count++;
      }
    }
    return count;
    // return Passenger.getPassengerCount();
  }

  // behaviors (things the car can do)
  public void turbo() {
    System.out.println(secretEngineSound + " The " + make + " " + model + " is going turbo!");
  }

  // operations
  public void honk() {
    System.out.println("Beep beep! The " + make + " " + model + " is honking!");
  }

}

