package Serializable2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//    public static void addPlayer(Players players) {
//        ArrayList<Players> players1 = new ArrayList<>();
//        try {
//            players1.add(players);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public static void saveGame(ArrayList players) {
        try {
            ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("settings.data"));
            outStream.writeObject(players);
            outStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList readGame() {
        ArrayList games = new ArrayList<>();
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("settings.data"));
            games = (ArrayList) inputStream.readObject();
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return games;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("[1] TO CREATE GAME");
            System.out.println("[2] TO ADD PLAYER TO GAME");
            System.out.println("[3] TO PLAY GAME");
            System.out.println("[0] TO EXIT");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("GAME NAME: ");
                String name = sc.next();
                System.out.println("IP ADDRESS: ");
                String ipAddress = sc.next();
                System.out.println("PORT: ");
                int port = sc.nextInt();
                Game game = new Game(name, ipAddress, port);
                ArrayList games = readGame();
                games.add(game);
                saveGame(games);
            } else if (choice == 2) {
                System.out.println("CHOOSE GAME: ");
                System.out.println("YOU CAN ENTER GAME'S INDEX");
                ArrayList games = readGame();
                for (int i = 0; i < games.size(); i++) {
                    System.out.println((i) + ")" + games.get(i).toString());
                }
                int index = sc.nextInt();
                if (index >= 0 && index < games.size()) {
                    System.out.println("NICKNAME");
                    String nickname = sc.next();
                    System.out.println("RATING");
                    double rating = sc.nextDouble();
                    Players players2 = new Players(nickname, rating);
                    ArrayList<Players> players = new ArrayList<>();
                    players.add(players2);
                    ArrayList games1 = readGame();
                    //Game game = new Game(games1.get(index).);
                } else {
                    System.out.println("WRONG INDEX");
                }

            } else if (choice == 3) {
                ArrayList players = readGame();
                for (int i = 0; i < players.size(); i++) {
                    System.out.println((i + 1) + ")" + players.get(i).toString());
                }
            } else if (choice == 0) {
                System.exit(0);
            }
        }
    }
}
