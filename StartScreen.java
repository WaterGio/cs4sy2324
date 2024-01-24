import java.util.Scanner;

public class StartScreen {
    private Scanner scanner;

    public StartScreen() {
        this.scanner = new Scanner(System.in);
    }

    public void display() {
        System.out.println("=== Game Start Screen ===");
        System.out.println("1. Play");
        System.out.println("2. Quit");
    }

    public int handlePlayButtonClick() {
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Starting the game...");
        } else if (choice == 2) {
            System.out.println("Exiting the game...");
        } else {
            System.out.println("Invalid choice. Exiting the game...");
        }

        return choice;
    }
}
