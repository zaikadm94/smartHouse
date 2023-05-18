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

    @Test
    public void nextRadioNumber1() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(0);
        radio.NextNumberStation();
        int expected = 1;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void getCurrentRadioNumberTest() {
        Radio radio = new Radio();

        radio.setCurrentRadioNumber(3);
        int expected = 3;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void getCurrentRadioNumberTest2() {
        Radio radio = new Radio();

        radio.setCurrentRadioNumber(10);
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void getCurrentRadioNumberTest1() {
        Radio radio = new Radio();

        radio.setCurrentRadioNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevNumberStationTest2() {
        Radio radio = new Radio();

        radio.setCurrentRadioNumber(0);
        radio.prevNumberStation();
        int expected = 9;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberStationTest3() {
        Radio radio = new Radio();

        radio.setCurrentRadioNumber(9);
        radio.prevNumberStation();
        int expected = 8;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void getCurrentVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(35);
        int expected = 35;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void getCurrentVolumeTest2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void getCurrentVolumeTest3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void decreaseVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(38);
        radio.decreaseVolume();
        int expected = 37;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void increaseVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(38);
        radio.increaseVolume();
        int expected = 39;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void negativeDecreaseVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void negativeIncreaseVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
