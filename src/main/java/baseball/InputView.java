package baseball;

import java.util.Scanner;

public class InputView {

    public final String keyInput() {
        Scanner scanner = new Scanner(System.in); // System.in은 키보드 입력을 의미합니다.

        System.out.print("숫자를 입력해주세요: "); // 사용자에게 이름 입력을 요청합니다.
        String number = scanner.nextLine(); // 사용자가 입력한 이름을 읽습니다.
        scanner.close(); // 스캐너 사용이 끝났으므로 닫아줍니다.
        return number;
    }
}
