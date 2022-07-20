package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int nextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            setCurrentStation(0);
        }
        return currentStation;
    }

    public int prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            return 9;
        }
        return currentStation;
    }

    public int getVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 1) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
        return currentVolume;
    }

    public int prevVolume() {
        if (currentVolume > 1) {
            currentVolume = currentVolume - 1;
        } else {
            return 1;
        }
        return currentVolume;
    }
}