import java.util.LinkedList;
import java.util.Random;

//Create a runner class that has a LinkedList of Combo objects.  
//Create a random number of Combo objects using some loop structure and compare this with a partner. 
// Output the number of combos that are secure.

public class ComboRunner {
  public static void main(String[] args) {

    LinkedList<Combo> combos = new LinkedList<Combo>();

    // Random number from 1 to 100
    Random rand = new Random();
    int numCombos = rand.nextInt(100) + 1;

    // Create random number of combos
    for (int i = 0; i < numCombos; i++) {
      combos.add(new Combo("Combo " + i));
    }

    for (Combo combo : combos) {
      System.out.println(combo.getName() + " is secure: " + combo.isSecure());
    }

    System.out.println("Total number of combos: " + Combo.getCount());

  }
}

