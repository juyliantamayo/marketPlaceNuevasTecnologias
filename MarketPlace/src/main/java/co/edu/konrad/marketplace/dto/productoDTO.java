/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.marketplace.dto;

import co.edu.konrad.marketplace.entities.productoEntity;

/**
 * Mapeo objeto relacional de la entidad procudto
 *
 * @author Julian T.
 */
public class productoDTO {

    private Long id;
    private String nombreProducto;
    private String marca;
    private Long valorUnitario;

    public productoDTO(productoEntity pro) {
        this.id = pro.getIdProducto();
        this.nombreProducto = pro.getNombreProducto();
        this.marca = pro.getMarca();
        this.valorUnitario = pro.getValorUnitario();
    }
    public productoEntity toEntity(){
        productoEntity prodEntity= new productoEntity();
        prodEntity.setIdProducto(this.id);
        prodEntity.setNombreProducto(this.nombreProducto);
        prodEntity.setMarca(this.marca);
        prodEntity.setValorUnitario(this.valorUnitario);
        return prodEntity;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
