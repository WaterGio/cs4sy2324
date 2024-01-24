public class Entity {
    protected String name;
    protected int health;
    protected int x;
    protected int y;
    protected Pistol pistol;

    public Entity(String name, int health, int x, int y, Pistol pistol) {
        this.name = name;
        this.health = health;
        this.x = x;
        this.y = y;
        this.pistol = pistol;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public void move(int newX, int newY) {
        x = newX;
        y = newY;
        System.out.println(name + " moved to position (" + x + ", " + y + ").");
    }

    public void firePistol(Entity target) {
        if (pistol != null) {
            System.out.println(name + " fires at " + target.getName() + "!");
            pistol.shoot(target);
        } else {
            System.out.println(name + " doesn't have a pistol.");
        }
    }
}



