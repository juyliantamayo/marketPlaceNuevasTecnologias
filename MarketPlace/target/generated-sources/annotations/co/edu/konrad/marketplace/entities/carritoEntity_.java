package co.edu.konrad.marketplace.entities;

import co.edu.konrad.marketplace.entities.clienteEntity;
import co.edu.konrad.marketplace.entities.productoEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-06T00:17:15")
@StaticMetamodel(carritoEntity.class)
public class carritoEntity_ { 

    public static volatile SingularAttribute<carritoEntity, Long> idCarrito;
    public static volatile SingularAttribute<carritoEntity, clienteEntity> idCliente;
    public static volatile SingularAttribute<carritoEntity, Double> valorTotal;
    public static volatile SingularAttribute<carritoEntity, Long> cantidad;
    public static volatile SingularAttribute<carritoEntity, productoEntity> idProducto;

}