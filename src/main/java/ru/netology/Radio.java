package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int minCurrentStation = 0;
    private int maxCurrentStation = 9;
    private int minCurrentVolume = 0;
    private int maxCurrentVolume = 100;
    private int currentStation = minCurrentStation;
    private int currentVolume = minCurrentVolume;

    public Radio(int numRadio, int sizeVolume) {
        currentStation = numRadio;

        currentVolume = sizeVolume;
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