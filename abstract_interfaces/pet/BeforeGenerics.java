import java.util.ArrayList;

public class BeforeGenerics {

  public static void main(String[] args) {

    ArrayList list = new ArrayList();
    list.add("Hello");
    list.add("World");
    list.add(42); // accidentally adding an Integer to the list

    String str1 = (String) list.get(0);
    System.out.println(str1);

    String str2 = (String) list.get(2); // ClassCastException at runtime
  }
}
