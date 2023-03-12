package ru.netology.stats;

public class StatsService {
    public long summa(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;

        }
        return totalSale;


    }

    public long average(long[] sales) {
        return summa(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int middleMinAverage(long[] sales) {
        long averageSale = average(sales);
        int resultMin = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                resultMin++;
            }
        }
        return resultMin;
    }
    public int middleMaxAverage(long[] sales) {
        long averageSale = average(sales);
        int resultMax = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                resultMax++;
            }
        }
        return resultMax;
    }
}

