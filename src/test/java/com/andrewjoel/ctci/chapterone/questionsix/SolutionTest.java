package com.andrewjoel.ctci.chapterone.questionsix;

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
        solutionOne = new SolutionOneImpl();
    }

    private static Stream<Arguments> prepareTestData() {
        return Stream.of(
                Arguments.of("aabcccccaaa", "a2b1c5a3"),
                Arguments.of("abcdef", "abcdef"),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("prepareTestData")
    @DisplayName("Should pass all test cases")
    void should_pass_all_test_cases(final String input, final String expected) {
        assertEquals(expected, solutionOne.compress(input));
    }
}