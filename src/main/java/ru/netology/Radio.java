package ru.netology;

public class Radio {
    private int minCurrentStation = 0;
    private int maxCurrentStation = 9;
    private int minCurrentVolume = 0;
    private int maxCurrentVolume = 100;
    private int currentStation = minCurrentStation;
    private int currentVolume = minCurrentVolume;

    public Radio() {
        this.maxCurrentStation = 9;
    }

    public Radio(int stationCount) {
        this.maxCurrentStation = stationCount - 1;
    }

    public Radio(int numRadio, int sizeVolume) {
        if (numRadio >= minCurrentStation && numRadio <= maxCurrentStation) {
            setCurrentStation(numRadio);
        } else {
            currentStation = minCurrentStation;
        }
        if (sizeVolume >= minCurrentVolume && sizeVolume <= maxCurrentVolume) {
            setCurrentVolume(sizeVolume);
        } else {
            currentVolume = minCurrentVolume;
        }

    }

    public void setCurrentStation(int numRadio) {
        if (numRadio >= minCurrentStation && numRadio <= maxCurrentStation) {
            currentStation = numRadio;
        } else if (numRadio > maxCurrentStation) {
            currentStation = maxCurrentStation;
        } else if (numRadio < minCurrentStation) {
            currentStation = minCurrentStation;
        }
    }


    public void setCurrentVolume(int sizeVolume) {
        if (sizeVolume <= minCurrentVolume) {
            sizeVolume = minCurrentVolume;

        }
        if (sizeVolume <= maxCurrentVolume) {
            currentVolume = sizeVolume;
        } else {
            currentVolume = maxCurrentVolume;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinCurrentStation() {
        return minCurrentStation;
    }

    public int getMaxCurrentStation() {
        return maxCurrentStation;
    }

    public int getMinCurrentVolume() {
        return minCurrentVolume;
    }

    public int getMaxCurrentVolume() {
        return maxCurrentVolume;
    }

    public void next() {
        if (currentStation == maxCurrentStation) {
            currentStation = minCurrentStation;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == minCurrentStation) {
            currentStation = maxCurrentStation;
        } else {
            currentStation--;
        }
    }

    public void increaseVolume() {
        if (currentVolume == maxCurrentVolume) {
            currentVolume = maxCurrentVolume;
        } else {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume <= minCurrentVolume) {
            currentVolume = minCurrentVolume;
        } else {
            currentVolume--;
        }
    }
}