package ru.netology.javaqa;

import ru.netology.javaqa.services.DayOffService;

public class Main {
    public static void main(String[] args) {
        DayOffService service = new DayOffService();

        int income = 100_000; // заработок
        int expence = 60_000; // обязательные траты
        int threshold = 150_000; // Нужно для отдыха


        int result = service.calculate(income, expence, threshold);
        System.out.println(result);
    }
}