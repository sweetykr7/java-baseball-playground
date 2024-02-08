package study;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void splitTest() {
        String[] actual = "1,2".split(",");
        assertThat(actual).contains("1","2");
        String[] actual2 = "1".split(",");
        assertThat(actual2).containsExactly("1");
    }

    String removeBraket(String input) {
        return input.substring(1, input.length() - 1);
    }

    @Test
    void test(){
        System.out.println(removeBraket("(1,2)"));
        System.out.println(getCharAt("abc", 1));
        assertThatThrownBy(()->{
            throw new IOException("test");
        })
                .isInstanceOf(IOException.class)
                .hasMessageContaining("test");
    }

    char getCharAt(String str,int num) {
        return str.charAt(num);
    }
}
