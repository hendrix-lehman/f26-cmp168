class App {

  public static void main(String[] args) {
    Car myCar = new Car("Toyota", "Camry", 2020);
    Car anotherCar = new Car("Honda", "Civic", 2019);
    Car defaultCar = new Car();

    System.out.println("Make: " + myCar.getMake());
    myCar.turbo();

    System.out.println("Make: " + defaultCar.getMake());
  }
}
