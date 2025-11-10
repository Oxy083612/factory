package edu.io;
import java.util.HashMap;
import java.util.Map;

public class TokenFactory {
    static final private int DEFAULT_GOLD_TOKEN_AMOUNT = 10;
    static final private int DEFAULT_FOOD_TOKEN_AMOUNT = 10;
    static final private int DEFAULT_SHOVEL_TOKEN_DURABILITY = 30;

    static private EmptyToken emptyToken;
    static private Map<Integer, GoldToken> goldPool = new HashMap<>();
    static private Map<Integer, FoodToken> foodPool = new HashMap<>();

    static public EmptyToken createEmptyToken(){
        if(emptyToken == null){
            emptyToken = new EmptyToken();
            return emptyToken;
        } else {
            return emptyToken;
        }
    }

    static public GoldToken createGoldToken(){
        if(goldPool.containsKey(DEFAULT_GOLD_TOKEN_AMOUNT)){
            return goldPool.get(DEFAULT_GOLD_TOKEN_AMOUNT);
        } else {
            GoldToken token = new GoldToken(DEFAULT_GOLD_TOKEN_AMOUNT);
            goldPool.put(DEFAULT_GOLD_TOKEN_AMOUNT, token);
            return token;
        }
    }
    static public GoldToken createGoldToken(int amount){
        if(goldPool.containsKey(amount)){
            return goldPool.get(amount);
        } else {
            GoldToken token = new GoldToken(amount);
            goldPool.put(amount, token);
            return token;
        }
    }

    static public FoodToken createFoodToken(){
        if(foodPool.containsKey(DEFAULT_FOOD_TOKEN_AMOUNT)){
            return foodPool.get(DEFAULT_FOOD_TOKEN_AMOUNT);
        } else {
            FoodToken token = new FoodToken(DEFAULT_FOOD_TOKEN_AMOUNT);
            foodPool.put(DEFAULT_FOOD_TOKEN_AMOUNT, token);
            return token;
        }
    }
    static public FoodToken createFoodToken(int amount){
        if(foodPool.containsKey(amount)){
            return foodPool.get(amount);
        } else {
            FoodToken token = new FoodToken(amount);
            foodPool.put(amount, token);
            return token;
        }
    }

    static public ShovelToken createShovelToken(){
        return new ShovelToken(DEFAULT_SHOVEL_TOKEN_DURABILITY);
    }
    static public ShovelToken createShovelToken(int durability){
        return new ShovelToken(durability);
    }


}
