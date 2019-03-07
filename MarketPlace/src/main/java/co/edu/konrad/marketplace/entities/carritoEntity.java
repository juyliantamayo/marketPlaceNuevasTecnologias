/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.marketplace.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * Entidad carrito
 *
 * @author Julian T.
 */
@Entity
public class carritoEntity implements Serializable {

    /*
    *llave primaria 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_carrito")
    private Long idCarrito;
   
    /*
    *definicion de variable cantidad
     */
    @Column(name = "cantidad")
    private long cantidad;
    /*
    *definicion de variable valor total
     */
    @Column(name = "valor_total")
    private double valorTotal;
    
    /*
    * definicion de variable foranea cliente
     */
    @ManyToOne
    @JoinColumn(name = "cliente")
    private clienteEntity idCliente;
    /*
    *definicion de variable foranea many to one producto
     */
    @ManyToOne
    @JoinColumn(name = "producto")
    private productoEntity idProducto;

    public carritoEntity() {
    }

    public Long getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(Long idCarrito) {
        this.idCarrito = idCarrito;
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

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    
}
