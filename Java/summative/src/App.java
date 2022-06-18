import java.io.File;
import java.io.FileWriter;
import java.util.Base64;
import java.util.Scanner;

public class App {
  
  // One global system scanner
  private static Scanner s = new Scanner(System.in);
  
  /**
   * Caesar encrypt
   * @param plain
   * precondition: plain is a string
   * postcondition: returns an encrypted string
   */
  private static String caesarCipherEncrypt(String plain) {
    String b64encoded = Base64.getEncoder().encodeToString(plain.getBytes());
    String reverse = new StringBuffer(b64encoded).reverse().toString(); // Reverse the base 64 encoded
    StringBuilder encrypted = new StringBuilder();
    for (int i = 0; i < reverse.length(); i++) {
      encrypted.append((char)(reverse.charAt(i) + 8)); // Add predefined offset of 8 to each character
    }
    return encrypted.toString();
  }
  
  // Main entry point
  public static void main(String[] args) throws Exception {
    // Flush terminal
    System.out.print("\033[H\033[2J");
    System.out.flush();

    try {
      // Check if password file exists
      File file = new File("pass.ini");
      if (!file.exists()) {
        System.out.println("🎉 - Welcome to Client Manager 1.0. This seems to be your first time! Please create a password:");
        String password = s.nextLine(); // Get password
        FileWriter fw = new FileWriter(file); // Get file writer
        fw.write(caesarCipherEncrypt(password)); // Write encrypted password to file
        fw.close();
      }
      else {
        Scanner fileScanner = new Scanner(file); // Get file reader
        String password = fileScanner.nextLine(); // Get password
        fileScanner.close(); // Close file reader
        
        
        System.out.println("🔑 - Please enter your password:"); 
        String password2 = s.nextLine(); // Get password
        
        if (!(password).equals(caesarCipherEncrypt(password2))) {  // Check if password encryped doesnt match saved
          System.out.println("🗝️ - Incorrect password"); 
          System.exit(0); 
        }
      }
      
      // Start loop class
      Loop loop = new Loop();
      loop.startLoop(s); // Pass scanner to loop
      
      s.close(); // Close scanner when done loop
      
    } catch (Exception e) { // Simple error handling
      System.out.println("An exception occured: " + e);
    }
  }
}
