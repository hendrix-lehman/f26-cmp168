class UberDog extends Dog {
  
  public UberDog(String name, int age) {
    super(name, age);
  }

  @Override
  public String toString(int a) {
    String uberDogInfo = String.format("UberDog Name: %s, Age: %d", getName(), getAge());
    return uberDogInfo;
  }
}
