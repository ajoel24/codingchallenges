package com.andrewjoel.ctci.chapterone.questionone;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTwoImplTest {
    private static Solution solution;

    @BeforeAll
    static void beforeAll() {
        solution = new SolutionTwoImpl();
    }

    @ParameterizedTest
    @MethodSource("com.andrewjoel.ctci.chapterone.questionone.utils.QuestionOneUtils#prepareTestData")
    void evaluate_tests(final String word, final boolean expectedResult) {
        assertEquals(expectedResult, solution.isUnique(word));
    }

}