package com.icesi.edu.shop.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Table(name = "`detalle`")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@IdClass(DetalleLlaveCompuesta.class)
public class Detalle {

    @Id
    //@Column(name = "num_detalle")
    private int numDetalle;

    @Id
    //@Column(name = "id_factura")
    private int numFactura;

    @Column(name = "id_producto")
    private int idProducto;

    private int cantidad;

    private double precio;

}
