public class Main {
    public static void main(String[] args) {
        // ДЗ Часть 1
        System.out.println("ДЗ Часть 1");
        // Задание 1
        System.out.println("Задание 1");
        int monthlySavings = 15_000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total += total / 100 + monthlySavings;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
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
        double population = 12_000_000;
        int birthsPer1000 = 17;
        int deathsPer1000 = 8;
        for(int y = 1; y <=10; y++) {
            population = population + (population / 1000 * birthsPer1000) - (population / 1000 * deathsPer1000);
            System.out.println("Год " + y + ", численность населения составляет " + Math.round(population) + " человек.");
        }
        // ДЗ Часть 2
        System.out.println("ДЗ Часть 2");
        // Задание 1
        System.out.println("Задание 1");
        double totalSavings = 15_000;
        month = 0;
        while (totalSavings < 12_000_000) {
            totalSavings = totalSavings + totalSavings / 100 * 7;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений составляет " + Math.round(totalSavings) + " рублей.");
        }
        // Задание 2
        System.out.println("Задание 2");
        total = 15_000;
        for (month = 1; total < 12_000_000; month++) {
            total = total + total / 100 * 7;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений составляет " + total + " рублей.");
            }
        }
        // Задание 3
        System.out.println("Задание 3");
        total = 15_000;
        int yearsOfSaving = 9;
        int monthsOfSaving = 12 * yearsOfSaving;
        for (month = 1; month <= monthsOfSaving; month++) {
            total = total + total / 100 * 7;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений составляет " + total + " рублей.");
            }
        }
        // Задание 4
        System.out.println("Задание 4");
        int firstFriday = 2;
        for (int date = firstFriday; date <= 31; date += 7) {
                System.out.println("Сегодня пятница, " + date + " число. Необходимо подготовить отчёт.");
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