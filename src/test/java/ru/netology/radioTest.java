package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
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

        assertEquals(5, radio.getCurrentStation());
        assertEquals(73, radio.getCurrentVolume());
    }

    @Test
    public void changeParamNow() {
        Radio radio = new Radio(0, 0);
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
        radio.setCurrentVolume(75);
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
        assertEquals(1, radio.getCurrentStation());
        assertEquals(1, radio.getCurrentVolume());
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

    @Test
    public void returnAfter() {
        Radio radio = new Radio(0, 0);
        radio.prev();
        radio.reduceVolume();
        assertEquals(9, radio.getCurrentStation());
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void newParamMAxBoundary() {
        Radio radio = new Radio(10, 101);
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void newParamMinBoundary() {
        Radio radio = new Radio(-1, -1);
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setMaxParamWhenNull() {
        Radio radio = new Radio(0,0);
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
        radio.setCurrentVolume(99);
        assertEquals(99, radio.getCurrentVolume());
    }
    @Test
    public void setMinCurrentParam() {
        Radio radio = new Radio(0,0);
        radio.setCurrentStation(radio.getCurrentStation());
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentVolume(radio.getCurrentVolume());
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void setMaxCurrentParam() {
        Radio radio = new Radio(9,99);
        radio.setCurrentStation(radio.getCurrentStation());
        assertEquals(9, radio.getCurrentStation());
        radio.setCurrentVolume(radio.getCurrentVolume());
        assertEquals(99, radio.getCurrentVolume());
    }
    @Test
    public void setMaxParamWhenMin() {
        Radio radio = new Radio(0,0);
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
        radio.setCurrentVolume(99);
        assertEquals(99, radio.getCurrentVolume());
    }
    @Test
    public void setInvalidStationLessThanMin() {
        Radio radio = new Radio(0,0);
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void setInvalidStationGreaterThanMax() {
        Radio radio = new Radio(0,0);
        radio.setCurrentStation(+1);
        assertEquals(1, radio.getCurrentStation());
        radio.setCurrentVolume(+1);
        assertEquals(1, radio.getCurrentVolume());
    }
    @Test
    public void setInvalidStationGreaterMax() {
        Radio radio = new Radio(0,0);
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentVolume(101);
        assertEquals(0, radio.getCurrentVolume());
    }
}