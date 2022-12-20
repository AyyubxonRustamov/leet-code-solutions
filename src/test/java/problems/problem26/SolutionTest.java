package problems.problem26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void array1_shouldReturn_two(){
        var solution = new Solution();
        int[] array1 = {1,1,2};
        assertEquals(2, solution.removeDuplicates(array1));
    }

    @Test
    void array2_shouldReturn_five(){
        var solution = new Solution();
        int[] array2 = {0,0,1,1,1,2,2,3,3,4};
        assertEquals(5, solution.removeDuplicates(array2));
    }

    @Test
    void array3_shouldReturn_one(){
        var solution = new Solution();
        int[] array1 = {5};
        assertEquals(1, solution.removeDuplicates(array1));
    }
}