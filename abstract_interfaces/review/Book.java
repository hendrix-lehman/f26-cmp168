abstract class Book {

  String title;
  String author;
  String publisher;
  int numberOfPages;
  String highlightedText;

  public Book(String title, String author, String publisher, int numberOfPages) {
    this.title = title;
    this.author = author;
    this.publisher = publisher;
    this.numberOfPages = numberOfPages;
    this.highlightedText = "No highlighted text available.";
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getPublisher() {
    return publisher;
  }

  public int getNumberOfPages() {
    return numberOfPages;
  }

  public String getHighlightedText() {
    return highlightedText;
  }

  public void setHighlightedText(String highlightedText) {
    this.highlightedText = highlightedText;
  }

  public static void sayHi() {
    System.out.println("Hi from the Book class!");
  }

  public abstract void displayHighlightedText(); 

  // BAD: abstract class Book
  // describes the general concept of a Book
  // regardless of the subject.
  // public void techTipOfThisBook() {
    // System.out.println("This book is a tech book. It contains useful tips and tricks for technology enthusiasts.");
  // }

}
