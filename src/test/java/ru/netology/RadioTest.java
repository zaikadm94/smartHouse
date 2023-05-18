package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void nextRadioNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(9);
        radio.NextNumberStation();
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }
}
