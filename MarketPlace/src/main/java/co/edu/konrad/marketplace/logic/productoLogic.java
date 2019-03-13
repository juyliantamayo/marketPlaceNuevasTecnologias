/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.marketplace.logic;

import co.edu.konrad.marketplace.entities.productoEntity;
import co.edu.konrad.marketplace.persistence.productoPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * manejar la logica de negocios de producto
 *
 * @author Julian T
 */
@Stateless
public class productoLogic {

    @Inject
    private productoPersistence persistence;
    
    public List<productoEntity> obtenerProductos() {
        List<productoEntity> productos = persistence.encontrarTodos();
        return productos;
    }
    
    public productoEntity obtenerProducto(Long Id) throws IllegalAccessException {
        productoEntity producto = persistence.encontrarPorId(Id);
        if (producto == null) {
            throw new IllegalAccessException("el producto seleccionado no existe");
        }
        return producto;
    }

    public productoEntity crearProducto(productoEntity producto) {
        persistence.inserta(producto);
        return producto;
    }

    public productoEntity actualizarProducto(Long id, productoEntity producto) {
        productoEntity productoActualizar = persistence.actualizar(producto);
        return productoActualizar;
    }

    public void eliminarProducto(Long id) {
        persistence.eliminar(id);
    }
}
