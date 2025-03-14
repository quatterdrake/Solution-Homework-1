package enemies;

public interface Enemy {
    int getHealth();
    int getAttackDamage();
    void takeDamage(int damage);
}