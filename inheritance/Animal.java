class Animal {

  private String name;
  private int age;

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

//   public String toString(int abc) {
//     return "Hello";
//   }

  @Override
  public String toString() {
    String animalInfo = String.format("Animal Name: %s, Age: %d", name, age);
    return animalInfo;
  }

  class AnimalToy {
    private String toyName;

    public AnimalToy(String toyName) {
      this.toyName = toyName;
    }

    public String getToyName() {
      return toyName;
    }
  }

}
