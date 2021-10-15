package view;

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

        System.out.println("Enter your choice: " + userChoice);

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

}
