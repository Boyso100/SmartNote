package com.example.boyso996.smartphonenote.modelo;

/**
 * Created by BOYSO996 on 13/10/2017.
 */

public class Tarea {
    int id;
    String titulo;
    String descripcion;
    int tipo;
    String hora_fecha;

    public Tarea() {

    }


    public int getHora_fecha_vencimiento() {
        return hora_fecha_vencimiento;
    }

    public void setHora_fecha_vencimiento(int hora_fecha_vencimiento) {
        this.hora_fecha_vencimiento = hora_fecha_vencimiento;
    }

    private int hora_fecha_vencimiento;

    public Tarea(int id, String titulo, String descripcion,
                     int tipo, String hora_fecha, int hora_fecha_vencimiento) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.hora_fecha = hora_fecha;
        this.hora_fecha_vencimiento = hora_fecha_vencimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getHora_fecha() {
        return hora_fecha;
    }

    public void setHora_fecha(String hora_fecha) {
        this.hora_fecha = hora_fecha;
    }
}
