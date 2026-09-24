class Cat extends Animal {

  public Cat(String name, int age) {
    super(name, age);
  }

  @Override
  public String getName() {
    System.out.println("Getting cat name: " + super.getName());
    return super.getName();
  }

  @Override
  public String toString() {
    String catInfo = String.format("Cat Name: %s, Age: %d", getName(), getAge());
    return catInfo;
  }
}
