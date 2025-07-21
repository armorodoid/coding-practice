package com.example.CodingQuestions.One;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OneSolutionTest {
    private final QuestionOne questionOne = new QuestionOne();

    @ParameterizedTest
    @MethodSource("provideArraysForSum")
    void testSumWithVariousInputs(int[] input, int expected) {
        assertEquals(expected, questionOne.sumOfArray(input));
    }

    private static Stream<Arguments> provideArraysForSum() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 6),
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{-1, -2}, -3),
                Arguments.of(new int[]{5}, 5),
                Arguments.of(new int[]{10, -10, 5}, 5)
        );
    }
}
