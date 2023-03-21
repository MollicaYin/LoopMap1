import java.util.HashMap; // import the HashMap class
import java.util.Scanner; // import Scanner


public class CarType {
    
public static void main(String[] args) {
    HashMap<String, String> vehicles = new HashMap<>();
    vehicles.put("Civic", "Honda");
    vehicles.put("Corolla", "Toyota");
    vehicles.put("Camry", "Toyota");
    vehicles.put("Accord", "Honda");

    Scanner scanner = new Scanner(System.in);

    System.out.print("What car model are you looking for? ");
    String model = scanner.nextLine();

    if (vehicles.containsKey(model)) {
        String make = vehicles.get(model);
        System.out.println("Oh, you're looking for a " + model + "? Our " + make + " selection is right over here...");
    } else {
        System.out.println("Sorry, we don't have that model in stock.");
    }

    scanner.close();
}
}
