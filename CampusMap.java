import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;
    ArrayList<House> houses;
    ArrayList<Library> libraries;
    ArrayList<Cafe> cafes;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
        houses = new ArrayList<House>();
        libraries = new ArrayList<Library>();
        cafes = new ArrayList<Cafe>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Adds a House to the map
     * @param h the House to add
     */
    public void addHouse(House h) {
        System.out.println("Adding house...");
        houses.add(h);
        System.out.println("-->Successfully added " + h.getName() + " to the map.");
    }

    /**
     * Adds a Library to the map
     * @param l the Library to add
     */
    public void addLibrary(Library l) {
        System.out.println("Adding library...");
        libraries.add(l);
        System.out.println("-->Successfully added " + l.getName() + " to the map.");
    }

    /**
     * Adds a Cafe to the map
     * @param c the Cafe to add
     */
    public void addCafe(Cafe c) {
        System.out.println("Adding cafe...");
        cafes.add(c);
        System.out.println("-->Successfully added " + c.getName() + " to the map.");
    }
    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    /**
     * Removes a House from the map
     * @param h the House to remove
     * @return the removed House
     */
    public void removeHouse(House h) {
        System.out.println("Removing house...");
        houses.remove(h);
        System.out.println("-->Successfully removed " + h.getName() + " to the map.");
    }

    /**
     * Removes a Library from the map
     * @param l the Library to remove
     * @return the removed Library
     */
    public void removeLibrary(Library l) {
        System.out.println("Removing library...");
        libraries.remove(l);
        System.out.println("-->Successfully removed " + l.getName() + " to the map.");
    }

    /**
     * Removes a Cafe from the map
     * @param c the Cafe to remove
     * @return the removed Cafe
     */
    public void removeCafe(Cafe c) {
        System.out.println("Removing cafe...");
        cafes.remove(c);
        System.out.println("-->Successfully removed " + c.getName() + " to the map.");
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        for (int i = 0; i < this.houses.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.houses.get(i).getName() + " (" + this.houses.get(i).getAddress() + ")";
        }
        for (int i = 0; i < this.libraries.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.libraries.get(i).getName() + " (" + this.libraries.get(i).getAddress() + ")";
        }
        for (int i = 0; i < this.cafes.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.cafes.get(i).getName() + " (" + this.cafes.get(i).getAddress() + ")";
        }
        return mapString;
       
    }


    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        myMap.addHouse(new House("Cutter Houe", "10 Prospect Street"));
        myMap.addLibrary(new Library("Neilson", "7 Neilson Drive", 4));
        myMap.addCafe(new Cafe("100 Elm St"));
        myMap.addBuilding(new Building("Seelye Hall", "2 Seelye Dr, Northampton", 3));
        myMap.addBuilding(new Building("Smith College Museum of Art", "20 Elm St, Northampton", 2));
        myMap.addBuilding(new Building("Mendenhall Center for the Performing Arts", "122 Green St, Northampton"));
        myMap.addBuilding(new Building("Wright Hall", "5 Chapin Way, Northampton, MA 01063", 1));
        myMap.addBuilding(new Building("McConnell Hall","2 Tyler Ct, Northampton"));
        myMap.addBuilding(new Building("Ainsworth Gym and Olin Fitness Center", "102 Lower College Ln, Northampton", 3));
        myMap.addBuilding(new Building("John M. Greene Hall", "60 Elm Street", 2));
        System.out.println(myMap);
    }
    
}
