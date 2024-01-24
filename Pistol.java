class Pistol extends Entity {
    private int damage;

    public Pistol(String name, int damage) {
        super(name, 0, 0, 0, null); 
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void shoot(Entity target) {
        if (target != null) {
            System.out.println("Pistol shot! Dealing " + damage + " damage to " + target.getName() + ".");
            target.takeDamage(damage);
        } else {
            System.out.println("No target to shoot at.");
        }
    }
}