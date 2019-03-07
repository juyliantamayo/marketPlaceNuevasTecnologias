/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.marketplace.dto;

import co.edu.konrad.marketplace.entities.carritoEntity;
import co.edu.konrad.marketplace.entities.clienteEntity;
import co.edu.konrad.marketplace.entities.productoEntity;

/**
 *
 * @author Ingenieria
 */
public class carritoDTO {
     private Long idCarrito;
     private Long cantidad;
     private double valorTotal;
     private clienteEntity idCliente; 
     private productoEntity idProducto;
     
    public carritoDTO(carritoEntity carri) {
        this.idCarrito = carri.getIdCarrito();
        this.cantidad = carri.getCantidad();
        this.valorTotal = carri.getValorTotal();
        this.idCliente = carri.getIdCliente();
        this.idProducto = carri.getIdProducto();
    }
    public carritoEntity toEntity(){
    carritoEntity carri=new carritoEntity();
    carri.setIdCarrito(this.idCarrito);
    carri.setCantidad(this.cantidad);
    carri.setValorTotal(this.valorTotal);
    carri.setIdCliente(this.idCliente);
    carri.setIdProducto(this.idProducto);
    return carri;
    }

     
    public Long getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(Long idCarrito) {
        this.idCarrito = idCarrito;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public clienteEntity getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(clienteEntity idCliente) {
        this.idCliente = idCliente;
    }

    public productoEntity getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(productoEntity idProducto) {
        this.idProducto = idProducto;
    }
}
