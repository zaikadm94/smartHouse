package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void nextRadioNumber() {
        radio.setCurrentRadioNumber(9);
        radio.NextNumberStation();
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioNumber1() {
        radio.setCurrentRadioNumber(0);
        radio.NextNumberStation();
        int expected = 1;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void getCurrentRadioNumberTest() {
        radio.setCurrentRadioNumber(3);
        int expected = 3;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void getCurrentRadioNumberTest2() {

        radio.setCurrentRadioNumber(10);
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void getCurrentRadioNumberTest1() {

        radio.setCurrentRadioNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevNumberStationTest2() {

        radio.setCurrentRadioNumber(0);
        radio.prevNumberStation();
        int expected = 9;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberStationTest3() {

        radio.setCurrentRadioNumber(9);
        radio.prevNumberStation();
        int expected = 8;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMaxStationTest() {
        radio.getMaxStation();
        int expected = 9;
        int actual = radio.getMaxStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void getMinStation() {
        radio.getMinStation();
        int expected = 0;
        int actual = radio.getMinStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void constructorTest1() {
        Radio radio = new Radio(5);

        Assertions.assertEquals(4, radio.getMaxStation());

    }

    @Test
    public void constructorTest2() {
        Radio radio = new Radio(-1);
        Assertions.assertEquals(0, radio.getMinStation());
    }


    @Test
    public void getCurrentVolumeTest() {

        radio.setCurrentVolume(35);
        int expected = 35;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void getCurrentVolumeTest2() {

        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void getCurrentVolumeTest3() {

        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void getMaxVolumeTest() {
        radio.getMaxVolume();
        int expected = 100;
        int actual = radio.getMaxVolume();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void getMinVolumeTest() {
        radio.getMinVolume();
        int expected = 0;
        int actual = radio.getMinVolume();
        Assertions.assertEquals(expected,actual);
    }

    @Test

    public void decreaseVolumeTest() {

        radio.setCurrentVolume(38);
        radio.decreaseVolume();
        int expected = 37;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void increaseVolumeTest() {

        radio.setCurrentVolume(38);
        radio.increaseVolume();
        int expected = 39;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void negativeDecreaseVolumeTest() {

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void negativeIncreaseVolumeTest() {

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
