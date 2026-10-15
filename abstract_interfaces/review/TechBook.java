class TechBook extends Book {

  boolean cdIncluded;

  public TechBook(String title, String author, String publisher, int numberOfPages) {
    super(title, author, publisher, numberOfPages);
    this.cdIncluded = false; // Default value
  }

  public boolean isCdIncluded() {
    return cdIncluded;
  }

  public void setCdIncluded(boolean cdIncluded) {
    this.cdIncluded = cdIncluded;
  }

  @Override
  public void displayHighlightedText() {
    System.out.println("Tech highlighted text from " + getTitle() + ": " + highlightedText);
  }
}
