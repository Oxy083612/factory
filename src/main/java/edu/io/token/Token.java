package edu.io.token;

public abstract class Token {
    final public String label;

    public Token(String label){
        this.label = label;
    }

    public String getLabel(){
        return label;
    }
}
