package com.icesi.edu.shop.model;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DetalleLlaveCompuesta implements Serializable {
    private int numDetalle;
    private int numFactura;
}
