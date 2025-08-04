package com.example.CodingQuestions.Four;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FourSolutionTest {
    private final FourSolution fourSolution = new FourSolution();

    @ParameterizedTest
    @MethodSource("palindromeTestCases")
    public void testIsPalindrome(String input, boolean expected) {
        assertEquals(expected, fourSolution.isPalindrome(input));
    }

    private static Stream<Arguments> palindromeTestCases() {
        return Stream.of(
                Arguments.of("", true),
                Arguments.of("a", true),
                Arguments.of("aa", true),
                Arguments.of("ab", false),
                Arguments.of("aba", true),
                Arguments.of("abc", false),
                Arguments.of("abba", true),
                Arguments.of("abccba", true),
                Arguments.of("abcdba", false),
                Arguments.of("Aba", false),
                Arguments.of("racecar", true),
                Arguments.of("12321", true),
                Arguments.of("123321", true),
                Arguments.of("123421", false),
                Arguments.of("!!", true),
                Arguments.of("!@#", false),
                Arguments.of("!@#@!", true),
                Arguments.of("   ", true),
                Arguments.of("a a", true),
                Arguments.of("a ba", false)
        );
    }
}
