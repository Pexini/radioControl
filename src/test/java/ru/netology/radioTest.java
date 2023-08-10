package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class radioTest {

    @Test
    public void getTempNew() {
        Radio radio = new Radio(6, 35);

        assertEquals(0, radio.getMinCurrentStation());
        assertEquals(9, radio.getMaxCurrentStation());
        assertEquals(0, radio.getMinCurrentVolume());
        assertEquals(100, radio.getMaxCurrentVolume());
        assertEquals(6, radio.getCurrentStation());
        assertEquals(35, radio.getCurrentVolume());
    }

    @Test
    public void getNowParam() {
        Radio radio = new Radio(5, 73);
        radio.getCurrentStation();
        radio.getCurrentVolume();
        assertEquals(5, radio.getCurrentStation());
        assertEquals(73, radio.getCurrentVolume());
    }

    @Test
    public void changeParamNow() {
        Radio radio = new Radio(7, 50);
        radio.setCurrentStation(5);
        radio.setCurrentVolume(75);
        assertEquals(5, radio.getCurrentStation());
        assertEquals(75, radio.getCurrentVolume());
    }


    @Test
    public void newParamBeforeMax() {
        Radio radio = new Radio(8, 99);
        radio.next();
        radio.increaseVolume();
        assertEquals(9, radio.getCurrentStation());
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void newParamBeforeMin() {
        Radio radio = new Radio(-1, -1);
        radio.next();
        radio.increaseVolume();
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void newParamAfterMax() {
        Radio radio = new Radio(9, 100);
        radio.next();
        radio.increaseVolume();
        assertEquals(0, radio.getCurrentStation());
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void newParamUnderMax() {
        Radio radio = new Radio(9, 100);
        radio.prev();
        radio.reduceVolume();
        assertEquals(8, radio.getCurrentStation());
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void newParamUnderMin() {
        Radio radio = new Radio(0, 0);
        radio.prev();
        radio.reduceVolume();
        assertEquals(9, radio.getCurrentStation());
        assertEquals(0, radio.getCurrentVolume());
    }
}


