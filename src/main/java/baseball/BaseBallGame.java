package baseball;

import java.util.Random;

public class BaseBallGame {

    public BaseBallGame() {
        this.inputView = new InputView();
        this.resultGame = new ResultGame();
        this.targetValue = randKeyGenerator();
    }
    private final InputView inputView;
    private final ResultGame resultGame;
    private String targetValue;
    private String inputValue;
    //시작하는 곳 키 입력을 통해서 종료하게함.
    //key input
    //랜덤으로 숫자를 만드는 곳.
    //view해주는 것

    //계산해주는 곳
    public void playBaseBall() {
        this.inputValue = inputView.keyInput();
        ResultGameDTO resultGameDTO = this.resultGame.calculateGame(this.targetValue, this.inputValue);
        System.out.println("targetValue: "+ this.targetValue);
        System.out.println("Strike: " + resultGameDTO.getStrike() + " Ball: " + resultGameDTO.getBall());
    }

    private String randKeyGenerator() {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int num = rand.nextInt(10);
            sb.append(num);
        }
        return sb.toString();
    }


}