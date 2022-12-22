package problems.problem35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void array1_targetFive_shouldReturn_two() {
        int[] array1 = {1, 3, 5, 6};
        var solution = new Solution(); //problems.problem35
        assertEquals(2, solution.searchInsert(array1, 5));
    }

    @Test
    void array1_targetTwo_shouldReturn_one() {
        int[] array1 = {1, 3, 5, 6};
        var solution = new Solution(); //problems.problem35
        assertEquals(1, solution.searchInsert(array1, 2));
    }

    @Test
    void array1_targetSeven_shouldReturn_4() {
        int[] array1 = {1, 3, 5, 6};
        var solution = new Solution(); //problems.problem35
        assertEquals(4, solution.searchInsert(array1, 7));
    }

    @Test
    void emptyArray_targetFive_shouldReturn_zero() {
        int[] array1 = {};
        var solution = new Solution(); //problems.problem35
        assertEquals(0, solution.searchInsert(array1, 5));
    }
}