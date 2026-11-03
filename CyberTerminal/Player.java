public class Player {

    private String username;
    private int level;
    private int credits;

    public Player(String username) {
        this.username = username;
        this.level = 1;
        this.credits = 100;
    }

    public String getUsername() {
        return username;
    }

    public int getLevel() {
        return level;
    }

    public int getCredits() {
        return credits;
    }

    public void earnCredits(int amount) {
        credits += amount;
    }

    public void levelUp() {
        level++;
    }

    public void displayStatus() {
        System.out.println("\n--- PLAYER STATUS ---");
        System.out.println("Username: " + username);
        System.out.println("Level: " + level);
        System.out.println("Credits: " + credits);
    }
}
