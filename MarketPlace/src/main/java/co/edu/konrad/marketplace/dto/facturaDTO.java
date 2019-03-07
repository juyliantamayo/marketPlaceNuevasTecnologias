/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.marketplace.dto;

import co.edu.konrad.marketplace.entities.carritoEntity;
import co.edu.konrad.marketplace.entities.facturaEntity;
import java.util.Date;

/**
 *
 * @author Ingenieria
 */
public class facturaDTO {

    private Long idFactura;
    private Long totalFactura;
    private Date fecha;
    private String medioPago;
    private carritoEntity idCarrito;

    public facturaDTO(facturaEntity fac) {
        this.idFactura = fac.getIdFactura();
        this.totalFactura = fac.getTotalFactura();
        this.fecha = fac.getFecha();
        this.medioPago = fac.getMedioPago();
        this.idCarrito = fac.getIdCarrito();
    }
    public facturaEntity toEntity(){
    facturaEntity fac=new facturaEntity();
    fac.setIdFactura(idFactura);
    fac.setTotalFactura(totalFactura);
    fac.setFecha(fecha);
    fac.setMedioPago(medioPago);
    fac.setIdCarrito(idCarrito);
    return fac;
    }
    
    public Long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Long idFactura) {
        this.idFactura = idFactura;
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

    public carritoEntity getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(carritoEntity idCarrito) {
        this.idCarrito = idCarrito;
    }

}
