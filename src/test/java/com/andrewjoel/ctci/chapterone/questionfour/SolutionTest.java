package com.andrewjoel.ctci.chapterone.questionfour;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static Solution solutionOne;
    private static Solution solutionTwo;

    @BeforeAll
    static void beforeAll() {
        solutionOne = new SolutionOneImpl();
        solutionTwo = new SolutionTwoImpl();
    }

    private static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of("aabbc", true),
                Arguments.of("abc", false),
                Arguments.of("abcba", true),
                Arguments.of("yee", true),
                Arguments.of("malayalam", true),
                Arguments.of("racecar", true),
                Arguments.of("aaa", true),
                Arguments.of("aaaabbbbcccc", true),
                Arguments.of("aaaabbbbccccde", false),
                Arguments.of("", false)
        );
    }

    @ParameterizedTest
    @MethodSource("testDataProvider")
    @DisplayName("Should pass all test cases successfully")
    void evaluate_tests(final String word, final boolean expected) {
        assertEquals(expected, solutionOne.isPalindromePermutation(word));
        assertEquals(expected, solutionTwo.isPalindromePermutation(word));
    }

}