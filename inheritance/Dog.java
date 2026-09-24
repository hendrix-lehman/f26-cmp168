class Dog extends Animal {

  public Dog(String name, int age) {
    super(name, age);
  }

  @Override
  public String getName() {
    System.out.println("Getting dog name: " + super.getName());
    return super.getName();
  }

  @Override
  public String toString() {
    String dogInfo = String.format("Dog Name: %s, Age: %d", getName(), getAge());
    return dogInfo;
  }

}
