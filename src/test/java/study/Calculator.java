package study;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Calculator {
    @Test
    void calculate(){
        String str = "2 + 3 * 4 / 2";
        String[] values = str.split(" ");
        int sum = 0;
        int prev = 0;
        prev = Integer.parseInt(values[0]);
        for (int i = 1; i < values.length; ++i) {
            switch (values[i]) {
                case "+":
                    sum = prev + Integer.parseInt(values[i + 1]);
                    break;
                case "*":
                    sum = prev * Integer.parseInt(values[i + 1]);
                    break;
                case "/":
                    sum = prev / Integer.parseInt(values[i + 1]);
                    break;
                case "-":
                    sum = prev - Integer.parseInt(values[i + 1]);
                    break;
            }
            prev = sum;
            System.out.println(sum);
        }
        System.out.println("total : " + sum);
    }

}
