import edu.io.*;
import edu.io.token.Token;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_FactoryMethod_4 {
    @Test
    void EmptyToken_has_only_one_instance() {
        Token emptyToken1 = TokenFactory.createEmptyToken();
        Token emptyToken2 = TokenFactory.createEmptyToken();
        Assertions.assertEquals(emptyToken1, emptyToken2);
    }

    @Test
    void GoldToken_pool_is_working() {
        Token goldToken1 = TokenFactory.createGoldToken(100);
        Token goldToken2 = TokenFactory.createGoldToken(100);
        Assertions.assertEquals(goldToken1, goldToken2);
    }

    @Test
    void FoodToken_pool_is_working() {
        Token foodToken1 = TokenFactory.createFoodToken(100);
        Token foodToken2 = TokenFactory.createFoodToken(100);
        Assertions.assertEquals(foodToken1, foodToken2);
    }

    @Test
    void ShovelToken_has_different_instances(){
        Token shovelToken1 = TokenFactory.createShovelToken(10);
        Token shovelToken2 = TokenFactory.createShovelToken(10);
        Assertions.assertNotEquals(shovelToken1, shovelToken2);
    }

}