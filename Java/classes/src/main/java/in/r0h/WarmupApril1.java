package in.r0h;

import java.util.ArrayList;

public class WarmupApril1 {
  public static void main(String[] args) {
    char letter = 'a'; // line 1

    int value = letter; // line 2

    char newLetter = (char) value; // line 3

    System.out.println(letter + " " + value + " " + newLetter); // line 4

    ArrayList<Integer> listInt = new ArrayList<Integer>();

    ArrayList<Character> listChar = new ArrayList<Character>(); 

    listInt.add(64); // line 7

    listInt.add((int) 'w'); // line 8

    listChar.add((char) 64); // line 9

    listChar.add('w'); // line 10

    listInt.add(0, (int) 'p'); // line 11

  }
}

/*
 * 1. Error is on line three: Type mismatch: cannot convert from int to char
 * Can fix it by using (char)value instead of value
 * 
 * 2. 'a' < 'A' resolves to true.
 * 
 * 3. Because didnt import ArrayList, so it is not available.
 * 
 * 4. Adding character to integer list, and integer to character list.
 * 
 * 5. The instance method is .add()
 * 
 * 
 */
