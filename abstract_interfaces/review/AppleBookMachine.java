class AppleBookMachine implements BookMakerMachine {
  @Override
  public void makeBook(Book book) {
    System.out.println("Making an Apple book: " + book.getTitle());
  }

  @Override
  public void sayHi() {
    System.out.println("Hi from the AppleBookMachine class!");
  }
}
