/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.marketplace.persistence;

import co.edu.konrad.marketplace.entities.productoEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *manejador tabla factura
*
 * @author Julian T.
 */
@Stateless
public class facturaPersistance {
     /*
    *manejador de entidad
    */
    @PersistenceContext(unitName="MarketPlacePU")
    protected EntityManager em;
   /*
    *Buscar todas las entidades
    */
    public List<productoEntity> encontrarTodos(){
        Query todos =em.createQuery("select p from ProductoEntity p");
        return todos.getResultList();
    }
    /*
    *buscar una entidad por su id
    */
    public productoEntity encontrarPorId(Long id ){
        return em.find(productoEntity.class, id);
    }
    /*
    *insertar un registro a la tabla 
    */
    public productoEntity inserta(productoEntity entity){
        em.persist(entity);
        return entity;
    }
    /*
    *actualizar los datos de una endtidad
    */
    public productoEntity actualizar(productoEntity entity){
        return em.merge(entity);
    }
    /*
    *eliminar por id una entidad
    */
    public void eliminar(Long Id){
    productoEntity productoEliminar=em.find(productoEntity.class, Id);
    em.remove(productoEliminar);
    }
            
}
