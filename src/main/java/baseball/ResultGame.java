package baseball;

public class ResultGame {
    public ResultGame() {
        this.resultGameDTO = new ResultGameDTO();
        resultGameDTO.setBall(0);
        resultGameDTO.setStrike(0);
    }
    ResultGameDTO resultGameDTO;


    public ResultGameDTO calculateGame(String targetValue, String inputValue) {
        for (int i = 0; i < 3; ++i) {
            checkTarget(targetValue, targetValue.substring(i, i + 1), inputValue.substring(i, i + 1));
        }
        return this.resultGameDTO;
    }

    private void checkTarget(String targetValue, String targetChar, String inputChar) {
        if (targetChar.equals(inputChar)) {
            resultGameDTO.setStrike(resultGameDTO.getStrike() + 1);
            return;
        }
        if (targetValue.contains(inputChar)) {
            resultGameDTO.setBall(resultGameDTO.getBall() + 1);
        }
    }

    public void resetResultGameDTO() {
        this.resultGameDTO.setBall(0);
        this.resultGameDTO.setStrike(0);
    }

}

