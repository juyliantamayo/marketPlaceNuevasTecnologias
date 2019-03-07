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
 * Entidad de proveedor
 *
 * @author Julian T.
 */
@Entity
public class proveedorEntity implements Serializable {

    /*
    *llave primaria 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_proveedor")
    private long idProveedor;
    /*
    *definicion de variable nombre proveedor 
     */
    @Column(name = "nombre_proveedor")
    private String nombreProveedor;
    /*
    *definicion de variable foranea many to one tipo de documento
     */
    @ManyToOne
    @JoinColumn(name = "tipoDocumento")
    private tipoDocumentoEntity tipo_documento;

    public proveedorEntity() {
    }

    public long getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(long idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public tipoDocumentoEntity getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(tipoDocumentoEntity tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

}
