package co.edu.konrad.marketplace.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * entidad proveedor producto
 *
 * @author Julian T.
 */
@Entity
public class proveedorProductoEntity implements Serializable {

    /*
    *llave primaria 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_prov_prod")
    private Long idProveerdorProducto;
    /*
    *definicion de variable many to one proveedor
     */
    @ManyToOne
    @JoinColumn(name = "proveedor")
    private proveedorEntity idProveedor;

    /*
    *definicion de variable foranea many to one producto
     */
    @ManyToOne
    @JoinColumn(name = "producto")
    private productoEntity idProducto;

    public proveedorProductoEntity() {
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
