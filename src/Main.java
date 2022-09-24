public class Main {
    public static void main(String[] args) {
        // ДЗ Часть 1
        System.out.println("ДЗ Часть 1");
        // Задание 1
        System.out.println("Задание 1");
        int monthlySavings = 15_000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + total/100;
            total = total + monthlySavings;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
        // Задание 2
        System.out.println("Задание 2");
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println(" ");
        for (a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println(" ");
        // Задание 3
        System.out.println("Задание 3");
        int population = 12_000_000;
        int birthsPer1000 = 17;
        int deathsPer1000 = 8;
        for(i = 1; i <=10; i++) {
            population = population + (population/1000 * birthsPer1000) - (population/1000 * deathsPer1000);
            System.out.println("Год " + i + ", численность населения составляет " + population + " человек.");
        }
        // ДЗ Часть 2
        System.out.println("ДЗ Часть 2");
        // Задание 1
        System.out.println("Задание 1");
        total = 15_000;
        monthlySavings = 15_000;
        for (i = 1; total <= 12_000_000; i++) {
            total = total + total/100 * 7;
            total = total + monthlySavings;
            System.out.println("Месяц " + i + ", сумма накоплений составляет " + total + " рублей.");
        }
        // Задание 2
        System.out.println("Задание 2");
        total = 15_000;
        monthlySavings = 15_000;
        for (i = 1; total <= 12_000_000; i++) {
            total = total + total / 100 * 7;
            total = total + monthlySavings;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений составляет " + total + " рублей.");
            }
        }
        // Задание 3
        System.out.println("Задание 3");
        total = 15_000;
        monthlySavings = 15_000;
        int monthsIn9Years = 12 * 9;
        for (i = 1; i <= monthsIn9Years; i++) {
            total = total + total / 100 * 7;
            total = total + monthlySavings;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений составляет " + total + " рублей.");
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
        for (int m = 1; m <= 10; m++) {
            System.out.println("2 * " + m + " = " + m * 2);
        }

    }
}