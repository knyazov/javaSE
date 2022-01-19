package Serializable2;

import java.io.Serializable;
import java.util.ArrayList;

public class Game implements Serializable {
        private String gameName;
        private String ipAddress;
        private int port;
        ArrayList players = new ArrayList();

    public Game(String gameName, String ipAddress, int port) {
        this.gameName = gameName;
        this.ipAddress = ipAddress;
        this.port = port;
    }

    public Game(String gameName, String ipAddress, int port, ArrayList players) {
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
    public String toString(){
        return "gameName " + this.gameName + " ip " + this.ipAddress + " PORT " + this.port;
    }

    public String getGame() {
        return "Game{" +
                "gameName='" + gameName + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", port=" + port +
                ", players=" + players +
                '}';
    }
}
