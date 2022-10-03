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
public class ClienteDTO {

    private int id;

    private String nombre;

    private String apellido;

    private String direccion;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date fechaNacimiento;

    private String telefono;

    private String email;

    private String categoria;

}
