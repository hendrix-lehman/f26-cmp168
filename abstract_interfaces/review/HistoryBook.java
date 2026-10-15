class HistoryBook extends Book {

  public HistoryBook(String title, String author, String publisher, int numberOfPages) {
    super(title, author, publisher, numberOfPages);
  }

  @Override
  public void displayHighlightedText() {
    System.out.println("History highlighted text from " + getTitle() + ": " + highlightedText);
  }

}
