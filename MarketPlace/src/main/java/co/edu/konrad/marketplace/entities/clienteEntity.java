/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.marketplace.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Julian T.
 */
@Entity
public class clienteEntity  implements Serializable{
     /*
    *llave primaria 
    */
    @Id
     @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id_Cliente")
    private long idCliente;
    /*
    *definicion de variable nombre del cliente
    */
    @Column(name = "nombre_cliente")
    private String nombreCliente;
    /*
    *definicion de variable apellido del cliente
    */
    @Column(name = "apellido_cliente")
    private String apellidoCliente;
    /*
    *definicion de variable fecha de nacimiento del cliente
    */
   
    @Column (name = "fecha_nacimiento")
    private Date fecha_nacimiento;
    /*
    *definicion de variable numero de documento del cliente
    */
    @Column (name = "numero_documento")
    private long numero_documento;
    /*
    *definicion de variable foranea many to one tipoDocumento
     */
    @ManyToOne 
    @JoinColumn (name = "tipoDocumento")
    private tipoDocumentoEntity tipo_documento;

    public clienteEntity() {
    }

    
    
    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
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

   
    

    public long getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(int numero_documento) {
        this.numero_documento = numero_documento;
    }

    public tipoDocumentoEntity getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(tipoDocumentoEntity tipo_documento) {
        this.tipo_documento = tipo_documento;
    }
    
    
}
