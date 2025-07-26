package com.example.CodingQuestions.Two;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSolutionTest {
    private final TwoQuestion twoQuestion = new TwoQuestion();

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testTwoSum(int[] nums, int target, boolean expected) {
        boolean result = twoQuestion.twoSum(nums, target);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, true),
                Arguments.of(new int[]{1, 2, 3, 4}, 8, false),
                Arguments.of(new int[]{3, 3}, 6, true),
                Arguments.of(new int[]{-1, -2, -3, -4, -5}, -8, true),
                Arguments.of(new int[]{0, 4, 3, 0}, 0, true),
                Arguments.of(new int[]{}, 1, false)
        );
    }
}
