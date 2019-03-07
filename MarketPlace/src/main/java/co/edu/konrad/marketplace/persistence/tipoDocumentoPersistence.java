/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.marketplace.persistence;

import co.edu.konrad.marketplace.entities.tipoDocumentoEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *manejador de la tabla tipo de documento
 *
 * @author Julian T.
 */

 @Stateless
public class tipoDocumentoPersistence {   
    /*
    *manejador de entidad
    */
    @PersistenceContext(unitName="MarketPlacePU")
    protected EntityManager em;
     /*
    *Buscar todas las entidades
    */
    public List<tipoDocumentoEntity> encontrarTodos(){
        Query todos =em.createQuery("select p from ProductoEntity p");
        return todos.getResultList();
    }
    /*
    *buscar una entidad por su id
    */
    public tipoDocumentoEntity encontrarPorId(Long id ){
        return em.find(tipoDocumentoEntity.class, id);
    }
     /*
    *insertar un registro a la tabla 
    */
    public tipoDocumentoEntity inserta(tipoDocumentoEntity entity){
        em.persist(entity);
        return entity;
    }
    /*
    *actualizar los datos de una endtidad
    */
    public tipoDocumentoEntity actualizar(tipoDocumentoEntity entity){
        return em.merge(entity);
    }
    /*
    *eliminar por id una entidad
    */
    public void eliminar(Long Id){
    tipoDocumentoEntity productoEliminar=em.find(tipoDocumentoEntity.class, Id);
    em.remove(productoEliminar);
    }
    
}
