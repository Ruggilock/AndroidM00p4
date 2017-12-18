package com.absortio.m00p4.model;


/**
 * Created by ruggi on 11/21/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Kardex {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("lote")
    @Expose
    private Integer lote;
    @SerializedName("bloque")
    @Expose
    private Integer bloque;
    @SerializedName("motivooperacion")
    @Expose
    private Integer motivooperacion;
    @SerializedName("fechaoperacion")
    @Expose
    private String fechaoperacion;
    @SerializedName("cantidad")
    @Expose
    private Integer cantidad;
    @SerializedName("stockfisico")
    @Expose
    private Integer stockfisico;
    @SerializedName("descripcion")
    @Expose
    private String descripcion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLote() {
        return lote;
    }

    public void setLote(Integer lote) {
        this.lote = lote;
    }

    public Integer getBloque() {
        return bloque;
    }

    public void setBloque(Integer bloque) {
        this.bloque = bloque;
    }

    public Integer getMotivooperacion() {
        return motivooperacion;
    }

    public void setMotivooperacion(Integer motivooperacion) {
        this.motivooperacion = motivooperacion;
    }

    public String getFechaoperacion() {
        return fechaoperacion;
    }

    public void setFechaoperacion(String fechaoperacion) {
        this.fechaoperacion = fechaoperacion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getStockfisico() {
        return stockfisico;
    }

    public void setStockfisico(Integer stockfisico) {
        this.stockfisico = stockfisico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Kardex{" +
                "id=" + id +
                ", lote=" + lote +
                ", bloque=" + bloque +
                ", motivooperacion=" + motivooperacion +
                ", fechaoperacion=" + fechaoperacion +
                ", cantidad=" + cantidad +
                ", stockfisico=" + stockfisico +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}