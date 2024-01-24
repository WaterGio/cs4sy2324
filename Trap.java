import java.util.List;

public class Trap extends Entity {
    private int damage;

    public Trap(int x, int y, int damage) {
        super("Trap", 0, x, y, null); 
        this.damage = damage;
    }

    public void activate(List<Entity> entities) {
        for (Entity entity : entities) {
            if (entity.getX() == x && entity.getY() == y) {
                System.out.println("Trap activated! Dealing " + damage + " damage to " + entity.getName() + ".");
                entity.takeDamage(damage);
            }
        }
    }
}
