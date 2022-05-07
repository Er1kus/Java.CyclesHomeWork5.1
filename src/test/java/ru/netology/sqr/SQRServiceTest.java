package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = {"/testarea.csv"})
    public void testCsvData(int lowLimit, int highLimit, int expected) {
        SQRService service = new SQRService();

        int actual = service.sqrCountIfLimited(lowLimit, highLimit);
        //int expected = 17;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNegativeValues() {
        SQRService service = new SQRService();

        int actual = service.sqrCountIfLimited(-6000, -1000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testOverTheLimit() {
        SQRService service = new SQRService();

        int actual = service.sqrCountIfLimited(9999, 100000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}
