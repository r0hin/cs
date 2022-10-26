
// Create a class called combo based on the below UML diagram. All combinations are three integers long where the numbers are 0 <= n <= 60.
// A secure combo is a combination that has no repeating values or a defined increasing or decreasing numerical patters.
// The constructor that takes a single parameter will autogenerate a secure unique combination.
// The constructor that takes a name and combo will accept none secure combinations.

public class Combo {
  private String name;
  private int[] numbers;
  public static int comboCount;

  public Combo(String name) {
    this.name = name;
    this.numbers = new int[3];
    comboCount++;
  }

  public Combo(String name, int[] numbers) {
    this.name = name;
    this.numbers = numbers;
    comboCount++;
  }

  public String getName() {
    return name;
  }

  public int[] getCombo() {
    return numbers;
  }

  public static int getCount() {
    return comboCount;

  }

  public boolean isSecure() {
    // Check for repeating values
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] == numbers[j]) {
          return false;
        }
      }
    }

    return true;
  }

  public void genNewComb() {

  }  
}