package com.icesi.edu.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DetalleDTO {

    private int numDetalle;

    private int numFactura;

    private int idProducto;

    private int cantidad;

    private double precio;

}
