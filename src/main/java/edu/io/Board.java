package edu.io;

public class Board {

    final private int DEFAULT_BOARD_WIDTH = 10;
    final private int DEFAULT_BOARD_HEIGHT = 10;

    static private int width;
    static private int height;

    static private int objects = 0;

    static private Token[][] board;

    public Board(int boardWidth, int boardHeight){
        width = boardWidth;
        height = boardHeight;

        board = new Token[height][width];
    }

    public Board(){
        board = new Token[DEFAULT_BOARD_WIDTH][DEFAULT_BOARD_HEIGHT];
    }

    public void appendToken(Token token){
        if(!isBoardFull()){
            board[(objects / height)][objects % width] = token;
            objects++;
        }
    }

    public boolean isBoardFull(){
        return objects == width * height;
    }

    public Token getToken(int number){
        return board[number / height][number % width];
    }

    public Token getToken(int row, int col){
        return board[row][col];
    }

    public void printBoard(){
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                Token t = board[i][j];
                if (t == null){
                    System.out.print("  ");
                } else if (t instanceof EmptyToken) {
                    System.out.print("E ");
                } else if (t instanceof FoodToken) {
                    System.out.print("F ");
                } else if (t instanceof GoldToken) {
                    System.out.print("G ");
                } else if (t instanceof ShovelToken) {
                    System.out.print("S ");
                }
            }
            System.out.println();
        }
    }

    public Token getRandomToken(){
        int n = (int) (Math.random() * (width * height));
        try {
            return getToken(n);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
