package basics;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AssertJTest {

    @Test
    public void testAssertJMatchers() {
        //give
        String text = "abc";
        String[] textArray = {"abc", "def", "omg"};
        //when

        //then
        Assertions.assertThat(textArray)
                .hasSize(3)
                .contains(text)
                .contains("omg")
                .doesNotContain("aaaaaa");
    }

    @Test
    public void shouldAddTwoNumbers() {
        //given
        int num1 = 5;
        int num2 = -1;

        //when
        int result = num1 + num2;

        //then
        assertThat(result)
                .isEqualTo(4)
                .isNotEqualTo(6)
                .isLessThan(200)
                .isGreaterThan(-15)
                .isBetween(-99, 8);
    }
}
