import player.Player;
import combat.CombatManager;
import enemies.Zombie;
import level.LevelManager;
import score.ScoreManager;

public class MainGame {
    public static void main(String[] args) {
        Player player = new Player(100, 0);
        LevelManager levelManager = new LevelManager();
        CombatManager combatManager = new CombatManager();
        ScoreManager scoreManager = new ScoreManager();

        Zombie enemy = (Zombie) levelManager.spawnEnemy();
        combatManager.fight(player, enemy);

        if (enemy.getHealth() <= 0) {
            scoreManager.increaseScore(10);
            System.out.println("Score: " + scoreManager.getScore());
        }
    }
}