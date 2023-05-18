package ru.netology;


public class Radio {
    private int currentRadioNumber;
    private int currentVolume;

    public int getCurrentRadioNumber() {

        return currentRadioNumber;
    }

    public void setCurrentRadioNumber(int newCurrentRadioNumber) {
        if (newCurrentRadioNumber < 0) {
            return;
        }
        if (newCurrentRadioNumber > 9) {
            return;
        }
        currentRadioNumber = newCurrentRadioNumber;
    }

    public void NextNumberStation() {
        if (currentRadioNumber == 9) {
            setCurrentRadioNumber(0);
        } else {
            currentRadioNumber++;
        }
    }

    public void prevNumberStation() {
        if (currentRadioNumber == 0) {
            setCurrentRadioNumber(9);
        } else {
            currentRadioNumber--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            setCurrentVolume(currentVolume ++);
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            setCurrentVolume(currentVolume --);
        }
    }
}

