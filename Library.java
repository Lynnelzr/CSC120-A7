import java.util.Hashtable;
import java.util.Set;

/* This is a stub for the Library class */
  public class Library extends Building{
    private Hashtable <String, Boolean> collection;
    private Boolean hasElevator;

    /*
     * overloaded constructor with name, address, and nFloors only
     */
    public Library(String name, String address, int nFloors){
      super(name, address, nFloors);
      this.collection = new Hashtable<>();
    }
    /*
     * full constructor
     */
    public Library(String name, String address, int nFloors, boolean hasEle) {
     super(name, address, nFloors); // variables in the super class
     this.collection = new Hashtable<>();
     this.hasElevator = hasEle;
     System.out.println("You have built a library: 📖");
    }

    /* add the book to the hashtable collection
     * @param title
     */
    public void addTitle(String title){
      collection.put(title, true);
    } 

    /*
     * overload addTitle method with published data
     * @param title
     */
    public void addTitle(String title, String publishedData){
      collection.put(title, true);
      System.out.println(title + "publised on" + publishedData + " was added in the collection");
    }

    /* return the title that we removed
     * @param title
     */
    public String removeTitle(String title){
      collection.remove(title);
      return title;
    } 
    /* replace the value of this key to false when the book is checked out */
    public void checkOut(String title){
      collection.replace(title, false);
    }

    /* replace the value of this key to true after the book is returned */
    public void Return(String title){
      collection.replace(title, true);
    }
    
    /* returns true if the title appears as a key in the Libary's collection, false otherwise */
    public boolean containsTitle(String title){
    if (collection.containsKey(title)) { //check if there is key "title"
      System.out.println("Yes");
      return true;
    } else{
      System.out.println("No");
      return false;
      }
    }
    /* check if the title we are finding is existing in the collecting
     * if not, throw exception
     * returns true if the title is currently available, false otherwise 
     */
    public boolean isAvailable(String title){
    if (collection.containsKey(title)){
      if (collection.get(title).equals(true)){
        System.out.println("This book is available.");
        return true;
      }
      else {
        System.out.println("This book is not available.");
        return false;
        }
      } 
      else {
        throw new RuntimeException("This book is not in our collection.");}
    }
    
    /* prints out the entire collection in an easy-to-read way (including checkout status) */
    public void printCollection(){
      Set<String> keys = this.collection.keySet();
      for (String key: keys){
        if(this.collection.get(key) == true){
          System.out.println(key + " (Available)");
        } else{
          System.out.println(key + " (Not Available)");
        }
      }
    } 


    /*
     * show available options in this class
     */
    public void showOptions() {
      System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n)\n + addTitle()\n + removeTitle()\n +checkOut()\n + Return()\n + containsTitle\n + isAvailable()\n + printCollection\n + checkElevator()");
    }

    /*
     * check if there is an elevator in this building
     * call goToFloor if there is one
     */
    public void checkElevator() {
      if (this.hasElevator == true) {
        goToFloor(1);
      } else {
        System.out.println("This House doesn't have an elevator.");
      }
    }

  
    public static void main(String[] args){
      Library myLibrary = new Library("Neilson", "7 Neilson Drive", 4, true);
      myLibrary.showOptions();
      myLibrary.enter();
      myLibrary.checkElevator();
      myLibrary.addTitle("Jane Eyre by Charlotte Brontë", "October 19, 1847");
      myLibrary.addTitle("The Great Gatsby by F. Scott Fitzgerald");
      myLibrary.printCollection();
      myLibrary.removeTitle("Jane Eyre by Charlotte Brontë");
      System.out.println("After remove a book.");
      myLibrary.printCollection();
      myLibrary.checkOut("The Great Gatsby by F. Scott Fitzgerald");
      System.out.println("Check out a book.");
      myLibrary.printCollection();
      myLibrary.Return("The Great Gatsby by F. Scott Fitzgerald");
      System.out.println("Return a book.");
      myLibrary.printCollection();
      System.out.println("Does the collection contain The Great Gatsby? ");
      myLibrary.containsTitle("The Great Gatsby by F. Scott Fitzgerald");
      System.out.println("Is the Jane Eyre available in the collection?");
      myLibrary.isAvailable("Jane Eyre by Charlotte Brontë");
    }
  }