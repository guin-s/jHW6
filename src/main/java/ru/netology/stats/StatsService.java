package ru.netology.stats;

public class StatsService {
    public long TotalSales(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public long AverageSales(long[] sales) {
        return TotalSales(sales) / sales.length;

    }

    public int MaxSalesMonth(long[] sales) {
        int maxMonth = 0;
        long maxSales = sales[0];
        for (int i = 0; i < sales.length; i++)
            if (sales[i] >= maxSales) {
                maxSales = sales[i];
                maxMonth = i;
            }
        return maxMonth + 1;
    }

    public int MinSalesMonth(long[] sales) {
        int minMonth = 0;
        long minSales = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSales) {
                minSales = sales[i];
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int MonthsBelowAverage(long[] sales) {
        int counterMBA = 0;
        long AverageSale = AverageSales(sales);
        for (long sale : sales) {
            if (sale < AverageSale) {
                counterMBA++;
            }
        }
        return counterMBA;
    }

    public int MonthsAboveAverage(long[] sales) {
        int counterMAA = 0;
        long AverageSale = AverageSales(sales);
        for (long sale : sales) {
            if (sale > AverageSale) {
                counterMAA++;
            }
        }
        return counterMAA;
    }
}

