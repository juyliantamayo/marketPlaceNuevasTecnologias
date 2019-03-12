/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.marketplace.dto;
import co.edu.konrad.marketplace.entities.productoEntity;
import co.edu.konrad.marketplace.entities.proveedorEntity;
import co.edu.konrad.marketplace.entities.proveedorProductoEntity;
/**
 *
 * @author Ingenieria
 */
public class proveedorProductoDTO {

    private Long idProveerdorProducto;
    private proveedorEntity idProveedor;
    private productoEntity idProducto;

    public proveedorProductoDTO(proveedorProductoEntity prp) {
        this.idProveerdorProducto = prp.getIdProveerdorProducto();
        this.idProveedor = prp.getIdProveedor();
        this.idProducto = prp.getIdProducto();
    }
    public proveedorProductoEntity toEntity(){
    proveedorProductoEntity prp = new proveedorProductoEntity();
    prp.setIdProducto(idProducto);
    prp.setIdProveedor(idProveedor);
    prp.setIdProveerdorProducto(idProveerdorProducto);
    return prp;
    }
    
    public Long getIdProveerdorProducto() {
        return idProveerdorProducto;
    }

    public void setIdProveerdorProducto(Long idProveerdorProducto) {
        this.idProveerdorProducto = idProveerdorProducto;
    }

    public proveedorEntity getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(proveedorEntity idProveedor) {
        this.idProveedor = idProveedor;
    }

    public productoEntity getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(productoEntity idProducto) {
        this.idProducto = idProducto;
    }
    
    
}
