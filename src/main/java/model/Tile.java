package model;

public class Tile {
    private boolean hasShip = false;
    private boolean boatHit = false;
    public String state = "";


    public void renderTile(){

        System.out.println("---");
        System.out.println("|" + state + "|");
        System.out.println("---");
    }


    public boolean isHasShip() {
        return hasShip;
    }

    public void setHasShip(boolean hasShip) {
        this.hasShip = hasShip;
    }

    public boolean isBoatHit() {
        return boatHit;
    }

    public void setBoatHit(boolean boatHit) {
        this.boatHit = boatHit;
    }
}
