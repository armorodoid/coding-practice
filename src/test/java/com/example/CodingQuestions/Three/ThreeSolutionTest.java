package com.example.CodingQuestions.Three;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeSolutionTest {
    ThreeQuestion threeQuestion = new ThreeQuestion();

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testDiffBetweenEvenAndOdd(int[] input, int expected) {
        assertEquals(expected, threeQuestion.diffBetweenEvenAndOdd(input));
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 5),
                Arguments.of(new int[]{2, 4, 6, 8, 10}, 30),
                Arguments.of(new int[]{1, 3, 5, 7, 9}, 25),
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{0, 0, 0}, 0),
                Arguments.of(new int[]{10}, 10),
                Arguments.of(new int[]{7}, 7),
                Arguments.of(new int[]{-2, -3, -4, -5}, 4),
                Arguments.of(new int[]{-1, 2, -3, 4}, 0),
                Arguments.of(new int[]{2, 2, 2, 3, 3, 3}, 3),
                Arguments.of(new int[]{1000000, 999999}, 1),
                Arguments.of(new int[]{0, 1, 2, 3, 4, 5}, 3),
                Arguments.of(new int[]{1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, 1),
                Arguments.of(new int[]{-10, 0, 10, -1, 1}, 0),
                Arguments.of(new int[]{-4, -3}, 1),
                Arguments.of(new int[]{0, 0}, 0)
        );
    }
}
