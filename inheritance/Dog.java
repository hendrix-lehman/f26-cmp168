class Dog extends Animal {

  public Dog(String name, int age) {
    super(name, age);
  }

  @Override
  public String toString(int a) {
    String dogInfo = String.format("Dog Name: %s, Age: %d", getName(), getAge());
    return dogInfo;
  }

}
