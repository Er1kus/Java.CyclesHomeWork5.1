package ru.netology.sqr;


public class SQRService {
    public int sqrCountIfLimited(int lowLimit, int highLimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x >= lowLimit && x <= highLimit) {
                count++;
            }
        }
        return count;
    }


}
