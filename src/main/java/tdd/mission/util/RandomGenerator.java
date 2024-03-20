package tdd.mission.util;

import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {

    private static final Random random = new Random();

    public static List<Integer> getPositiveIntegers(int origin, int bound, int length) {
        Assert.isTrue(origin >= 0 && bound > 0 && length > 0, "[ERROR] 양수만 입력하세요.");
        Assert.isTrue(bound > origin, "[ERROR] bound는 origin 보다 커야합니다.");
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < length) {
            numbers.add(random.nextInt(origin, bound));
        }
        return List.copyOf(numbers);
    }

}
