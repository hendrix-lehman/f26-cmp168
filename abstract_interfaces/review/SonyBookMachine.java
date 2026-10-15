class SonyBookMachine implements BookMakerMachine {
  @Override
  public void makeBook(Book book) {
    System.out.println("Making a Sony book: " + book.getTitle());
  }

  @Override
  public void sayHi() {
    System.out.println("Hi from the SonyBookMachine class!");
  }
}
