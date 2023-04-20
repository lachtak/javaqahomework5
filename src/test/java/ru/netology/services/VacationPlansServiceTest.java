package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationPlansServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacation.csv")
    public void vacmonth(int expected, int income, int expense, int threshold) {
        VacationPlansService service = new VacationPlansService();

        //int expected = 3;
        int actual = service.calculate(income, expense, threshold);
        Assertions.assertEquals(expected, actual);
    }
//    @Test
//  public void vacmonth2() {
//
//        VacationPlansService service = new VacationPlansService();
//
//        int expected = 2;
//        int actual = service.calculate(100_000, 60_000, 150_000);
//        Assertions.assertEquals(expected, actual);
//    }
}
