import java.util.Scanner; 

public class TowerOfHanoi {
  /** Main method */
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Skriv inn antall skiver: ");
    int n = input.nextInt();

    // Find the solution recursively
    System.out.println("Trekkene er:");
    moveDisks(n, 'A', 'B', 'C');
    System.out.println("\nMed " + n + " skiver ble l�sningen fullf�rt med " + count + " trekk!");
  }
  
  static int count;

  /** The method for finding the solution to move n disks
      from fromTower to toTower with auxTower */
  public static void moveDisks(int n, char fromTower,
      char toTower, char auxTower) {
	  count++;
    if (n == 1) // Stopping condition
      System.out.println("Flytt skive " + n + " fra " +
        fromTower + " til " + toTower);
    else {
      moveDisks(n - 1, fromTower, auxTower, toTower);
      System.out.println("Flytt skive " + n + " fra " +
        fromTower + " til " + toTower);
      moveDisks(n - 1, auxTower, toTower, fromTower);
    }
  }
}