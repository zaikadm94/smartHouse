package ru.netology;


public class Radio {
    private int quantityStation = 10;
    private int minStation = 0;
    private int maxStation = quantityStation - 1;
    private int currentRadioNumber = minStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio(int quantityStation) {
        if (quantityStation < minStation) {
            return;
        } else {
            this.quantityStation = quantityStation;
        }
        this.maxStation = quantityStation - 1;
    }

    ;

    public Radio() {

    }

    ;

    public int getCurrentRadioNumber() {

        return currentRadioNumber;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setCurrentRadioNumber(int newCurrentRadioNumber) {
        if (newCurrentRadioNumber < minStation) {
            return;
        }
        if (newCurrentRadioNumber > maxStation) {
            return;
        }
        currentRadioNumber = newCurrentRadioNumber;
    }

    public void NextNumberStation() {
        if (currentRadioNumber == maxStation) {
            setCurrentRadioNumber(minStation);
        } else {
            currentRadioNumber++;
        }
    }

    public void prevNumberStation() {
        if (currentRadioNumber == minStation) {
            setCurrentRadioNumber(maxStation);
        } else {
            currentRadioNumber--;
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            setCurrentVolume(currentVolume - 1);
        }
    }
}

