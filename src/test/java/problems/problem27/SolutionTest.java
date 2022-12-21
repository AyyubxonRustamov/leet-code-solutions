package problems.problem27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void array1_valueThree_shouldReturn_two() {
        int[] array1 = {3, 2, 2, 3};
        var solution = new Solution(); //problems.problem27
        assertEquals(2, solution.removeElement(array1, 3));
    }

    @Test
    void array2_valueTwo_shouldReturn_five() {
        int[] array2 = {0, 1, 2, 2, 3, 0, 4, 2};
        var solution = new Solution(); //problems.problem27
        assertEquals(5, solution.removeElement(array2, 2));
    }

    @Test
    void emptyArray_valueZero_shouldReturn_zero() {
        int[] emptyArray = {};
        var solution = new Solution(); //problems.problem27
        assertEquals(0, solution.removeElement(emptyArray, 0));
    }

}