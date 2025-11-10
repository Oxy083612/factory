package edu.io;

public class ShovelToken extends Token {
    final public int durability;

    public ShovelToken(int durability){
        super("Shovel");
        this.durability = durability;
    }

    public int durability(){
        return this.durability;
    }
}
