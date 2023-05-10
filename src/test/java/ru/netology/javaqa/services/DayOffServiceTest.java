package ru.netology.javaqa.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class DayOffServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/dayOff.csv")
    public void test(int expected, int income, int expenses, int threshold) {
        DayOffService service = new DayOffService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
