class ChemistryBook extends Book {

  public ChemistryBook(String title, String author, String publisher, int numberOfPages) {
    super(title, author, publisher, numberOfPages);
  }

  @Override
  public void displayHighlightedText() {
    System.out.println("Chemistry highlighted text from " + getTitle() + ": " + highlightedText);
  }

}
