package ru.netology.javaqa.services;

public class DayOffService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счетчик месяцев
        int money = 0; // количество денег

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = money - expenses;
                money = money / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}

