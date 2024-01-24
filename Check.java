import java.util.List;

public class Check {
    public static Entity checkEntity(int x, int y, List<Entity> entities) {
        for (Entity entity : entities) {
            if (entity.getX() == x && entity.getY() == y) {
                return entity;
            }
        }
        return null;
    }

    public static Object checkObject(int x, int y, List<Object> objects) {
        for (Object object : objects) {
            if (object.getX() == x && object.getY() == y) {
                return object;
            }
        }
        return null;
    }
}
