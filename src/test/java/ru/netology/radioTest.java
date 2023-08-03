package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class radioTest {
    @Test
    public void nowStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nowStation5() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void newStation15() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        return;
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        ;
        radio.next();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void nextStationAfter9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        ;
        radio.prev();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void prevStationAfter0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        ;
        radio.prev();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void nowVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void nowVolume50() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void newVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void nexVolumeAfter55() {
        Radio radio = new Radio();
        radio.setCurrentVolume(55);
        radio.increaseVolume();
        assertEquals(56, radio.getCurrentVolume());
    }

    @Test
    public void newVolumeAfter99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        ;
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void newVolumeUnder0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void newVolumeUnder100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.reduceVolume();
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void newVolumeUnder50() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.reduceVolume();
        assertEquals(49, radio.getCurrentVolume());
    }
}