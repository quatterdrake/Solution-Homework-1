package enemies;

public class Zombie implements Enemy {
    private int health = 30;

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getAttackDamage() {
        return 5;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }
}