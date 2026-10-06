class Fish extends Animal implements Swimmable, Playful {

  // default constructor
  public Fish() {
    this("Unnamed Fish");
  }

  // overloaded constructor
  public Fish(String name) {
    super(name);
    System.out.println("Fish constructor called");
  }

  @Override
  public void makeNoise() {
    System.out.println("Blub!");
  }

  @Override
  public void swim() {
    System.out.println(getName() + " is swimming!");
  }

  @Override
  public void play() {
    System.out.println(getName() + " is playing with bubbles!");
  }
}
