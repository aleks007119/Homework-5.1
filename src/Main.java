public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №1");
        System.out.println("Задание 1");

        for (int i = 1; i <= 10; i ++) {
            System.out.println("Значение " + i);
        }

        System.out.println("Задание 2");

        for (int i = 10; i >= 1; i --) {
            System.out.println("Значение " + i);
        }

        System.out.println("Задание 3");

        for (int i = 0; i <= 17; i = i + 2) {
                System.out.println("Четные числа " + i);
        }

        System.out.println("Задание 4");

        for (int i = 10; i >= -10; i --) {
            System.out.println(i);
        }

        System.out.println("Домашнее задание №2");
        System.out.println("Задание 1");

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным.");
        }

        System.out.println("Задание 2");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Задание 3");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Домашнее задание №3");
        System.out.println("Задание 1");

        int savings = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i ++) {
            total = total + savings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей.");
        }

        System.out.println("Задание 2");

        double sumWithPercent = 0;
        double percent = 0.01;
        for (int i = 1; i <= 12; i++) {
            sumWithPercent = (sumWithPercent + savings) * (1 + percent);
            System.out.println("Месяц " + i + " сумма накоплений равна " + sumWithPercent + " рублей.");
        }



    }
}