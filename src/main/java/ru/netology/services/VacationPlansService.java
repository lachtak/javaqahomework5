package ru.netology.services;

public class VacationPlansService {

    public int calculate(int income, int expense, int threshold) {
        int count = 0; // Счётчик месяцев отдыха
        int money = 0;// Количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = (money - expense) / 3;
            } else {
                money = money + (income - expense);
            }

        }
        return count;
    }
}

