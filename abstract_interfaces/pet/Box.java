class Box<T> {

  private T content;

  public T getContent() {
    return content;
  }

  public void setContent(T content) {
    this.content = content;
  }


  public static void main(String[] args) {

    Box<Food> foodBox = new Box<>();
    foodBox.setContent(new Food("Purina", 20, 5));
    // foodBox.setContent(new Dog("Buddy", 30.0, 20.0, true, 5)); // This line will cause a compile-time error
    System.out.println("Food Box Content: " + foodBox.getContent().getName());

    Box<Dog> dogBox = new Box<>();
    dogBox.setContent(new Dog("Buddy", 30.0, 20.0, true, 5));
    System.out.println("Dog Box Content: " + dogBox.getContent().getName());

    Box<Food> anotherFoodBox = new Box<>();
    anotherFoodBox.setContent(new Food("Pedigree", 25, 6));
    System.out.println("Another Food Box Content: " + anotherFoodBox.getContent().getName());
  }
}
