package com;

public class Lift {
    String liftNumber;
    int currentFloor;
    int capacity;

    public String getLiftNumber() {
        return liftNumber;
    }

    public void setLiftNumber(String liftNumber) {
        this.liftNumber = liftNumber;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Lift{" +
                "liftNumber='" + liftNumber + '\'' +
                ", currentFloor=" + currentFloor +
                '}';
    }
}
