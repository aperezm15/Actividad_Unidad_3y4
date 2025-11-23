package com.tienda.model;

public class Telefono {
    private int idTelefono; 
    private long telefono;
    private String tipoTelefono;
    

    public Telefono() {
    }
    

    public Telefono(long telefono, String tipoTelefono) {
        this.telefono = telefono;
        this.tipoTelefono = tipoTelefono;
    }


    public Telefono(int idTelefono, long telefono, String tipoTelefono) {
        this.idTelefono = idTelefono;
        this.telefono = telefono;
        this.tipoTelefono = tipoTelefono;
    }
    // Getters y Setters
    public int getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(int idTelefono) {
        this.idTelefono = idTelefono;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getTipoTelefono() {
        return tipoTelefono;
    }

    public void setTipoTelefono(String tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }
}