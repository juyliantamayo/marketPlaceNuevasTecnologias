/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.marketplace.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * Entidad Producto
 *
 * @author Julian T.
 */
@Entity
public class productoEntity implements Serializable {

    /*
    *llave primaria 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_producto")
    private Long idProducto;
    /*
    *definicion de variable nombre del producto
     */
    @Column(name = "nombre_producto")
    private String nombreProducto;
    /*
    *definicion de variable marca del producto
     */
    @Column(name = "marca_producto")
    private String marca;
    /*
    *definicion de variable valor unitario 
     */
    @Column(name = "valor_unitario", nullable = false)
    private Long valorUnitario;

    public productoEntity() {
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Long getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Long valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

}
