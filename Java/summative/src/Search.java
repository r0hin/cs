import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

public class Search {

  // Fields
  private ArrayList<Client> clients = new ArrayList<Client>();
  private ArrayList<Integer> filtersIndexes = new ArrayList<Integer>();
  private ArrayList<String> filtersQueries = new ArrayList<String>();
  
  /**
   * Constructor for Search
   */
  public Search() {
    // Get list of all .txt files in default directory
    File[] files = new File(".").listFiles(new FilenameFilter() {
      public boolean accept(File dir, String name) {
        return name.toLowerCase().endsWith(".txt");
      }
    });

    // Reverse files array to simulate a stack
    for (int i = files.length - 1; i >= 0; i--) {
      // Get file name without extension
      File file = files[i];
      String id = file.getName().replace(".txt", "");
      // Make into an instance of Client
      Client client = new Client(id);
      clients.add(client);

      // Remove file from array to simulate stack
      files[i] = null;
    }
  }

  /**
   * Refresh search
   * precondition: none
   * postcondition: search is reset, and all clients are shown
   */
  public void resetSearch() {
    // Clear list of filters
    filtersIndexes.clear();
    filtersQueries.clear();

    // Refresh data without filters
    refreshSearch();
  }

  /**
   * Refresh search with filteresIndexes and filtersQueries
   * precondition: filtersIndexes and filtersQueries are set
   * postcondition: search is refreshed, and only clients that match filters are shown
   */
  public void refreshSearch() {
    clients = new ArrayList<Client>(); // Clear clients

    // Get list of all .txt files in default directory
    File[] files = new File(".").listFiles(new FilenameFilter() {
      public boolean accept(File dir, String name) {
        return name.toLowerCase().endsWith(".txt");
      }
    });

    // Reverse files array to simulate a stack
    for (int i = files.length - 1; i >= 0; i--) {
      // Get file name without extension
      File file = files[i];
      String id = file.getName().replace(".txt", "");
      // Make into an instance of Client
      Client client = new Client(id);
      clients.add(client);

      // Remove file from array to simulate stack
      files[i] = null;
    }

    // Loop through filtersindexes
    for (int i = 0; i < filtersIndexes.size(); i++) {
      int filterIndex = filtersIndexes.get(i);
      String filterQuery = filtersQueries.get(i);

      // Apply the filter
      addFilter(filterIndex, filterQuery, true);
    }
  }

  /**
   * Add filter to search
   * @param filterIndex Index of filter (0 = name, 1 = address, 2 = phone, 3 = email, 4 = note, 5 = suspicious)
   * @param filterQuery Query of filter
   * @param refresh Whether to refresh search
   * precondition: filterIndex and filterQuery are set
   * postcondition: filter is added to search, and search is refreshed.
   */
  public void addFilter(int index, String filter, boolean skipFilterAdd) {
    ArrayList<Client> filteredClients = new ArrayList<Client>(); // List of clients that match filter
    if (!skipFilterAdd) {
      filtersIndexes.add(index);
      filtersQueries.add(filter);
    }
    if (index == 0) {
      for (Client client : clients) { // Search on basis of name contains
        if (client.getName().toLowerCase().contains(filter.toLowerCase())) {
          filteredClients.add(client);
        }
      }
    }
    else if (index == 1) {
      for (Client client : clients) { // Search on basis of address contains
        if (client.getAddress().toLowerCase().contains(filter.toLowerCase())) {
          filteredClients.add(client);
        }
      }
    }
    else if (index == 2) {
      for (Client client : clients) { // Search on basis of phone contains
        if (client.getPhone().toLowerCase().contains(filter.toLowerCase())) {
          filteredClients.add(client);
        }
      }
    }
    else if (index == 3) {
      for (Client client : clients) { // Search on basis of email contains
        if (client.getEmail().toLowerCase().contains(filter.toLowerCase())) {
          filteredClients.add(client);
        }
      }
    }
    else if (index == 4) {
      for (Client client : clients) { // Search on basis of note contains
        if (client.getNote().toLowerCase().contains(filter.toLowerCase())) {
          filteredClients.add(client);
        }
      }
    }
    else if (index == 5) {
      // Only include badly formatted emails
      for (Client client : clients) {
        String email = client.getEmail();
        // Regex to check x@y where x,y are anything.
        if (!email.matches("^(.+)@(.+)$")) {
          filteredClients.add(client);
        }
      }
    }

    // Set contents of clients to filteredClients
    clients = new ArrayList<Client>();
    for (Client client : filteredClients) {
      clients.add(client);
    }
  }

  /**
   * Get list of clients
   */
  public ArrayList<Client> getClients() {
    return clients;
  }

  /**
   * Get count of filtered clients
   */
  public int getSize() {
    return clients.size();
  }
}
