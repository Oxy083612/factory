package edu.io.token;

public class GoldToken extends Token {
    final public int amount;

    public GoldToken(int amount){
        super("Gold");
        this.amount = amount;
    }

    public int amount(){
        return this.amount;
    }
}
