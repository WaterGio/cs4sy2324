class Enemy extends Entity {
    private static final int VISION_RANGE = 5;

    public Enemy(String name, int health, int x, int y) {
        super(name, health, x, y, new Pistol("Enemy Pistol", 10));
    }

    public void attack(Player player) {
        if (isPlayerInVisionRange(player)) {
            System.out.println(name + " attacks " + player.getName() + "!");
            player.takeDamage(20);
        } else {
            System.out.println(name + " doesn't see the player.");
        }
    }

    private boolean isPlayerInVisionRange(Player player) {
        int playerX = player.getX();
        int playerY = player.getY();

        return Math.abs(playerX - x) <= VISION_RANGE && Math.abs(playerY - y) <= VISION_RANGE;
    }
}
