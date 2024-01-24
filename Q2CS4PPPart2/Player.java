import java.util.Scanner;

public class Player extends Entity {
    private Scanner scanner;

    public Player(String name, int health, int x, int y, Pistol pistol) {
        super(name, health, x, y, pistol);
        this.scanner = new Scanner(System.in);
    }

    public void move() {
        System.out.print("Enter the direction to move (W/A/S/D): ");
        char direction = scanner.next().toUpperCase().charAt(0);

        switch (direction) {
            case 'W':
                y--;
                break;
            case 'A':
                x--;
                break;
            case 'S':
                y++;
                break;
            case 'D':
                x++;
                break;
            default:
                System.out.println("Cannot move in that direction.");
        }

        System.out.println(name + " moved to position (" + x + ", " + y + ").");
    }

    public void firePistol(Entity target) {
        if (pistol != null) {
            System.out.println("Enter 'Y' to fire the pistol, any other key to skip: ");
            char input = scanner.next().toUpperCase().charAt(0);

            if (input == 'Y') {
                System.out.println(name + " fires at " + target.getName() + "!");
                pistol.shoot(target);
            } else {
                System.out.println(name + " decided not to fire the pistol.");
            }
        } else {
            System.out.println(name + " doesn't have a pistol.");
        }
    }
}
