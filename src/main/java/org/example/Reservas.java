package org.example;

import java.time.LocalTime;


public class Reservas {
    private int id;  // Corregido: "Id" a "id"
    private String nombreCliente;
    private LocalTime horaReserva; // Cambiado a LocalTime
    private LocalTime horaFin;     // Nuevo campo
    private int numeroPersonas;
    private int numeroMesa;
    private String fechaReserva;

    // Constructor con todos los parámetros
    public Reservas(int id, String nombreCliente, LocalTime horaReserva, LocalTime horaFin, int numeroPersonas, int numeroMesa, String fechaReserva) {
        this.id = id;  // Añadido: Inicializar "id"
        this.nombreCliente = nombreCliente;
        this.horaReserva = horaReserva;
        this.horaFin = horaFin;
        this.numeroPersonas = numeroPersonas;
        this.numeroMesa = numeroMesa;
        this.fechaReserva = fechaReserva;
    }

    public Reservas( int numeroMesa, LocalTime horaReserva, LocalTime horaFin, String fechaReserva) {
        this.numeroMesa = numeroMesa;
        this.horaReserva = horaReserva;
        this.horaFin = horaFin;
        this.fechaReserva = fechaReserva;
    }


    public int getId() {  // Añadido: Getter para "id"
        return id;
    }

    public void setId(int id) {  // Añadido: Setter para "id"
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public LocalTime getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(LocalTime horaReserva) {
        this.horaReserva = horaReserva;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

}
