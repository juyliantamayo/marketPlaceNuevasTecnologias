/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.marketplace.dto;

import co.edu.konrad.marketplace.entities.clienteEntity;
import co.edu.konrad.marketplace.entities.tipoDocumentoEntity;
import java.util.Date;

/**
 *
 * @author Ingenieria
 */
public class clienteDTO {
     private Long idCliente;
     private String nombreCliente;
     private String apellidoCliente;
     private Date fecha_nacimiento;
     private Long numero_documento;
     private tipoDocumentoEntity tipo_documento;

    public clienteDTO(clienteEntity cli) {
        this.idCliente = cli.getIdCliente();
        this.nombreCliente = cli.getNombreCliente();
        this.apellidoCliente = cli.getApellidoCliente();
        this.fecha_nacimiento = cli.getFecha_nacimiento();
        this.numero_documento = cli.getNumero_documento();
        this.tipo_documento = cli.getTipo_documento();
    }
    public clienteEntity toEntity(){
    clienteEntity cli =new clienteEntity();
    cli.setIdCliente(idCliente);
    cli.setNombreCliente(nombreCliente);
    cli.setApellidoCliente(apellidoCliente);
    cli.setFecha_nacimiento(fecha_nacimiento);
    cli.setNumero_documento(numero_documento);
    cli.setTipo_documento(tipo_documento);
    return cli;
    }
     
     
    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Long getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(Long numero_documento) {
        this.numero_documento = numero_documento;
    }

    public tipoDocumentoEntity getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(tipoDocumentoEntity tipo_documento) {
        this.tipo_documento = tipo_documento;
    }
     
}
