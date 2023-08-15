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
    public void setNowParam() {
        Radio radio = new Radio(5, 73);
        assertEquals(5, radio.getCurrentStation());
        assertEquals(73, radio.getCurrentVolume());
    }

    @Test
    public void setMaxParam() {
        Radio radio = new Radio(9, 100);
        assertEquals(9, radio.getCurrentStation());
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void setMinParam() {
        Radio radio = new Radio(0, 0);
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void setNegativeParam() {
        Radio radio = new Radio(-1, -1);
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getCurrentVolume());
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
    public void changeParamNowToNegative() {
        Radio radio = new Radio(7, 50);
        radio.setCurrentStation(-5);
        radio.setCurrentVolume(-75);
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void changeParamNowToExceeded() {
        Radio radio = new Radio(7, 50);
        radio.setCurrentStation(15);
        radio.setCurrentVolume(175);
        assertEquals(9, radio.getCurrentStation());
        assertEquals(100, radio.getCurrentVolume());
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
    public void countSattionNewParam() {
        Radio radio = new Radio(25);
        radio.setCurrentStation(15);
        assertEquals(15, radio.getCurrentStation());
    }

    @Test
    public void countSattionMaxStation() {
        Radio radio = new Radio(190);
        radio.setCurrentStation(189);
        assertEquals(189, radio.getCurrentStation());
    }

    @Test
    public void nextStationAfterMaxCountStation() {
        Radio radio = new Radio(190);
        radio.setCurrentStation(189);
        radio.next();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setNewWrongParam() {
        Radio radio = new Radio(6, 56);
        radio.setCurrentStation(15);
        radio.setCurrentVolume(115);
        assertEquals(9, radio.getCurrentStation());
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void setMaxCurrentStation() {
        Radio radio = new Radio(10);
        assertEquals(9, radio.getMaxCurrentStation());
    }

    @Test
    public void setMinCurrentStation() {
        Radio radio = new Radio(10);
        assertEquals(0, radio.getMinCurrentStation());
    }

    @Test
    public void setNewMaxWrongParam() {
        Radio radio = new Radio(6, 56);
        radio.setCurrentStation(15);
        radio.setCurrentVolume(115);
        assertEquals(9, radio.getCurrentStation());
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void setNewMimWrongParam() {
        Radio radio = new Radio(6, 56);
        radio.setCurrentStation(-10);
        radio.setCurrentVolume(-110);
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setNewMinusParam() {
        Radio radio = new Radio(-6, -56);
        assertEquals(0, radio.getMinCurrentStation());
        assertEquals(0, radio.getMinCurrentVolume());
    }

    @Test
    public void maxCurrentStation() {
        Radio radio = new Radio();
        assertEquals(9, radio.getMaxCurrentStation());
    }

    @Test
    public void nextAfterMaxCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxCurrentStation());
        assertEquals(9, radio.getMaxCurrentStation());
    }
}




