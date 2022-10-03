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
@Table(name = "`cliente`")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @Column(name = "id_cliente")
    private int id;

    private String nombre;

    private String apellido;

    private String direccion;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    private String telefono;

    private String email;

    private String categoria;

}
