package ru.netology.java5.services;

public class SQRService {
    public int squaring(int lowLimit, int topLimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int number = i * i;
            if (number >= lowLimit && number <= topLimit) {
                counter++;
            }
        }
        return counter;
    }
}
