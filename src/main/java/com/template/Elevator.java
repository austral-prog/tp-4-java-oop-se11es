package com.template;

public class Elevator {
    private int currentFloor;
    private final int minFloor;
    private final int maxFloor;
    private final int maxPassengers;
    private int currentPassengers;

    // Constructor
    public Elevator(int minFloor, int maxFloor, int maxPassengers) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.maxPassengers = maxPassengers;
        this.currentFloor = minFloor;  // Por defecto, el ascensor comienza en el piso mínimo
        this.currentPassengers = 0;    // Inicialmente, no hay pasajeros
    }

    // Mover el ascensor a un piso solicitado
    public void moveToFloor(int floor) {
        if (floor >= minFloor && floor <= maxFloor) {
            this.currentFloor = floor;
        }
    }

    // Obtener el piso actual del ascensor
    public int getCurrentFloor() {
        return currentFloor;
    }

    // Agregar un pasajero si no se ha alcanzado el límite
    public void addPassenger() {
        if (currentPassengers < maxPassengers) {
            currentPassengers++;
        }
    }

    // Remover un pasajero si hay alguien en el ascensor
    public void removePassenger() {
        if (currentPassengers > 0) {
            currentPassengers--;
        }
    }

    // Obtener el número de pasajeros actuales
    public int getPassengerCount() {
        return currentPassengers;
    }
}
