package org.example;

import java.time.LocalDate;


public class ClientePila{
    private int id;
    private String nombreCliente;
    private int tiempoEspera;
    private LocalDate fechaEntrada;

    // Constructor para crear un nuevo objeto PilaEspera sin ID (útil para nuevas inserciones)
    public ClientePila(String nombreCliente, int tiempoEspera) {
        this.nombreCliente = nombreCliente;
        this.tiempoEspera = tiempoEspera;
        this.fechaEntrada = LocalDate.now(); // Se establece la fecha y hora actual por defecto
    }

    // Constructor para crear un objeto PilaEspera con ID (útil para recuperaciones desde la BD)
    public ClientePila(int id, String nombreCliente, int tiempoEspera, LocalDate fechaEntrada) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.tiempoEspera = tiempoEspera;
        this.fechaEntrada = fechaEntrada;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

}
