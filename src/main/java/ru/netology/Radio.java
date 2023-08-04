package ru.netology;

public class Radio {
    private int minCurrentStation = 0;
    private int maxCurrentStation = 9;
    private int minCurrentVolume = 0;
    private int maxCurrentVolume = 100;
    private int currentStation;
    private int currentVolume;

    public Radio() {
        this.currentStation = this.minCurrentStation;
        this.currentVolume = this.minCurrentVolume;
    }

    public Radio(int minCurrentStation, int maxCurrentStation, int minCurrentVolume, int maxCurrentVolume, int currentStation, int currentVolume) {
        this.currentStation = this.minCurrentStation;
        this.currentVolume = this.minCurrentVolume;
        this.minCurrentStation = minCurrentStation;
        this.maxCurrentStation = maxCurrentStation;
        this.minCurrentVolume = minCurrentVolume;
        this.maxCurrentVolume = maxCurrentVolume;
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
    }

    public int getMinCurrentStation() {
        return this.minCurrentStation;
    }

    public int getMaxCurrentStation() {
        return this.maxCurrentStation;
    }

    public int getMinCurrentVolume() {
        return this.minCurrentVolume;
    }

    public int getMaxCurrentVolume() {
        return this.maxCurrentVolume;
    }

    public int getCurrentStation() {
        return this.currentStation;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setMinCurrentStation(int minCurrentStation) {
        this.minCurrentStation = minCurrentStation;
    }

    public void setMaxCurrentStation(int maxCurrentStation) {
        this.maxCurrentStation = maxCurrentStation;
    }

    public void setMinCurrentVolume(int minCurrentVolume) {
        this.minCurrentVolume = minCurrentVolume;
    }

    public void setMaxCurrentVolume(int maxCurrentVolume) {
        this.maxCurrentVolume = maxCurrentVolume;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Radio)) {
            return false;
        } else {
            Radio other = (Radio) o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getMinCurrentStation() != other.getMinCurrentStation()) {
                return false;
            } else if (this.getMaxCurrentStation() != other.getMaxCurrentStation()) {
                return false;
            } else if (this.getMinCurrentVolume() != other.getMinCurrentVolume()) {
                return false;
            } else if (this.getMaxCurrentVolume() != other.getMaxCurrentVolume()) {
                return false;
            } else if (this.getCurrentStation() != other.getCurrentStation()) {
                return false;
            } else {
                return this.getCurrentVolume() == other.getCurrentVolume();
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Radio;
    }

    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = result * 59 + this.getMinCurrentStation();
        result = result * 59 + this.getMaxCurrentStation();
        result = result * 59 + this.getMinCurrentVolume();
        result = result * 59 + this.getMaxCurrentVolume();
        result = result * 59 + this.getCurrentStation();
        result = result * 59 + this.getCurrentVolume();
        return result;
    }

    public String toString() {
        int var10000 = this.getMinCurrentStation();
        return "Radio(minCurrentStation=" + var10000 + ", maxCurrentStation=" + this.getMaxCurrentStation() + ", minCurrentVolume=" + this.getMinCurrentVolume() + ", maxCurrentVolume=" + this.getMaxCurrentVolume() + ", currentStation=" + this.getCurrentStation() + ", currentVolume=" + this.getCurrentVolume() + ")";
    }
}
