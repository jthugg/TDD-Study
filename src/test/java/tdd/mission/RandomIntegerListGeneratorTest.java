package tdd.mission;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tdd.mission.util.RandomGenerator;

@DisplayName("랜덤 정수 배열 생성 테스트")
public class RandomIntegerListGeneratorTest {

    @Test
    @DisplayName("숫자 배열 생성: 성공")
    void randomIntegerListGenerateTestCase00() {
        System.out.println(RandomGenerator.getPositiveIntegers(0, 100, 4));
    }

    @Test
    @DisplayName("숫자 배열 생성: 실패 - origin > bound")
    void randomIntegerListGenerateTestCase01() {
        System.out.println(Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> RandomGenerator.getPositiveIntegers(101, 100, 4)
        ).getMessage());
    }

    @Test
    @DisplayName("숫자 배열 생성: 실패 - origin == bound")
    void randomIntegerListGenerateTestCase02() {
        System.out.println(Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> RandomGenerator.getPositiveIntegers(100, 100, 4)
        ).getMessage());
    }

    @Test
    @DisplayName("숫자 배열 생성: 실패 - origin < 0")
    void randomIntegerListGenerateTestCase03() {
        System.out.println(Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> RandomGenerator.getPositiveIntegers(-1, 100, 4)
        ).getMessage());
    }

    @Test
    @DisplayName("숫자 배열 생성: 실패 - length == 0")
    void randomIntegerListGenerateTestCase04() {
        System.out.println(Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> RandomGenerator.getPositiveIntegers(101, 100, 0)
        ).getMessage());
    }

    @Test
    @DisplayName("숫자 배열 생성: 실패 - length < 0")
    void randomIntegerListGenerateTestCase05() {
        System.out.println(Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> RandomGenerator.getPositiveIntegers(101, 100, -1)
        ).getMessage());
    }

}
