package com.andrewjoel.ctci.chapterone.questionone;

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

    private static Stream<Arguments> prepareTestData() {
        return Stream.of(
                Arguments.of("12345", true),
                Arguments.of("122345", false),
                Arguments.of("", true),
                Arguments.of("****", false),
                Arguments.of(null, true)
        );
    }

    @ParameterizedTest
    @MethodSource("prepareTestData")
    @DisplayName("Should pass all test cases successfully")
    void evaluate_tests(final String word, final boolean expectedResult) {
        assertEquals(expectedResult, solutionOne.isUnique(word));
        assertEquals(expectedResult, solutionTwo.isUnique(word));
    }
}
