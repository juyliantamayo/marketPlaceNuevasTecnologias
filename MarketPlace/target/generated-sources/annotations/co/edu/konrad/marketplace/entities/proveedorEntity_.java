package co.edu.konrad.marketplace.entities;

import co.edu.konrad.marketplace.entities.tipoDocumentoEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-06T00:17:15")
@StaticMetamodel(proveedorEntity.class)
public class proveedorEntity_ { 

    public static volatile SingularAttribute<proveedorEntity, String> nombreProveedor;
    public static volatile SingularAttribute<proveedorEntity, tipoDocumentoEntity> tipo_documento;
    public static volatile SingularAttribute<proveedorEntity, Long> idProveedor;

}