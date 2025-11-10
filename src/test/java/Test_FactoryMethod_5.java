import edu.io.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Test_FactoryMethod_5 {

    @BeforeAll
    static void init(){
        Board board = new Board(15, 15);
        while(!board.isBoardFull()){
            board.appendToken(NewTokenFactory.createToken(
                    NewTokenFactory.randomType(),
                    NewTokenFactory.randomAmount()
            ));
        }
        board.printBoard();
    }
    @Test
    void EmptyToken_has_only_one_instance() {
        Token emptyToken1 = NewTokenFactory.createToken(Type.EMPTY);
        Token emptyToken2 = NewTokenFactory.createToken(Type.EMPTY);
        Assertions.assertEquals(emptyToken1, emptyToken2);
    }

    @Test
    void GoldToken_pool_is_working() {
        Token goldToken1 = NewTokenFactory.createToken(Type.GOLD);
        Token goldToken2 = NewTokenFactory.createToken(Type.GOLD);
        Assertions.assertEquals(goldToken1, goldToken2);
        goldToken1 = NewTokenFactory.createToken(Type.GOLD, 15);
        goldToken2 = NewTokenFactory.createToken(Type.GOLD, 30);
        Assertions.assertNotEquals(goldToken1, goldToken2);
    }

    @Test
    void FoodToken_pool_is_working() {
        Token foodToken1 = NewTokenFactory.createToken(Type.FOOD);
        Token foodToken2 = NewTokenFactory.createToken(Type.FOOD);
        Assertions.assertEquals(foodToken1, foodToken2);
        foodToken1 = NewTokenFactory.createToken(Type.FOOD, 15);
        foodToken2 = NewTokenFactory.createToken(Type.FOOD, 30);
        Assertions.assertNotEquals(foodToken1, foodToken2);

    }

    @Test
    void ShovelToken_has_different_instances(){
        Token shovelToken1 = NewTokenFactory.createToken(Type.SHOVEL);
        Token shovelToken2 = NewTokenFactory.createToken(Type.SHOVEL);
        Assertions.assertNotEquals(shovelToken1, shovelToken2);
    }

}