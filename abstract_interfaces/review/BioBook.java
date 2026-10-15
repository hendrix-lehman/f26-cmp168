class BioBook extends Book {

  public BioBook(String title, String author, String publisher, int numberOfPages) {
    super(title, author, publisher, numberOfPages);
  }

  @Override
  public void displayHighlightedText() {
    System.out.println("Biology highlighted text from " + getTitle() + ": " + highlightedText);
  }

}
