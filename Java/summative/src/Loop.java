import java.util.ArrayList;
import java.util.Scanner;


public class Loop {

  // Fields
  private boolean running = true;
  private boolean listRunning = false;
  private boolean filterRunning = false;
  private boolean clientRunning = false;

  /*
   * Start loop of presenting options to user.
   */
  public void startLoop(Scanner s) {
    clearTerminal(); // Flush terminal

    while (running) { // Loop until user quits
      System.out.println("Available options:");
      System.out.println("1️⃣ - 🟢 - New Client");
      System.out.println("2️⃣ - 📃 - Manage Clients");
      System.out.println("3️⃣ - 🔎 - Search Clients");
      System.out.println("4️⃣ - ⭕ - New Client Loop");
      System.out.println("5️⃣ - ❌ - Exit Program");
      System.out.print("Input option: ");
      int option = s.nextInt();
      clearTerminal();

      if (option == 1) {
        // Add client
        s.nextLine();
        System.out.print("Name: ");
        String name = s.nextLine(); // Get name
        System.out.print("Address: ");
        String address = s.nextLine(); // Get address
        System.out.print("Phone: ");
        String phone = s.nextLine(); // Get phone
        System.out.print("Email: ");
        String email = s.nextLine(); // Get email
        System.out.print("Note: ");
        String note = s.nextLine(); // Get note

        // Create new client with auto-generated ID
        // Populate with given details
        Client client = new Client(); 
        client.setName(name);
        client.setAddress(address);
        client.setPhone(phone);
        client.setEmail(email);
        client.setNote(note);
        client.save(); // Save client to file

        clearTerminal();
        System.out.println("✅ - Client added successfully.");
      }
      else if (option == 2) {
        // Show list of all clients
        listRunning = true;
        Search search = new Search();
        while (listRunning) { // Loop until user quits
          clearTerminal();
          search.refreshSearch(); // Make sure data is up to date.
          completeList(search.getClients(), s); // Show list of clients
        }
      }
      else if (option == 3) {
        // Search clients
        Search search = new Search();
        filterRunning = true;
        while (filterRunning) {
          search.refreshSearch();
          System.out.println("Available filters:");
          System.out.println("1️⃣ - Name");
          System.out.println("2️⃣ - Address");
          System.out.println("3️⃣ - Phone");
          System.out.println("4️⃣ - Email");
          System.out.println("5️⃣ - Note");
          System.out.println("6️⃣ - Suspicious");
          System.out.println("Available options:");
          System.out.println("7️⃣ - Print results (" + search.getSize() + "):");
          System.out.println("8️⃣ - Reset search");
          System.out.println("9️⃣ - Back");
          System.out.print("Input option: ");
          int searchOption = s.nextInt();

          if (searchOption == 9) { 
            // Exit search
            filterRunning = false;
            clearTerminal();
            continue;
          }
          else if (searchOption == 7) {
            // Print results
            listRunning = true;
            while (listRunning) { // Loop until user quits
              clearTerminal(); 
              search.refreshSearch(); // Make sure data is up to date.
              completeList(search.getClients(), s); // Show list of filtered clients
            }
          }
          else if (searchOption == 6) {
            // Suspicious
            search.addFilter(5, "", false);
            clearTerminal();
          }
          else if (searchOption == 8) {
            // Reset search
            search.resetSearch();
            clearTerminal();
          }
          else {
            // Add filter where query is required
            clearTerminal();
            s.nextLine();
            System.out.print("Query:"); 
            String query = s.nextLine(); // Get query
            // Apply filter
            search.addFilter(searchOption - 1, query, false);
            clearTerminal();
          }
        }
      }
      else if (option == 4) {
        clientRunning = true;
        while (clientRunning) {
          System.out.println("Welcome new client, please select an option:");
          System.out.println("1️⃣ - 🟢 - Start");
          System.out.println("2️⃣ - ❌ - Quit");
          System.out.print("Input option: ");
          int clientLoopOption = s.nextInt();
          clearTerminal();
  
          if (clientLoopOption == 1) {
            // Start client loop
            // Add client
            s.nextLine();
            System.out.print("Name: ");
            String name = s.nextLine(); // Get name
            System.out.print("Address: ");
            String address = s.nextLine(); // Get address
            System.out.print("Phone: ");
            String phone = s.nextLine(); // Get phone
            System.out.print("Email: ");
            String email = s.nextLine(); // Get email

            // Create new client with auto-generated ID
            // Populate with given details
            Client client = new Client(); 
            client.setName(name);
            client.setAddress(address);
            client.setPhone(phone);
            client.setEmail(email);
            client.setNote("Automated: This client was created by the client loop.");
            client.save(); // Save client to file

            clearTerminal();
            System.out.println("✅ - Thanks for your details!");
            
          }
          else {
            // Quit all loops
            clientRunning = false;
            running = false;
          }
  
        }

      }
      else {
        // Exit program
        System.out.println("Exiting program..");
        running = false;
      }
    }
  }

  /**
   * Prints a list of clients.
   * @param clients
   * @param s
   */
  private void completeList(ArrayList<Client> clients, Scanner s) {
    System.out.println("Available options:");
    int i = 0; // Index of client
    for (Client client : clients) {
      i++; // Increment index
      System.out.println(i + ": " + client.getName()); // Print client name
    }

    // Final option will be exit
    i++;
    System.out.println(i + ": Exit to menu");

    System.out.print("Input option: ");
    int searchResult = s.nextInt(); // Get input

    if (searchResult != i) { // If not exit
      clearTerminal();
      Client targetClient = clients.get(searchResult - 1); // Get client
  
      // Show client details
      System.out.println("Name: " + targetClient.getName());
      System.out.println("Address: " + targetClient.getAddress());
      System.out.println("Phone: " + targetClient.getPhone());
      System.out.println("Email: " + targetClient.getEmail());
      System.out.println("Note: " + targetClient.getNote());
      System.out.println("");
  
      System.out.println("Available options:");
      System.out.println("1️⃣ - 📝 - Edit name");
      System.out.println("2️⃣ - 📝 - Edit address");
      System.out.println("3️⃣ - 📝 - Edit phone");
      System.out.println("4️⃣ - 📝 - Edit email");
      System.out.println("5️⃣ - 📝 - Edit note");
      System.out.println("6️⃣ - 🚨 - Delete client");
      System.out.println("7️⃣ - ❌ - Exit to client list");

      int editOption = s.nextInt(); // Get input
      
      if (editOption == 1) {
        // Edit name
        s.nextLine();
        System.out.print("New name: ");
        String newName = s.nextLine();
        clearTerminal();
        // Set name and save
        targetClient.setName(newName);
        targetClient.save();
      }
      else if (editOption == 2) {
        s.nextLine();
        System.out.print("New address: ");
        String newAddress = s.nextLine();
        clearTerminal();
        // Set address and save
        targetClient.setAddress(newAddress);
        targetClient.save();
      }
      else if (editOption == 3) {
        s.nextLine();
        System.out.print("New phone: ");
        String newPhone = s.nextLine();
        clearTerminal();
        // Set phone and save
        targetClient.setPhone(newPhone);
        targetClient.save();
      }
      else if (editOption == 4) {
        s.nextLine();
        System.out.print("New email: ");
        String newEmail = s.nextLine();
        clearTerminal();
        // Set email and save
        targetClient.setEmail(newEmail);
        targetClient.save();
      }
      else if (editOption == 5) {
        s.nextLine();
        System.out.print("New note: ");
        String newNote = s.nextLine();
        clearTerminal();
        // Set note and save
        targetClient.setNote(newNote);
        targetClient.save();
      }
      else if (editOption == 6) {
        clearTerminal();
        // Delete client
        targetClient.delete();
      }
      else if (editOption == 7) {
        // Exit to client list
        clearTerminal();
      }
    }
    else {
      // Exit to menu
      listRunning = false;
      clearTerminal();
    }
  }

  /**
   * Flushes terminal
   */
  private void clearTerminal() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

}
