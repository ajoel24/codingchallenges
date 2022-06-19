package com.andrewjoel.ctci.chapterone.questionfive;

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

    private static Stream<Arguments> generateTestData() {
        return Stream.of(
                Arguments.of("pale", "ple", true),
                Arguments.of("pales", "pale", true),
                Arguments.of("pale", "bale", true),
                Arguments.of("pale", "bake", false),
                Arguments.of(null, null, false),
                Arguments.of("pale", "rhythm", false)
        );
    }

    @ParameterizedTest
    @MethodSource("generateTestData")
    @DisplayName("Should pass all test cases successfully")
    void executeTests(final String wordOne, final String wordTwo, final boolean expected) {
        assertEquals(expected, solutionOne.isOneAway(wordOne, wordTwo));
    }
}