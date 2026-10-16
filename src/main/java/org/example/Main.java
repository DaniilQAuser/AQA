package org.example;

public class Main {
    public static void main(String[] args) {
        int age = 30;
        double salary = 100.5;
        String name = "Ivan";
        boolean isQA = true;

        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Зарплата: " + salary);
        System.out.println("QA: " + isQA);

        if (age >= 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Несовершеннолетний");
        }

        System.out.println("--- Считаем от 1 до 10 ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("--- Чётные числа от 1 до 20 ---");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("--- Обратный отсчёт ---");
        int count = 10;
        while (count >= 1) {
            System.out.println(count);
            count--;
        }
        System.out.println("Поехали!");

        int result = sum(5, 3);
        System.out.println("Сумма: " + result);

        System.out.println("5 + 3 = " + calculate(5, 3, "+"));
        System.out.println("5 - 3 = " + calculate(5, 3, "-"));
        System.out.println("5 * 3 = " + calculate(5, 3, "*"));
        System.out.println("10 / 4 = " + calculate(10, 4, "/"));
        System.out.println("5 ? 3 = " + calculate(5, 3, "?"));
        System.out.println("4 — " + evenOrOdd(4));
        System.out.println("7 — " + evenOrOdd(7));
        System.out.println("0 — " + evenOrOdd(0));
        System.out.println("hello → " + reverse("hello"));
        System.out.println("Java → " + reverse("Java"));
        System.out.println("a → " + reverse("a"));
        System.out.println("пусто → [" + reverse("") + "]");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double calculate(double a, double b, String operation) {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                System.out.println("Неизвестная операция: " + operation);
                return 0;
        }
    }

    static String evenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Чётное";
        } else {
            return "Нечётное";
        }
    }

    static String reverse(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }
}