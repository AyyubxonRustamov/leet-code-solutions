package problems.problem171;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExcelSheetColumnNumberTest {

    @Test
    void ABC_shouldReturn_sevenHundredThirtyOne() {
        var excelSheetColumnNumber = new ExcelSheetColumnNumber(); //problems.problem171
        assertEquals(731, excelSheetColumnNumber.titleToNumber("ABC"));
    }

    @Test
    void A_shouldReturn_one() {
        var excelSheetColumnNumber = new ExcelSheetColumnNumber(); //problems.problem171
        assertEquals(1, excelSheetColumnNumber.titleToNumber("A"));
    }

    @Test
    void AB_shouldReturn_twentyEight() {
        var excelSheetColumnNumber = new ExcelSheetColumnNumber(); //problems.problem171
        assertEquals(28, excelSheetColumnNumber.titleToNumber("AB"));
    }

    @Test
    void ZY_shouldReturn_sevenHundredOne() {
        var excelSheetColumnNumber = new ExcelSheetColumnNumber(); //problems.problem171
        assertEquals(701, excelSheetColumnNumber.titleToNumber("ZY"));
    }
}