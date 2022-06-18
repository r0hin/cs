import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Client {
  
  // Fields
  private String name;
  private String address;
  private String phone;
  private String email;
  private String note;
  private String id;
  private boolean deleted = false;

  /**
   * Constructor for Client with ID
   * @param id
   */
  public Client(String id) { 
    // Get data from file
    File file = new File(id + ".txt");

    if (file.exists()) {
      try {
        Scanner fileScanner = new Scanner(file);
        this.name = fileScanner.nextLine();
        this.address = fileScanner.nextLine();
        this.phone = fileScanner.nextLine();
        this.email = fileScanner.nextLine();
        this.note = fileScanner.nextLine();
        fileScanner.close();
      } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
      }
    }
    else {
      System.out.println("Client does not exist with this ID. A new empty client will be created.");
      this.name = "";
      this.address = "";
      this.phone = "";
      this.email = "";
      this.note = "";
    }

    this.id = id;
  }

  /**
   * Second constructor for Client without ID
   */
  public Client() { // Create new client
    this.id = String.valueOf(System.currentTimeMillis());
    this.name = "";
    this.address = "";
    this.phone = "";
    this.email = "";
    this.note = "";
  }

  /**
   * Save client to file
   * precondition: Client has an ID
   * postcondition: Client is saved to file
   */
  public void save() {
    if (this.deleted) {
      throw new RuntimeException("Client is deleted"); // Throw error
    }

    // Delete the file if it already exists:
    File file = new File(this.id + ".txt");
    if (file.exists()) {
      file.delete();
    }

    // Create a new file of [id].txt
    try {
      file.createNewFile();
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }

    // Write the client data to the file
    try {
      FileWriter writer = new FileWriter(file);
      writer.write(this.name + "\n");
      writer.write(this.address + "\n");
      writer.write(this.phone + "\n");
      writer.write(this.email + "\n");
      writer.write(this.note + "\n");
      writer.close();
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }

    System.out.println("✅ - Client saved successfully.");
  }

  /**
   * Delete client from file
   * precondition: Client has an ID
   * postcondition: Client is deleted from file
   */
  public void delete() {
    if (this.deleted) {
      throw new RuntimeException("Client is deleted"); // Throw error
    }

    // Get file
    File file = new File(this.id + ".txt");
    // If file exists, delete it
    if (file.exists()) {
      file.delete();
    }
    this.deleted = true;
    System.out.println("✅ - Client deleted successfully.");
  }

  /**
   * Get client deleted status
   */
  public boolean isDeleted() {
    return deleted;
  }

  // Getters

  /**
   * Get client name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Get client address
   */
  public String getAddress() {
    return address;
  }

  /**
   * Get client phone
   */
  public String getPhone() {
    return phone;
  }

  /**
   * Get client email
   */
  public String getEmail() {
    return email;
  }

  /**
   * Get client note
   */
  public String getNote() {
    return note;
  }

  /**
   * Get client ID
   */
  public String getId() {
    return id;
  }

  // Setters

  /**
   * Set client name
   * @param name
   */
  public void setName(String name) {
    // Make sure name is not empty
    if (name.isEmpty()) {
      throw new IllegalArgumentException("Name cannot be empty");
    }

    // Make sure name is not longer than 100 characters
    if (name.length() > 100) { 
      throw new IllegalArgumentException("Name cannot be longer than 100 characters");
    }

    // Make sure name does not start or end with a space
    if (name.charAt(0) == ' ' || name.charAt(name.length() - 1) == ' ') { 
      throw new IllegalArgumentException("Name cannot start or end with a space");
    }

    // All good
    this.name = name;
  }
  
  /**
   * Set client address
   * @param address
   */
  public void setAddress(String address) {
    // Make sure address is not empty
    if (address.isEmpty()) {
      throw new IllegalArgumentException("Address cannot be empty");
    }

    // Make sure address is not longer than 200 characters
    if (address.length() > 200) { 
      throw new IllegalArgumentException("Address cannot be longer than 200 characters");
    }

    // All good
    this.address = address;
  }

  /**
   * Set client phone
   * @param phone
   */
  public void setPhone(String phone) {
    // Make sure phone is not empty
    if (phone.isEmpty()) {
      throw new IllegalArgumentException("Phone cannot be empty");
    }

    // Make sure phone is not longer than 20 characters
    if (phone.length() > 20) { 
      throw new IllegalArgumentException("Phone cannot be longer than 20 characters");
    }

    // Make sure phone does not start or end with a space
    if (phone.charAt(0) == ' ' || phone.charAt(phone.length() - 1) == ' ') { 
      throw new IllegalArgumentException("Phone cannot start or end with a space");
    }

    // Make sure phone only contains numbers and spaces and dashes
    for (int i = 0; i < phone.length(); i++) {
      if (!Character.isDigit(phone.charAt(i)) && phone.charAt(i) != ' ' && phone.charAt(i) != '-') {
        throw new IllegalArgumentException("Phone can only contain numbers, spaces, and dashes");
      }
    }

    // All good
    this.phone = phone;
  }

  /**
   * Set client email
   * @param email
   */
  public void setEmail(String email) {
    // Make sure email is not empty
    if (email.isEmpty()) {
      throw new IllegalArgumentException("Email cannot be empty");
    }

    // Make sure email is not longer than 100 characters
    if (email.length() > 100) { 
      throw new IllegalArgumentException("Email cannot be longer than 100 characters");
    }

    // Make sure email does not start or end with a space
    if (email.charAt(0) == ' ' || email.charAt(email.length() - 1) == ' ') { 
      throw new IllegalArgumentException("Email cannot start or end with a space");
    }

    // Make sure email only contains letters, numbers, and spaces, and @
    for (int i = 0; i < email.length(); i++) {
      if (!Character.isLetter(email.charAt(i)) && !Character.isDigit(email.charAt(i)) && email.charAt(i) != ' ' && email.charAt(i) != '@' && email.charAt(i) != '.') {
        throw new IllegalArgumentException("Email can only contain letters, numbers, spaces, @, and period.");
      }
    }

    // All good
    this.email = email;
  }

  /**
   * Set client note
   * @param note
   */
  public void setNote(String note) {
    // Make sure note is not longer than 1000 characters
    if (note.length() > 1000) { 
      throw new IllegalArgumentException("Note cannot be longer than 1000 characters");
    }

    // All good
    this.note = note;
  }
}