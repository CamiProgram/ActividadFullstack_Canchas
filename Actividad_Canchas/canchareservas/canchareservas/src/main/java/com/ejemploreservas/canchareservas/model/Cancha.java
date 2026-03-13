package com.ejemploreservas.canchareservas.model;

public class Cancha {

    private Long id;
    private String nombre;
    private String tipo;
    private Long precioxhora;

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Long getPrecioxhora() {
        return precioxhora;
    }
    public void setPrecioxhora(Long precioxhora) {
        this.precioxhora = precioxhora;
    }

    
    public Cancha() {
    }

    public Cancha(Long id, String nombre, String tipo, Long precioxhora) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioxhora = precioxhora;
    }

    



}
