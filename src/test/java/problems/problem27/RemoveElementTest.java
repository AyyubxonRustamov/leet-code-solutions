package problems.problem27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveElementTest {

    @Test
    void array1_valueThree_shouldReturn_two() {
        int[] array1 = {3, 2, 2, 3};
        var removeElement = new RemoveElement(); //problems.problem27
        assertEquals(2, removeElement.removeElement(array1, 3));
    }

    @Test
    void array2_valueTwo_shouldReturn_five() {
        int[] array2 = {0, 1, 2, 2, 3, 0, 4, 2};
        var removeElement = new RemoveElement(); //problems.problem27
        assertEquals(5, removeElement.removeElement(array2, 2));
    }

    @Test
    void emptyArray_valueZero_shouldReturn_zero() {
        int[] emptyArray = {};
        var removeElement = new RemoveElement(); //problems.problem27
        assertEquals(0, removeElement.removeElement(emptyArray, 0));
    }

}