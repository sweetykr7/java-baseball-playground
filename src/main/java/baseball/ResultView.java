package baseball;

public class ResultView {
    public void printResult(ResultGameDTO resultGameDTO) {
        if (resultGameDTO.getStrike() == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return;
        }
        if (resultGameDTO.getStrike() == 0 && resultGameDTO.getBall() == 0) {
            System.out.println("낫싱");
            return;
        }
        if (resultGameDTO.getStrike() == 0) {
            System.out.println(resultGameDTO.getBall() + " 볼");
            return;
        }
        if (resultGameDTO.getBall() == 0) {
            System.out.println(resultGameDTO.getStrike() + " 스트라이크");
            return;
        }
        System.out.println(resultGameDTO.getStrike() + " 스트라이크 " + resultGameDTO.getBall() + " 볼");
    }
}
