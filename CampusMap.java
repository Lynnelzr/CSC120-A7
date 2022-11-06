import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
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

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Cutter Houe", "10 Prospect Street",3));
        myMap.addBuilding(new Building("Neilson", "7 Neilson Drive", 4));
        myMap.addBuilding(new Building("Campus Center", "100 Elm St", 2));
        myMap.addBuilding(new Building("Seelye Hall", "2 Seelye Dr, Northampton", 3));
        myMap.addBuilding(new Building("Smith College Museum of Art", "20 Elm St, Northampton", 2));
        myMap.addBuilding(new Building("Mendenhall Center for the Performing Arts", "122 Green St, Northampton", 2));
        myMap.addBuilding(new Building("Wright Hall", "5 Chapin Way, Northampton, MA 01063", 1));
        myMap.addBuilding(new Building("McConnell Hall","2 Tyler Ct, Northampton",2));
        myMap.addBuilding(new Building("Ainsworth Gym and Olin Fitness Center", "102 Lower College Ln, Northampton", 3));
        myMap.addBuilding(new Building("John M. Greene Hall", "60 Elm Street", 2));

        System.out.println(myMap);
    }
    
}
