package edu.io;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(15, 15);

        while(!board.isBoardFull()){
            board.appendToken(TokenFactory.createGoldToken(10));
        }
        board.printBoard();

        Token token1 = board.getRandomToken();
        Token token2 = board.getRandomToken();
        System.out.println(token1);
        System.out.println(token2);
    }
}