import java.util.ArrayList; // import the ArrayList class

/* This is a stub for the House class */
public class House extends Building {

  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom; // add another boolean that checks whether there is a dining room in the house
  public boolean hasElevator; // add a boolean attribute to see whether there is a elevator in the building

  /*
   * overloaded constructor with name and address only
   */
  public House(String name, String address) {
    super(name, address);
    this.residents = new ArrayList<String>();
} 
  /* Full constructor of the house */
  public House(String name, String address, int nFloors, boolean hasDin, boolean hasEle) {
    super(name, address, nFloors); // variables in the super class
    this.hasDiningRoom = hasDin;
    this.hasElevator = hasEle;
    this.residents = new ArrayList<String>();
  }
  /* check if the house has dining room */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }
  /* check how many residents are in the house */
  public int nResidents() {
    return this.residents.size();
  }

  /* check how many residents are in the house
   * @param name
   */
  public void moveIn(String name) {
    residents.add(name);
    System.out.println(name + "moved in");
  }

  /*
   * overloaded method , move in with student name and ID record
   * @param name
   */
  public void moveIn(String name, int ID){
    residents.add(name);
    System.out.println(name + ID + "moved in");
  }

  /* some one move out from the house and return the name of the person who moved out
   * @param name
   */
  public String moveOut(String name) {
    if (residents.contains(name)) {
      residents.remove(name);
      System.out.println(name + " moved out from the house.");
    }
    return name;
  } 

  /*
   * show available options in this class
   */
  public void showOptions() {
    System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n)\n + hasDiningRoom()\n + nResidents()\n + moveIn()\n + moveOut()\n + checkElevator()");
  }

  /*
   * check if there is an elevator in this building
   * call goToFloor if there is one
   */
  public void checkElevator() {
    if (this.hasElevator == true) {
      goToFloor(3);
    } else {
      System.out.println("This House doesn't have an elevator.");
    }
  }


  public static void main(String[] args){
    System.out.println("You have built a house: 🏠");
    House myHouse = new House("Cutter", "10 Prospect Street", 3, true, true);
    myHouse.showOptions();
    myHouse.enter();
    myHouse.checkElevator();
    System.out.println(myHouse);
    myHouse.moveIn("Lynne", 9914);
    myHouse.moveIn("Iris");
    myHouse.moveIn("Rayna");
    myHouse.moveIn("Sofi");
    System.out.println("Residents in this house:" + myHouse.residents);
    myHouse.moveOut("Sofi");
    System.out.println("Residents in this house:" + myHouse.residents);
    System.out.println("There are " + myHouse.residents.size() + " people in the house.");
    System.out.println("Is there a diningroom in the house? " + myHouse.hasDiningRoom);
  }
}