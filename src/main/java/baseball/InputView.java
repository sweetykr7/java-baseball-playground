package baseball;

import java.util.Scanner;

public class InputView {
    public InputView() {
        this.scanner = new Scanner(System.in);
    }

    private Scanner scanner;

    public final String numberKeyInput() {
        System.out.print("숫자를 입력해주세요: ");
        String number = this.scanner.nextLine();
        return number;
    }

    public String continueKeyInput() {
        System.out.print("게임을 계속 하시겠습니까?(계속: 1, 종료: 2): ");
        String continueGame = this.scanner.nextLine();
        return continueGame;
    }

    public void closingScanner() {
        this.scanner.close();
    }
}
