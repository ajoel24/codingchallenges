package com.andrewjoel.ctci.chapterone.questionthree;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static Solution solutionOne;

    @BeforeAll
    static void beforeAll() {
        solutionOne = new SolutionOne();
    }

    private static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of("Mr John Smith", "Mr%20John%20Smith"),
                Arguments.of("1 2 3", "1%202%203"),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("testDataProvider")
    @DisplayName("Should pass all test cases successfully")
    void evaluate_tests(final String word, final String expected) {
        assertEquals(expected, solutionOne.toUrl(word));
    }
}