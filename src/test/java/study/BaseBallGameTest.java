package study;

import baseball.InputView;
import baseball.ResultGame;
import baseball.ResultGameDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class BaseBallGameTest {
//    @Test
//    void inputValueTest() {
//        InputView inputView = new InputView();
//        String keyInputValue = inputView.keyInput();
//        Assertions.assertEquals(keyInputValue, "test");
//    }
    @Nested
    class ResultGameTest{

        @Test
        void calculateGameTest() {
            ResultGame resultGame = new ResultGame();
            ResultGameDTO returnDto = resultGame.calculateGame("123","152");
            Assertions.assertEquals(1, returnDto.getBall());
            Assertions.assertEquals(1, returnDto.getStrike());

            ResultGame resultGame2 = new ResultGame();
            ResultGameDTO returnDto2 = resultGame2.calculateGame("518","351");
            Assertions.assertEquals(2, returnDto2.getBall());
            Assertions.assertEquals(0, returnDto2.getStrike());
        }

    }

}
