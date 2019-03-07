
package co.edu.konrad.marketplace.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *Entidad tipo de documento
 *
 * @author Julian T.
 */

@Entity
public class tipoDocumentoEntity implements Serializable{
     /*
    *llave primaria 
    */
    @Id
     @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id_tipo_documento")
    private Long idTipoDucumento;
    
    
    /*
    *definicion de variable nombre del tipo del documento
    */
    @Column(name="nombre_tipo_doc")
    private String nombreTipoDoc;

    public Long getIdTipoDucumento() {
        return idTipoDucumento;
    }

    public void setIdTipoDucumento(Long idTipoDucumento) {
        this.idTipoDucumento = idTipoDucumento;
    }

    public String getNombreTipoDoc() {
        return nombreTipoDoc;
    }

    public void setNombreTipoDoc(String nombreTipoDoc) {
        this.nombreTipoDoc = nombreTipoDoc;
    }
    
    
}
