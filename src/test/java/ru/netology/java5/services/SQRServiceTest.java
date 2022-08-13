package ru.netology.java5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void numberOfSquaresInRheInterval200_300() {
        SQRService service = new SQRService();
        int lowLimit = 200;
        int topLimit = 300;
        int SqrNumber = service.squaring(lowLimit, topLimit);
        Assertions.assertEquals(3, SqrNumber, "Ожидаемый результат ");
    }

    @Test
    public void numberOfSquaresInRheInterval30_40() {
        SQRService service = new SQRService();
        int lowLimit = 30;
        int topLimit = 40;
        int SqrNumber = service.squaring(lowLimit, topLimit);
        Assertions.assertEquals(0, SqrNumber, "Ожидаемый результат ");
    }

    @Test
    public void numberOfSquaresInRheInterval100_110() {
        SQRService service = new SQRService();
        int lowLimit = 100;
        int topLimit = 110;
        int SqrNumber = service.squaring(lowLimit, topLimit);
        Assertions.assertEquals(1, SqrNumber, "Ожидаемый результат ");
    }
}
