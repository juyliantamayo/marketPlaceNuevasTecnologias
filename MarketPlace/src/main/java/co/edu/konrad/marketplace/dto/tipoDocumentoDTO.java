/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.marketplace.dto;

import co.edu.konrad.marketplace.entities.tipoDocumentoEntity;

/**
 *
 * @author Ingenieria
 */
public class tipoDocumentoDTO {

    private Long idTipoDucumento;
    private String nombreTipoDoc;

    public tipoDocumentoDTO(tipoDocumentoEntity tipodo) {
        this.idTipoDucumento = tipodo.getIdTipoDucumento();
        this.nombreTipoDoc = tipodo.getNombreTipoDoc();
    }
    public tipoDocumentoEntity toEntity(){
    tipoDocumentoEntity tipodo = new tipoDocumentoEntity();
    tipodo.setIdTipoDucumento(idTipoDucumento);
    tipodo.setNombreTipoDoc(nombreTipoDoc);
    return tipodo;
    }
    
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
