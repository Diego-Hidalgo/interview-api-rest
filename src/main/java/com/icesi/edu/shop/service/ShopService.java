package com.icesi.edu.shop.service;

import com.icesi.edu.shop.model.Cliente;
import com.icesi.edu.shop.model.Detalle;
import com.icesi.edu.shop.model.Factura;
import com.icesi.edu.shop.model.Producto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface ShopService {

    Detalle getDetalle(@PathVariable int idDetalle, @PathVariable int idFactura);

    Cliente createCliente(@RequestBody Cliente clienteDTO);

    Producto createProducto(@RequestBody Producto productoDTO);

    Factura createFactura(@RequestBody Factura facturaDTO);

    Detalle createDetalle(@RequestBody Detalle detalleDTO);

}
