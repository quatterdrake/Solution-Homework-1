package player;

import items.Item;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private int health;
    private int experience;
    private List<Item> inventory;

    public Player(int health, int experience) {
        this.health = health;
        this.experience = experience;
        this.inventory = new ArrayList<>();
    }

    public void addItem(Item item) {
        inventory.add(item);
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("Player has died.");
        }
    }
}