package com.icesi.edu.shop.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FacturaDTO {

    private int numFactura;

    private int idCliente;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date fecha;

}
