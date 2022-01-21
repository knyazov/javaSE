package Serializable2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void saveGame(ArrayList players) {
        try {
            ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("settings.data"));
            outStream.writeObject(players);
            outStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Game> readGame() {
        ArrayList<Game> games = new ArrayList<>();
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("settings.data"));
            games = (ArrayList<Game>) inputStream.readObject();
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
                ArrayList<Game> games = readGame();
                games.add(game);
                saveGame(games);
            } else if (choice == 2) {
                System.out.println("CHOOSE GAME: ");
                System.out.println("YOU CAN ENTER GAME'S INDEX");
                ArrayList<Game> games = readGame();
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
                    games.get(index).addPlayers(players2);
                    saveGame(games);
                    ArrayList<Players> players = new ArrayList<>();
                    players.add(players2);

                } else {
                    System.out.println("WRONG INDEX");
                }

            } else if (choice == 3) {
                ArrayList<Game> games = readGame();
                ArrayList<Players> players = new ArrayList<>();

                for (int i = 0; i < games.size(); i++) {
                    System.out.println((i + 1) + ")" + games.get(i).toString());
                }
//                if (games.size() > ){
//                    System.out.println("One game doesn't has players");
//                }else {
//                    System.out.println("Everything is OK");
//                }
            } else if (choice == 0) {
                System.exit(0);
            }
        }
    }
}
