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
 *Entidad factura
 *
 * @author Julian T.
 */
@Entity
public class facturaEntity implements Serializable {

    /*
    *llave primaria 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_factura")
    private Long idFactura;
    
    /*
    *definicion de variable total de Factura
     */
    @Column(name = "total_factura")
    private Long totalFactura;
     /*
    *definicion de variable fecha de la factura
    */
    @Column (name = "fecha")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
     /*
    *definicion de variable fecha de la factura
    */
    @Column (name = "medio_pago")
    private String medioPago;
    
    /*
    *definicion de variable foranea many to one cliente
     */
    @ManyToOne
    @JoinColumn(name = "carrito")
    private carritoEntity idCarrito;

    public facturaEntity() {
    }

    public Long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Long idFactura) {
        this.idFactura = idFactura;
    }

    public carritoEntity getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(carritoEntity idCarrito) {
        this.idCarrito = idCarrito;
    }

    public Long getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(Long totalFactura) {
        this.totalFactura = totalFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }
    
    
}
