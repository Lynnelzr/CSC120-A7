/* This is a stub for the Cafe class */
public class Cafe extends Building{
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
    private Boolean hasElevator;

    /*
     * overloaded constructer with name, address only
     */
    public Cafe(String name, String address){
        super(name, address);
    }

    /*
     * overloaded constructor with name, address, and nFloors only
     */
    public Cafe(String name, String address, int nFloors){
        super(name, address, nFloors);
    }

    /* full constructor of the Cafe */
    public Cafe(String name, String address, int nFloors, boolean hasEle) {
        super(name, address, nFloors); // variables in the super clas
        this.nCoffeeOunces = 500;
        this.nSugarPackets = 50;
        this.nCreams = 50;
        this.nCups = 50;
        this.hasElevator = hasEle;
        System.out.println("You have built a cafe: ☕");
    }

    /* 
     * selling coffee and decrease the inventory after selling each cup of coffe
     * check if the inventory need to be restocked
     * if it's needed, restocked the inventory
     */
    public void sellCoffee(int size, int nSugar, int nCream){
        System.out.println("This coffee contains material: " + "Coffee: "+ nCoffeeOunces + " Sugar: "+nSugarPackets + " Cream: "+ nCreams + " Cups: "+nCups);
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugar;
        this.nCreams -= nCream;
        this.nCups -= 1;
        System.out.println("After selling one cup of coffee, we left with material: " + "Coffee: "+ nCoffeeOunces + " Sugar: "+nSugarPackets + " Cream: "+ nCreams + " Cups: "+nCups);
        if (this.nCoffeeOunces <= size || this.nSugarPackets <= nSugar || this.nCreams <= nCream || this.nCups <= 1){
            restock(size, nSugarPackets, nCreams, nCups);
            System.out.println("After restock material: "+ " Coffee: "+ nCoffeeOunces + " Sugar: "+nSugarPackets + " Cream: "+ nCreams + " Cups: "+nCups);
        }
    }

    /* restock the inventory to initialized amounts */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces = 500;
        this.nSugarPackets = 50;
        this.nCreams = 50;
        this.nCups = 50;
    }

    public void showOptions() {
        System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + sellCoffee()\n + restock()\n + checkElevator()");
    }

    public void checkElevator() {
        if (this.hasElevator == true) {
          goToFloor(1);
        } else {
          System.out.println("This House doesn't have an elevator.");
        }
      }
  
    public static void main(String[] args) {
        Cafe myCafe = new Cafe("Campus Center Cafe", "100 Elm St", 1, false);
        myCafe.showOptions();
        myCafe.enter();
        myCafe.sellCoffee(12, 2, 3);
    }
    
}
