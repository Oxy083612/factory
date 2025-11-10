package edu.io.token;

public class FoodToken extends Token {
    final public int amount;

    public FoodToken(int amount){
        super("Food");
        this.amount = amount;
    }

    public int amount(){
        return this.amount;
    }
}
