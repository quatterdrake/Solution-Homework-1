package items;

public class HealthElixir implements Item {
    @Override
    public void use() {
        System.out.println("Health restored.");
    }
}