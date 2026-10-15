class App {

  public static void displayHighlights(Book book) {
    System.out.println("Title: " + book.getTitle());
    System.out.println("Author: " + book.getAuthor());
    System.out.println("Publisher: " + book.getPublisher());
    System.out.println("Number of Pages: " + book.getNumberOfPages());
    book.displayHighlightedText();

    if (book instanceof TechBook) {
    // cast the book to TechBook to access the isCdIncluded() method
      System.out.println("CD included: " + ((TechBook) book).isCdIncluded());

    }
  }
 
  public static void main(String[] args) {
    Book techBook = new TechBook("Java Programming", "John Doe", "Tech Press", 350);
    Book historyBook = new HistoryBook("World History", "Jane Smith", "History Press", 500); 
    Book chemistryBook = new ChemistryBook("Organic Chemistry", "Dr. Brown", "Science Press", 400);
    Book biologyBook = new BioBook("Biology 101", "Dr. Green", "Science Press", 300);

    Book[] books = {techBook, historyBook, chemistryBook, biologyBook};

    for (Book book : books) {
      displayHighlights(book);
      System.out.println();
    }

  }
}
