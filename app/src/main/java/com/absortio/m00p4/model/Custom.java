package com.absortio.m00p4.model;

/**
 * Created by ruggi on 11/24/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Custom {


    @SerializedName("idKardex")
    @Expose
    private String idKardex;
    @SerializedName("nombreProducto")
    @Expose
    private String nombreProducto;
    @SerializedName("cantidad")
    @Expose
    private String cantidad;
    @SerializedName("motivoOperacion")
    @Expose
    private String motivoOperacion;
    @SerializedName("tipoOperacion")
    @Expose
    private String tipoOperacion;

    public String getIdKardex() {
        return idKardex;
    }

    public void setIdKardex(String idKardex) {
        this.idKardex = idKardex;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getMotivoOperacion() {
        return motivoOperacion;
    }

    public void setMotivoOperacion(String motivoOperacion) {
        this.motivoOperacion = motivoOperacion;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }
}