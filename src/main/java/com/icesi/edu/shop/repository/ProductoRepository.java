package com.icesi.edu.shop.repository;

import com.icesi.edu.shop.model.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository<Producto, Integer> {
}
