package Serializable2;

import java.io.Serializable;
import java.util.ArrayList;

public class Game implements Serializable {
        private String gameName;
        private String ipAddress;
        private int port;
        ArrayList<Players> players = new ArrayList<>();

    public Game(String gameName, String ipAddress, int port) {
        this.gameName = gameName;
        this.ipAddress = ipAddress;
        this.port = port;
    }
    public void addPlayers(Players players1){
        players.add(players1);
    }
    public Game(String gameName, String ipAddress, int port, ArrayList<Players> players) {
        this.gameName = gameName;
        this.ipAddress = ipAddress;
        this.port = port;
        this.players = players;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public ArrayList getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameName='" + gameName + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", port=" + port +
                ", players=" + players +
                '}';
    }
}
