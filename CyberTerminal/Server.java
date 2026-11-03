import java.util.Random;

public class Server {

    private String serverName;
    private int password;
    private boolean connected;
    private boolean authenticated;

    public Server(String serverName) {
        this.serverName = serverName;
        this.password = new Random().nextInt(10) + 1;
        this.connected = false;
        this.authenticated = false;
    }

    public String getServerName() {
        return serverName;
    }

    public void connect() {
        connected = true;
        authenticated = false;

        System.out.println("Connected to " + serverName);
        System.out.println("Security authentication required.");
    }

    public boolean authenticate(int guess) {

        if (!connected) {
            System.out.println("Connect to server first.");
            return false;
        }

        if (guess == password) {
            authenticated = true;
            System.out.println("ACCESS GRANTED!");
            return true;
        }

        System.out.println("ACCESS DENIED!");
        return false;
    }

    public void showFiles() {

        if (!connected || !authenticated) {
            System.out.println("Access denied.");
            return;
        }

        System.out.println("\n--- SERVER FILES ---");
        System.out.println("mission_data.txt");
        System.out.println("employee_records.txt");
        System.out.println("secret_project.txt");
    }

    public boolean isAuthenticated() {
        return authenticated;
    }
}
