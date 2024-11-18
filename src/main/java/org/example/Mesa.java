package org.example;

public class Mesa {

    private int id;
    private int capacidad;
    private boolean estaDisponible;
    private Reservas reservacionActual;

    // Constructor
    public Mesa(int id, int capacidad) {
        this.id = id;
        this.capacidad = capacidad;
        this.estaDisponible = true; // Al inicio, todas las mesas están disponibles
        this.reservacionActual = null;
    }

    // Método para asignar una reservación a la mesa
    public void asignarReservacion(Reservas reservacion) {
        if (estaDisponible && reservacion != null) {
            this.reservacionActual = reservacion;
            this.estaDisponible = false;
        }
    }

    // Método para liberar la mesa y dejarla disponible
    public void liberarMesa() {
        this.reservacionActual = null;
        this.estaDisponible = true;
    }

    // Método para verificar si la mesa está disponible
    public boolean esDisponible() {
        return estaDisponible;
    }

    // Método para obtener la capacidad de la mesa
    public int obtenerCapacidad() {
        return capacidad;
    }

    // Método para obtener el identificador de la mesa
    public int obtenerId() {
        return id;
    }

    // Método para obtener la reservación actual asignada a la mesa
    public Reservas obtenerReservacionActual() {
        return reservacionActual;
    }
}
