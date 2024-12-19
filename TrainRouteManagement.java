import java.util.LinkedList;
import java.util.Scanner;


//Code Logic
public class TrainRouteManagement {
    private LinkedList<String> stops;

    public TrainRouteManagement() {
        stops = new LinkedList<>();
    }

    public void addStop(String stop) {
        stops.add(stop);
    }

    public void addFirstStop(String stop) {
        stops.addFirst(stop);
    }

    public void addLastStop(String stop) {
        stops.addLast(stop);
    }

    public void removeStop(int index) {
        if (index >= 0 && index < stops.size()) {
            stops.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void removeFirstStop() {
        if (!stops.isEmpty()) {
            stops.removeFirst();
        } else {
            System.out.println("No stops to remove.");
        }
    }

    public void removeLastStop() {
        if (!stops.isEmpty()) {
            stops.removeLast();
        } else {
            System.out.println("No stops to remove.");
        }
    }

    public boolean searchStop(String stop) {
        return stops.contains(stop);
    }

    public String getStop(int index) {
        if (index >= 0 && index < stops.size()) {
            return stops.get(index);
        } else {
            return "Invalid index.";
        }
    }

    public String getFirstStop() {
        return stops.getFirst();
    }

    public String getLastStop() {
        return stops.getLast();
    }

    public void updateStop(int index, String newStop) {
        if (index >= 0 && index < stops.size()) {
            stops.set(index, newStop);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public int totalStops() {
        return stops.size();
    }

    public void displayStops() {
        System.out.println("Train Stops:");
        for (String stop : stops) {
            System.out.println(stop);
        }
    }

    public void clearRoute() {
         stops.clear();
         System.out.println("All stops have been cleared.");
     }

     public static void main(String[] args) {
         TrainRouteManagement route = new TrainRouteManagement();
         Scanner scanner = new Scanner(System.in);

         //Taken As Example
         route.addStop("Station A");
         route.addStop("Station B");
         route.addFirstStop("Station Z");
         route.addLastStop("Station C");

         route.displayStops();

         System.out.println("\nTotal Stops: " + route.totalStops());

         route.removeFirstStop(); // Remove first stop
         route.removeLastStop(); // Remove last stop

         System.out.println("\nAfter removals:");
         route.displayStops();

         scanner.close();
     }
}
/*OUTPUT
Train Stops:
Station Z
Station A
Station B
Station C

Total Stops: 4

After removals:
Train Stops:
Station A
Station B
 
 */
