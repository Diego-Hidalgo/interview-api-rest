package com.icesi.edu.shop.repository;

import com.icesi.edu.shop.model.Detalle;
import com.icesi.edu.shop.model.DetalleLlaveCompuesta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleRepository extends CrudRepository<Detalle, DetalleLlaveCompuesta> {

}
