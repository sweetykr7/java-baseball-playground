package baseball;

import java.util.Random;

public class BaseBallGame {

    public BaseBallGame() {
        this.inputView = new InputView();
        this.resultView = new ResultView();
        this.resultGame = new ResultGame();
        this.targetValue = randKeyGenerator();
    }
    private final InputView inputView;
    private final ResultView resultView;
    private final ResultGame resultGame;
    private String targetValue;
    private String inputValue;
    //시작하는 곳 키 입력을 통해서 종료하게함.
    //key input
    //랜덤으로 숫자를 만드는 곳.
    //view해주는 것

    //계산해주는 곳
    public void playBaseBall() {
        System.out.println(targetValue);
        boolean isContinue = true;
        while (isContinue) {
            playGame();
            isContinue = continueGame();
            resetGame(isContinue);
        }
        inputView.closingScanner();
    }

    private void resetGame(boolean isContinue) {
        if (isContinue){
            this.targetValue = randKeyGenerator();
        }
    }

    private boolean continueGame() {
        return inputView.continueKeyInput().equals("1");
    }

    private void playGame() {
        ResultGameDTO resultGame = getGameResult();
        while (!isTarget(resultGame)) {
            this.resultGame.resetResultGameDTO();
            resultGame = getGameResult();
        }
    }

    private ResultGameDTO getGameResult() {
        this.inputValue = inputView.numberKeyInput();
        return this.resultGame.calculateGame(this.targetValue, this.inputValue);
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

    private boolean isTarget(ResultGameDTO resultGameDTO) {
        resultView.printResult(resultGameDTO);
        return resultGameDTO.getStrike() == 3;
    }

}