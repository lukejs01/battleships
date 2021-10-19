package model;


import utils.FileHelper;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {

    private int boardSize = 0;
    private int cellSize = 0;
    private final int DEFAULT_BOARD_SIZE = 5;
    private final int DEFAULT_CELL_SIZE = 2;


    List<List<Tile>> board = new ArrayList<>();
    List<Boat> boats = new FileHelper().readBoatToList();

    public Board() throws FileNotFoundException {
    }

    public void populateBoard() {
        List<Tile> row = new ArrayList<>();
        for (int i = 0; i < boardSize; i++){
            row.add(new Tile());

        }
        for (int j = 0; j < boardSize; j++){

            board.add(row);
        }
    }



    public void renderBoard(){
        int total = boardSize * cellSize;
        char c = ' ';
        int verticalBoarderCounter = 0;
        int horizontalBoarderCounter = 0;
        List<String> horizontalBoarder = new ArrayList<>(Arrays.asList("A","B","C","D","E","F","G","H","I","J"));
        List<String> verticalBoarder = new ArrayList<>(Arrays.asList("0","1","2","3","4","5","6","7","8","9"));


        while (horizontalBoarderCounter != boardSize){
            if (horizontalBoarderCounter < 10){
                System.out.print(" " + horizontalBoarder.get(horizontalBoarderCounter));
                horizontalBoarderCounter++;

            } else if (horizontalBoarderCounter >= 10){
                int firstIndex = (horizontalBoarderCounter/10) - 1;
                int secondIndex = horizontalBoarderCounter%10;
                System.out.print(horizontalBoarder.get(firstIndex) + horizontalBoarder.get(secondIndex));
                horizontalBoarderCounter++;
            }
        }

        System.out.println();

        for (int i = 0; i <= total; i++){
            for (int k = 0 ; k <= total; k++){
                if (k % cellSize == 0 && i % cellSize != 0 && k == total){
                    if (verticalBoarderCounter < 10){
                        System.out.print("| " + verticalBoarder.get(verticalBoarderCounter));

                    }else if (verticalBoarderCounter >= 10){
                        int firstIndex = (verticalBoarderCounter/10)-1;
                        int secondIndex = verticalBoarderCounter%10;
                        System.out.print("| " + verticalBoarder.get(firstIndex) + verticalBoarder.get(secondIndex));
                    }

                    verticalBoarderCounter++;
                } else if (k % cellSize == 0 && i % cellSize != 0) {
                    c = '|';
                } else if (i % cellSize == 0 || k % cellSize == 0) {
                    c = '-';
                }else {
                    c = board.get(i / 2).get(k / 2).state;
                }
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public void setBoardDimensions() throws FileNotFoundException {
        FileHelper fileHelper = new FileHelper();
        List<String> boardSizesAsString = fileHelper.getBoardSize();
        String state = "";
        for (String s : boardSizesAsString) {
            if (s.equals("size")) {
                state = "size";
            }
            if (state.equals("size") && !s.equals("size")) {
                boardSize = Integer.parseInt(s);
                state = "";
            }
            if (s.equals("cellSize")) {
                state = "cellSize";
            }
            if (state.equals("cellSize") && !s.equals("cellSize")) {
                cellSize = Integer.parseInt(s);
                state = "";
            }
        }
        if (cellSize == 0 || boardSize == 0){
            boardSize = DEFAULT_BOARD_SIZE;
            cellSize = DEFAULT_CELL_SIZE;

        }
    }


    public void placeShip(){

    }

    public void autoPlaceShip(){

    }

    public int getBoardWidth() {
        return boardSize;
    }

    public void setBoardWidth(int boardWidth) {
        this.boardSize = boardWidth;
    }

    public int getCellSize() {
        return cellSize;
    }

    public void setCellSize(int cellSize) {
        this.cellSize = cellSize;
    }
}
