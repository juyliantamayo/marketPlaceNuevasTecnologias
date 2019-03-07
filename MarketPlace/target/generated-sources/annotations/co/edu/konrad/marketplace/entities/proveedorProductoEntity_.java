package co.edu.konrad.marketplace.entities;

import co.edu.konrad.marketplace.entities.productoEntity;
import co.edu.konrad.marketplace.entities.proveedorEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-06T00:17:15")
@StaticMetamodel(proveedorProductoEntity.class)
public class proveedorProductoEntity_ { 

    public static volatile SingularAttribute<proveedorProductoEntity, Long> idProveerdorProducto;
    public static volatile SingularAttribute<proveedorProductoEntity, proveedorEntity> idProveedor;
    public static volatile SingularAttribute<proveedorProductoEntity, productoEntity> idProducto;

}