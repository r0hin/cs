import java.util.LinkedList;

public class LinkedListTest {  
  public static void main(String[] args) {
    // create a linked list
    LinkedList<String> list = new LinkedList<String>();
    list.add("Hello");
    list.add("World");
    list.add("!");
    System.out.println(list);

    // Print second element in list
    System.out.println(list.get(1));
  }
}
