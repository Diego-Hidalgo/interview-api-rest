package com.icesi.edu.shop.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "`factura`")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Factura {

    @Id
    @Column(name = "num_factura")
    private int numFactura;

    @Column(name = "id_cliente")
    private int idCliente;

    private Date fecha;

}
