package level;

import enemies.Enemy;
import enemies.Zombie;

public class LevelManager {
    public Enemy spawnEnemy() {
        return new Zombie();
    }
}