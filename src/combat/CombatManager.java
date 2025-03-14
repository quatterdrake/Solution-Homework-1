package combat;

import enemies.Enemy;
import player.Player;

public class CombatManager {
    public void fight(Player player, Enemy enemy) {
        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            enemy.takeDamage(10);
            player.takeDamage(enemy.getAttackDamage());
        }
        if (player.getHealth() <= 0) {
            System.out.println("Player died.");
        } else {
            System.out.println("Enemy defeated.");
        }
    }
}