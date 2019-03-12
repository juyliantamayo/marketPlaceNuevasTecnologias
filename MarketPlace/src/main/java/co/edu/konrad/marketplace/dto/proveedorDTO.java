/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.marketplace.dto;

import co.edu.konrad.marketplace.entities.proveedorEntity;
import co.edu.konrad.marketplace.entities.tipoDocumentoEntity;
/**
 *
 * @author Julian T.
 */
public class proveedorDTO {

    private  Long idProveedor;
    private String nombreProveedor;
    private tipoDocumentoEntity tipo_documento;

    public proveedorDTO(proveedorEntity pr) {
        this.idProveedor = pr.getIdProveedor() ;
        this.nombreProveedor = pr.getNombreProveedor();
        this.tipo_documento = pr.getTipo_documento();
    }
    public proveedorEntity toEntity(){
    proveedorEntity pr=new proveedorEntity();
    pr.setIdProveedor(this.idProveedor);
    pr.setNombreProveedor(this.nombreProveedor);
    pr.setTipo_documento(this.tipo_documento);
    return pr;
    }

    public Long getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Long idProveedor) {
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
