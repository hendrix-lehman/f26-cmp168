import java.util.ArrayList;

public class WithGenerics {

  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<>();
    list.add("Hello");
    list.add("World");
    // list.add(42); // compile-time error: incompatible types

    String str1 = list.get(0);
    System.out.println(str1);

    String str2 = list.get(1);
    System.out.println(str2);
  }
}
