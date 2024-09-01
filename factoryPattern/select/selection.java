package factoryPattern.select;
import java.util.Scanner;

public class selection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Select an option: ");
            System.out.println("1. Cat");
            System.out.println("2. Dog");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            
            switch (choice) {
                case 1:
                    System.out.println("Cats have 9 lives.");
                    break;
                case 2:
                    System.out.print("Enter the breed of the dog you want: ");
                    String breed = scanner.nextLine();
                    System.out.println("You selected a dog of breed: " + breed);
                    break;
                case 3:
                    System.out.println("Exit...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid. Please select again.");
            }
        }
    }
}
    

