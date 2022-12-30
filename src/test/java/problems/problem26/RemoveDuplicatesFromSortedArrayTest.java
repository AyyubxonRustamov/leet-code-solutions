package problems.problem26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void array1_shouldReturn_two() {
        var removeDuplicates = new RemoveDuplicatesFromSortedArray(); //problems.problem26
        int[] array1 = {1, 1, 2};
        assertEquals(2, removeDuplicates.removeDuplicates(array1));
    }

    @Test
    void array2_shouldReturn_five() {
        var removeDuplicates = new RemoveDuplicatesFromSortedArray(); //problems.problem26
        int[] array2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, removeDuplicates.removeDuplicates(array2));
    }

    @Test
    void array3_shouldReturn_one() {
        var removeDuplicates = new RemoveDuplicatesFromSortedArray(); //problems.problem26
        int[] array1 = {5};
        assertEquals(1, removeDuplicates.removeDuplicates(array1));
    }
}