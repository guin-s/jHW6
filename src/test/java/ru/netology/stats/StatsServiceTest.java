package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void totalSalesTest() {
        StatsService service = new StatsService();

        long actual = service.TotalSales(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AverageSalesTest() {
        StatsService service = new StatsService();

        long actual = service.AverageSales(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxSalesMonthTest() {
        StatsService service = new StatsService();

        long actual = service.MaxSalesMonth(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinSalesMonthTest() {
        StatsService service = new StatsService();

        long actual = service.MinSalesMonth(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MonthsBelowAverageTEst() {
        StatsService service = new StatsService();

        long actual = service.MonthsBelowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MonthsAboveAverageTEst() {
        StatsService service = new StatsService();

        long actual = service.MonthsAboveAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}