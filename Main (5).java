import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StartScreen startScreen = new StartScreen();
        startScreen.display();

        int choice = startScreen.handlePlayButtonClick();

        if (choice == 1) {
            Pistol pistol = new Pistol(10);

            Player player = new Player("Player1", 100, 0, 0, pistol);
            Enemy enemy = new Enemy("Enemy1", 50, 5, 5);
            player.move(2, 3);
            player.firePistol(enemy);
            System.out.println("Enemy's health post damage: " + enemy.getHealth());

            System.out.println("Player's health pre damage: " + player.getHealth());
            enemy.attack(player);
            System.out.println("Player's health post damage: " + player.getHealth());

            Civilian civilian = new Civilian("Civilian1", 100, 3, 3);
            civilian.move(5, 5);
            System.out.println("Civilian's current position: (" + civilian.getX() + ", " + civilian.getY() + ")");

            Trap trap = new Trap(3, 4, 15);
            List<Entity> entities = new ArrayList<>();
            entities.add(player);
            entities.add(enemy);
            entities.add(civilian);
            trap.activate(entities);

            for (Entity entity : entities) {
                System.out.println(entity.getName() + "'s health: " + entity.getHealth());
            }
            Object object = new Object(5, 5);
            VisibilityManager visibilityManager = new VisibilityManager();
            visibilityManager.addObject(object);
          
            boolean isVisible = visibilityManager.isPositionVisible(player.getX(), player.getY(), enemy.getX(), enemy.getY());
            System.out.println("Is Enemy visible to Player? " + isVisible);
        }
    }
}
