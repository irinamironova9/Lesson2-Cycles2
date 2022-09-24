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

    }
}