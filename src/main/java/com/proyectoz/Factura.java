package com.proyectoz;

import java.util.Date;

public class Factura {
    private Cliente cliente;
    private ItemFactura items;
    private Integer folio;
    private String descripcion;
    private Date fecha;

    public Factura(){}
    public Factura(Cliente cliente, ItemFactura items, Integer folio, String descripcion) {
        this.cliente = cliente;
        this.items = items;
        this.folio = folio;
        this.descripcion = descripcion;
    }
    public Factura(Cliente cliente, ItemFactura items, Integer folio, String descripcion, Date fecha) {
        this.cliente = cliente;
        this.items = items;
        this.folio = folio;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public ItemFactura getItems() {
        return items;
    }
    public Integer getFolio() {
        return folio;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public Date getFecha() {
        return fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setItems(ItemFactura items) {
        this.items = items;
    }
    public void setFolio(Integer folio) {
        this.folio = folio;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double calcularTotal(){
        return 2.2;
    }

    public String verDetalle(){
        return "completar-detalle";
    }
}
