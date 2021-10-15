package model;

public class Boat {
    private int id = 0;
    private String boatName = "";
    private int boatSize = 0;
    private int health = 0;

    public Boat(int id, String boatName, int boatSize, int health) {
        this.id = id;
        this.boatName = boatName;
        this.boatSize = boatSize;
        this.health = health;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBoatName() {
        return boatName;
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }

    public int getBoatSize() {
        return boatSize;
    }

    public void setBoatSize(int boatSize) {
        this.boatSize = boatSize;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
