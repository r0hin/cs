public class WaitingRoom {
 
  private int capacity;
  private Patient[] patients;

  public static void main(String[] args) {
    WaitingRoom waitingRoom = new WaitingRoom(5);
    Patient patient = new Patient("John", 123456789);
    waitingRoom.addPatient(patient);

    System.out.println(waitingRoom.patients);

  }

  public WaitingRoom(int capacity) {
    this.capacity = capacity;
    this.patients = new Patient[capacity];
  }

  public void addPatient(Patient patient) {
    if (patients.length < capacity) {
      patients[patients.length] = patient;
    }
  }



  



}
