package com.andrewjoel.ctci.chapterone.questiontwo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    private static Solution solutionOne;
    private static Solution solutionTwo;

    @BeforeAll
    static void beforeAll() {
        solutionOne = new SolutionOneImpl();
        solutionTwo = new SolutionTwoImpl();
    }

    private static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of("abcd", "abdc", true),
                Arguments.of("123", "12", false),
                Arguments.of("123456", "122456", false),
                Arguments.of("", "", true),
                Arguments.of(null, null, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testDataProvider")
    @DisplayName("Should pass all test cases")
    void should_pass_all_test_cases(final String wordOne, final String wordTwo, final boolean expected) {
        assertEquals(expected, solutionOne.isPermutation(wordOne, wordTwo));
        assertEquals(expected, solutionTwo.isPermutation(wordOne, wordTwo));
    }
}
