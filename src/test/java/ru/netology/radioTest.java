package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class radioTest {
    @Test
    public void nowStation() {
        Radio radio = new Radio();
        radio.currentStation = radio.getCurrentStation();
        assertEquals(0, radio.currentStation);
    }

    @Test
    public void nowStation5() {
        Radio radio = new Radio();
        radio.currentStation = 5;
        assertEquals(5, radio.currentStation);
    }

    @Test
    public void newStation15() {
        Radio radio = new Radio();
        radio.currentStation = 15;
        return;
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.currentStation = 5;
        radio.next();
        assertEquals(6, radio.currentStation);
    }

    @Test
    public void nextStationAfter9() {
        Radio radio = new Radio();
        radio.currentStation = 9;
        radio.next();
        assertEquals(0, radio.currentStation);
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.currentStation = 7;
        radio.prev();
        assertEquals(6, radio.currentStation);
    }

    @Test
    public void prevStationAfter0() {
        Radio radio = new Radio();
        radio.currentStation = 0;
        radio.prev();
        assertEquals(9, radio.currentStation);
    }

    @Test
    public void nowVolume() {
        Radio radio = new Radio();
        radio.currentVolume = radio.getCurrentVolume();
        assertEquals(0, radio.currentVolume);
    }

    @Test
    public void nowVolume50() {
        Radio radio = new Radio();
        radio.currentVolume = 50;
        assertEquals(50, radio.currentVolume);
    }

    @Test
    public void newVolume100() {
        Radio radio = new Radio();
        radio.currentVolume = 100;
        radio.increaseVolume();
        assertEquals(100, radio.currentVolume);
    }

    @Test
    public void nexVolumeAfter55() {
        Radio radio = new Radio();
        radio.currentVolume = 55;
        radio.increaseVolume();
        assertEquals(56, radio.currentVolume);
    }

    @Test
    public void newVolumeAfter99() {
        Radio radio = new Radio();
        radio.currentVolume = 99;
        radio.increaseVolume();
        assertEquals(100, radio.currentVolume);
    }

    @Test
    public void newVolumeUnder0() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.reduceVolume();
        assertEquals(0, radio.currentVolume);
    }

    @Test
    public void newVolumeUnder100() {
        Radio radio = new Radio();
        radio.currentVolume = 100;
        radio.reduceVolume();
        assertEquals(99, radio.currentVolume);
    }

    @Test
    public void newVolumeUnder50() {
        Radio radio = new Radio();
        radio.currentVolume = 50;
        radio.reduceVolume();
        assertEquals(49, radio.currentVolume);
    }
}