package model;


import utils.FileHelper;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Board {

    private int boardWidth = 0;
    private int boardHeight = 0;
    private final int DEFAULT_BOARD_WIDTH = 10;
    private final int DEFAULT_BOARD_HEIGHT = 10;


    List<List<Tile>> board = new ArrayList<>();

    public void populateList(){
        for (int i = 0; i < boardWidth; i++){
            for (int j = 0; j < boardHeight; j++){
                board.get(i).add(new Tile());
            }
        }
    }

    public void setBoardDimensions() throws FileNotFoundException {
        FileHelper fileHelper = new FileHelper();
        List<String> boardSizesAsString = fileHelper.getBoardSize();
        String state = "";
        for (String s : boardSizesAsString) {
            if (s.equals("width")) {
                state = "width";
            }
            if (state.equals("width")) {
                boardWidth = Integer.parseInt(s);
                state = "";
            }
            if (s.equals("height")) {
                state = "height";
            }
            if (state.equals("height")) {
                boardHeight = Integer.parseInt(s);
                state = "";
            }
        }
        if (boardHeight == 0 || boardWidth == 0){
            boardWidth = DEFAULT_BOARD_WIDTH;
            boardHeight = DEFAULT_BOARD_HEIGHT;

        }
    }




    public int getBoardWidth() {
        return boardWidth;
    }

    public void setBoardWidth(int boardWidth) {
        this.boardWidth = boardWidth;
    }

    public int getBoardHeight() {
        return boardHeight;
    }

    public void setBoardHeight(int boardHeight) {
        this.boardHeight = boardHeight;
    }
}
