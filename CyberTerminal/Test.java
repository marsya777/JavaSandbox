
import java.util.Scanner;

public class Test {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("==============================");
        System.out.println("       CYBER TERMINAL");
        System.out.println("==============================");

        System.out.print("Enter hacker username: ");
        String name = input.nextLine();

        Player player = new Player(name);

        Server[] servers = {
            new Server("Alpha_Server"),
            new Server("Beta_Server"),
            new Server("Omega_Server")
        };

        Server currentServer = null;

        while (true) {

            System.out.print("\n" + name + "@cybernet> ");
            String command = input.nextLine().toLowerCase();

            switch (command) {

                case "help":
                    System.out.println("scan     - Scan servers");
                    System.out.println("connect  - Connect to server");
                    System.out.println("crack    - Password challenge");
                    System.out.println("files    - View server files");
                    System.out.println("download - Complete mission");
                    System.out.println("status   - Player status");
                    System.out.println("exit     - Exit game");
                    break;

                case "scan":
                    System.out.println("\nAvailable servers:");

                    for (Server server : servers) {
                        System.out.println("- " + server.getServerName());
                    }
                    break;

                case "connect":
                    System.out.print("Server name: ");
                    String serverName = input.nextLine();

                    currentServer = null;

                    for (Server server : servers) {
                        if (server.getServerName()
                                .equalsIgnoreCase(serverName)) {

                            currentServer = server;
                            break;
                        }
                    }

                    if (currentServer != null) {
                        currentServer.connect();
                    } else {
                        System.out.println("Server not found.");
                    }
                    break;

                case "crack":

                    if (currentServer == null) {
                        System.out.println("Connect to a server first.");
                        break;
                    }

                    System.out.print("Guess password (1-10): ");
                    int guess = input.nextInt();
                    input.nextLine();

                    currentServer.authenticate(guess);
                    break;

                case "files":

                    if (currentServer == null) {
                        System.out.println("No server connected.");
                    } else {
                        currentServer.showFiles();
                    }
                    break;

                case "download":

                    if (currentServer == null ||
                            !currentServer.isAuthenticated()) {

                        System.out.println("Access denied.");
                        break;
                    }

                    System.out.println("Mission file downloaded!");
                    player.earnCredits(50);
                    player.levelUp();

                    System.out.println("+50 credits!");
                    System.out.println("Level increased!");
                    break;

                case "status":
                    player.displayStatus();
                    break;

                case "exit":
                    System.out.println("Disconnecting...");
                    return;

                default:
                    System.out.println("Unknown command.");
                    break;
            }
        }
    }
}

