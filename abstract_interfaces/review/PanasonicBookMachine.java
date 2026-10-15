class PanasonicBookMachine implements BookMakerMachine {
  @Override
  public void makeBook(Book book) {
    System.out.println("Making a Panasonic book: " + book.getTitle());
  }

  @Override
  public void sayHi() {
    System.out.println("Hi from the PanasonicBookMachine class!");
  }
}
