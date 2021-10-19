package view;

import com.sun.security.jgss.GSSUtil;
import model.Board;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {
    public Menu() {
    }



    public void displayMenu(){
        System.out.println("Welcome to battleships!");
        System.out.println("Please choose a mode you would like to play: ");
        System.out.println("1. Player Vs Computer");
    }


    public int userGameModeChoice(){
        boolean check = false;
        Scanner in = new Scanner(System.in);
        int userChoice = in.nextInt();

        System.out.print("Enter your choice: " + userChoice);

        do {
            switch (userChoice){
                case 1:
                    System.out.println("You have chosen: Player Vs Computer");
                    check = true;
                    break;

                default:
                    System.out.println("ERROR! Please enter a correct number");
            }
        }while (!check);

        return userChoice;
    }


    public void inGameChoice() throws FileNotFoundException {
        boolean check = false;
        Scanner in = new Scanner(System.in);
        int userChoice = in.nextInt();
        Board board =  new Board();

        System.out.println("1. Auto place all ships");
        System.out.println("2. Place your own ships");
        System.out.print("Enter your how you would like to place the ships: " + userChoice);

        do {
            switch (userChoice){
                case 1:
                    System.out.println();
                    System.out.println("You have selected to auto place ships");
                    System.out.println("Loading...");
                    board.autoPlaceShip();
                    check = true;
                    break;

                case 2:
                    System.out.println();
                    System.out.println("You have selected to place your own ships...");
                    board.placeShip();
                    check = true;
                    break;

                default:
                    System.out.println("ERROR! Please enter a correct number");
            }

        }while (!check);
    }
}
