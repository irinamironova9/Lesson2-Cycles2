public class Main {
    public static void main(String[] args) {
        // ДЗ Часть 1
        System.out.println("ДЗ Часть 1");
        // Задание 1
        System.out.println("Задание 1");
        int monthlySavings = 15_000;
        int total = 0;
        int m = 0; // m - month (здесь и далее кол-во месяцев)
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + monthlySavings;
            m = m + 1;
            System.out.println("Месяц " + m + ", сумма накоплений равна " + total + " рублей.");
        }
        // Задание 2
        System.out.println("Задание 2");
        int d = 1;
        while (d <= 10) {
            System.out.print(d + " ");
            d++;
        }
        System.out.println();
        for (d = 10; d >= 1; d--) {
            System.out.print(d + " ");
        }
        System.out.println();
        // Задание 3
        System.out.println("Задание 3");
        int population = 12_000_000;
        int birthsPer1000 = 17;
        int deathsPer1000 = 8;
        for(int y = 1; y <=10; y++) {
            population = population + (population / 1000 * birthsPer1000) - (population / 1000 * deathsPer1000);
            System.out.println("Год " + y + ", численность населения составляет " + population + " человек.");
        }
        // ДЗ Часть 2
        System.out.println("ДЗ Часть 2");
        // Задание 1
        System.out.println("Задание 1");
        total = 15_000;
        m = 0;
        while (total < 12_000_000) {
            total = total + total / 100 * 7;
            m++;
            System.out.println("Месяц " + m + ", сумма накоплений составляет " + total + " рублей.");
        }
        // Задание 2
        System.out.println("Задание 2");
        total = 15_000;
        for (m = 1; total < 12_000_000; m++) {
            total = total + total / 100 * 7;
            if (m % 6 == 0) {
                System.out.println("Месяц " + m + ", сумма накоплений составляет " + total + " рублей.");
            }
        }
        // Задание 3
        System.out.println("Задание 3");
        total = 15_000;
        int yearsOfSaving = 9;
        int monthsOfSaving = 12 * yearsOfSaving;
        for (m = 1; m <= monthsOfSaving; m++) {
            total = total + total / 100 * 7;
            if (m % 6 == 0) {
                System.out.println("Месяц " + m + ", сумма накоплений составляет " + total + " рублей.");
            }
        }
        // Задание 4
        System.out.println("Задание 4");
        int firstFriday = 2;
        for (int date = 1; date <= 31; date++) {
            if (date == firstFriday || (date - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + date + " число. Необходимо подготовить отчёт.");
            }
        }
        // ДЗ Часть 3
        System.out.println("ДЗ Часть 3");
        // Задание 1
        System.out.println("Задание 1");
        int year = 2022;
        int years200Before = year - 200;
        int years100After = year + 100;
        for (int y = 0; y <= years100After; y++) {
            if (y % 79 == 0 && y >= years200Before) {
                System.out.println(y);
            }
        }
        // Задание 2
        System.out.println("Задание 2");
        for (int n = 1; n <= 10; n++) {
            System.out.println("2 * " + n + " = " + n * 2);
        }

    }
}