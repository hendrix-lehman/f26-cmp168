// add package name here if needed
//
class Car {
  // member variables
  private String make; // identifier, member variable, instance variable
  private String model;
  private int year;

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
  
  // setters
  public void setMake(String make) {
    this.make = make;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setYear(int year) {
    this.year = year;
  }

  // behaviors (things the car can do)
  public void turbo() {
    System.out.println("Vroom! The " + make + " " + model + " is going turbo!");
  }

  // operations
  public void honk() {
    System.out.println("Beep beep! The " + make + " " + model + " is honking!");
  }

}

